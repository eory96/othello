package handong.csee.edu.othello;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class XYSetting implements MouseListener, MouseMotionListener {
	int x,y;
	MakeStone stone =new MakeStone();
	ShadowStone shadow = new ShadowStone();
	static public int turn = 0;
	ScoreBoard score = new ScoreBoard();
	int count=0; 
	Victory vic=new Victory();
	
	public XYSetting() {}
	
	@Override
	public void mouseDragged(MouseEvent e) {}

	@Override
	public void mouseMoved(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		
		if(x<80)
			x=0;
		else if(x>540)
			x=7;
		else
			x=(int)x/80;
		
		if(y<80)
			y=0;
		else if(y>540)
			y=7;
		else
			y=(int)y/80;
		
		shadow.shadow(x, y, turn);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		if(x<80)
			x=0;
		else if(x>540)
			x=7;
		else
			x=(int)x/80;
		
		if(y<80)
			y=0;
		else if(y>540)
			y=7;
		else
			y=(int)y/80;
		
		
		stone.chageStone(x, y, turn);
		ChangeTurn();
		score.countScoreB();
		
		if(count==64) {
			vic.victory();
		}
	}
	
	public int ChangeTurn() {
		//int count=0;
		count=0;
		for(int i=0; i<8;i++) {
			for(int j=0; j<8; j++) {
				if(MakeBoard.board[i][j]<2)
					count++;
			}
		}
		
		if (count%2 == 0) {
			turn =0;
		}

		else if(count%2 == 1) {
			turn=1;
		}
		return turn;
	}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	
}
