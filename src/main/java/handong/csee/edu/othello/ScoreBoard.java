package handong.csee.edu.othello;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ScoreBoard {
	
	ImageIcon zero = new ImageIcon("./0.png");
	ImageIcon one = new ImageIcon("./1.png");
	ImageIcon two = new ImageIcon("./2.png");
	ImageIcon three = new ImageIcon("./3.png");
	ImageIcon four = new ImageIcon("./4.png");
	ImageIcon five = new ImageIcon("./5.png");
	ImageIcon six = new ImageIcon("./6.png");
	ImageIcon seven = new ImageIcon("./7.png");
	ImageIcon eight = new ImageIcon("./8.png");
	ImageIcon nine = new ImageIcon("./9.png");
	
	public void countScoreB() {
		int countB=0;
		int countW=0;
		
		for(int i=0; i<8;i++) {
			for(int j=0; j<8;j++) {
				if(MakeBoard.board[i][j]==0)
					countB++;
			}
		}
		if(countB/10==0) {
			JLabel label = new JLabel();
			label.setIcon(zero);
			label.setBounds(750,20,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countB/10==1) {
			JLabel label = new JLabel();
			label.setIcon(one);
			label.setBounds(750,20,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countB/10==2) {
			JLabel label = new JLabel();
			label.setIcon(two);
			label.setBounds(750,20,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countB/10==3) {
			JLabel label = new JLabel();
			label.setIcon(three);
			label.setBounds(750,20,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countB/10==4) {
			JLabel label = new JLabel();
			label.setIcon(four);
			label.setBounds(750,20,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countB/10==5) {
			JLabel label = new JLabel();
			label.setIcon(five);
			label.setBounds(750,20,80,80);
			MakeBoard.base.add(label,0);
		}
		
		if(countB%10==0) {
			JLabel label = new JLabel();
			label.setIcon(zero);
			label.setBounds(830,20,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countB%10==1) {
			JLabel label = new JLabel();
			label.setIcon(one);
			label.setBounds(830,20,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countB%10==2) {
			JLabel label = new JLabel();
			label.setIcon(two);
			label.setBounds(830,20,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countB%10==3) {
			JLabel label = new JLabel();
			label.setIcon(three);
			label.setBounds(830,20,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countB%10==4) {
			JLabel label = new JLabel();
			label.setIcon(four);
			label.setBounds(830,20,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countB%10==5) {
			JLabel label = new JLabel();
			label.setIcon(five);
			label.setBounds(830,20,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countB%10==6) {
			JLabel label = new JLabel();
			label.setIcon(six);
			label.setBounds(830,20,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countB%10==7) {
			JLabel label = new JLabel();
			label.setIcon(seven);
			label.setBounds(830,20,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countB%10==8) {
			JLabel label = new JLabel();
			label.setIcon(eight);
			label.setBounds(830,20,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countB%10==9) {
			JLabel label = new JLabel();
			label.setIcon(nine);
			label.setBounds(830,20,80,80);
			MakeBoard.base.add(label,0);
		}
		
		for(int i=0; i<8;i++) {
			for(int j=0; j<8;j++) {
				if(MakeBoard.board[i][j]==1)
					countW++;
			}
		}
		if(countW/10==0) {
			JLabel label = new JLabel();
			label.setIcon(zero);
			label.setBounds(750,500,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countW/10==1) {
			JLabel label = new JLabel();
			label.setIcon(one);
			label.setBounds(750,500,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countW/10==2) {
			JLabel label = new JLabel();
			label.setIcon(two);
			label.setBounds(750,500,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countW/10==3) {
			JLabel label = new JLabel();
			label.setIcon(three);
			label.setBounds(750,500,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countW/10==4) {
			JLabel label = new JLabel();
			label.setIcon(four);
			label.setBounds(750,500,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countW/10==5) {
			JLabel label = new JLabel();
			label.setIcon(five);
			label.setBounds(750,500,80,80);
			MakeBoard.base.add(label,0);
		}
		
		if(countW%10==0) {
			JLabel label = new JLabel();
			label.setIcon(zero);
			label.setBounds(830,500,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countW%10==1) {
			JLabel label = new JLabel();
			label.setIcon(one);
			label.setBounds(830,500,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countW%10==2) {
			JLabel label = new JLabel();
			label.setIcon(two);
			label.setBounds(830,500,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countW%10==3) {
			JLabel label = new JLabel();
			label.setIcon(three);
			label.setBounds(830,500,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countW%10==4) {
			JLabel label = new JLabel();
			label.setIcon(four);
			label.setBounds(830,500,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countW%10==5) {
			JLabel label = new JLabel();
			label.setIcon(five);
			label.setBounds(830,500,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countW%10==6) {
			JLabel label = new JLabel();
			label.setIcon(six);
			label.setBounds(830,500,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countW%10==7) {
			JLabel label = new JLabel();
			label.setIcon(seven);
			label.setBounds(830,500,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countW%10==8) {
			JLabel label = new JLabel();
			label.setIcon(eight);
			label.setBounds(830,500,80,80);
			MakeBoard.base.add(label,0);
		}
		else if(countW%10==9) {
			JLabel label = new JLabel();
			label.setIcon(nine);
			label.setBounds(830,500,80,80);
			MakeBoard.base.add(label,0);
		}
	}
}
