package handong.csee.edu.othello;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Chat extends JPanel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JTextArea jta = new JTextArea(40,25);
	static JTextField jtf = new JTextField(25);
	static ServerBackground server;
	
	
	public Chat(ServerBackground server) {
		this.server = server;
		jtf.addActionListener(this);
		add(jta, BorderLayout.CENTER);
		add(jtf, BorderLayout.SOUTH);
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		//setVisible(true);
		//setBounds(650, 110, 350, 380);
		//setBackground(Color.orange);
		setSize(350, 380);
		//setVisible(true);
		//setTitle("messeger");
		
		server.setGui(this);
		server.setting();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String msg = jtf.getText()+"\n";
		jta.append("Jay-G : "+msg);
		System.out.println(jtf);
		server.sendMessage(msg);
		jtf.setText("");
	}

	public void appendMsg(String msg) {
		jta.append(msg);
		System.out.print("From Client : "+msg);
	}

}
