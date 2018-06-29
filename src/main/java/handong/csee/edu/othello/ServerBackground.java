package handong.csee.edu.othello;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerBackground {
	
    private ServerSocket serverSocket;
    private Socket socket;
    DataInputStream in;
    DataOutputStream out;
    Chat gui;
	private String msg;
    
    public final void setGui(Chat gui) {
    	this.gui=gui;
    }
    
    public void setting(){
        try {
            serverSocket = new ServerSocket(7778);
            System.out.println("서버 대기중...");
            socket = serverSocket.accept();
            System.out.println(socket.getInetAddress()+"에서 접속했습니다.");
            
            out = new DataOutputStream(socket.getOutputStream());
            in = new DataInputStream(socket.getInputStream());
            
            msg = in.readUTF();
            System.out.println("From Client : "+msg);
            gui.appendMsg(msg);
            
            while(in !=null) {
            	msg=in.readUTF();
            	gui.appendMsg(msg);
            }
            //out.writeUTF("Hello i'm stone1");
            //System.out.println("complete!!");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    

    public static void main(String[] args) {
    	
        ServerBackground serverBackground= new ServerBackground();
        serverBackground.setting();
    }

	public void sendMessage(String msg) {
		// TODO Auto-generated method stub
		try {
			out.writeUTF("Jay-G : "+msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}