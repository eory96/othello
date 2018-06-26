package handong.csee.edu.othello;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class XYSetting implements MouseListener, MouseMotionListener {
	int x,y;
	MakeStone stone =new MakeStone();
	int turn = 0;
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

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
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
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
		stone.DrawStone(x, y, turn);
		ChangeTurn();
	}
	private void ChangeTurn() {
		if (turn == 0)
			turn = 1;

		else if(turn == 1)
			turn = 0;

	}
	
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	
}
