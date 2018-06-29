package handong.csee.edu.othello;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Victory {
	MakeBoard base=new MakeBoard();
	public void victory() {
		int countB=0;
		int countW=0;
		ImageIcon winB=new ImageIcon("./blackW.png");
		ImageIcon winW=new ImageIcon("./whiteW.png");
		ImageIcon draw=new ImageIcon("./draw.png");
		for(int i=0; i<8; i++) {
			for(int j=0; j<8;j++) {
				if(base.board[i][j]==0)
					countB++;
				else if(base.board[i][j]==1)
					countW++;
			}
		}
		if(countB>countW) {
			JLabel label = new JLabel();
			label.setIcon(winB);
			label.setBounds(400,20,464,600);
			base.add(label,0);
		}
		else if(countB<countW){
			JLabel label = new JLabel();
			label.setIcon(winW);
			label.setBounds(400,20,452,600);
			base.add(label,0);
		}
		else {
			JLabel label = new JLabel();
			label.setIcon(draw);
			label.setBounds(400,20,452,600);
			base.add(label,0);
		}
	}
}
