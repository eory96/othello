package handong.csee.edu.othello;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Runner {
	public static int width=1050,height=650;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new MakeBoard();
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		f.setLocation(screenSize.width/2-width/2, screenSize.height/2-height);
	} 
}
