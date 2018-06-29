package handong.csee.edu.othello;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ShadowStone {
	int checkTurn;
	JLabel label = new JLabel();
	MakeBoard base=new MakeBoard();
	
	public void shadowStone(int x, int y, int turn) {		
		ImageIcon blackShadow = new ImageIcon("./blackjsh.png");
		ImageIcon whiteShadow = new ImageIcon("./whitetsh.png");
		if(turn == 0){	
			label.setIcon(blackShadow);
			label.setBounds(x*80,y*80,80,80);
			base.add(label,0);
		}
		else if(turn == 1) {

			label.setIcon(whiteShadow);
			label.setBounds(x*80,y*80,80,80);			
			base.add(label,0);
		}
	}

	public void shadow(int x, int y, int turn) {
		if(base.board[y][x]<2) {}
		else if(turn ==0)
		{
			if ((MakeStone.indata(x-1,y) == 1))	//left
			{
				for(int ix=x-1; ix>=0; ix--)	
				{
					if(MakeStone.indata(ix,y)==2)
						break;		
					if((MakeStone.indata(x-1,y) == 1 && MakeStone.indata(ix,y)==0) || (MakeStone.indata(x-1,y) == 0 && MakeStone.indata(ix,y)==1))	// 반대속성의 돌이 나오면
					{
						shadowStone(ix+(x-ix),y,turn);
					}
				}
			}

			if ((MakeStone.indata(x-1,y-1) == 1))	//up left
			{
				for(int ix=x-1,iy=y-1; ix>=0 || iy>=0; ix-- , iy--)
				{
					if(MakeStone.indata(ix,iy)==2)
						break;		
					if((MakeStone.indata(x-1,y-1) == 1 && MakeStone.indata(ix,iy)==0) || (MakeStone.indata(x-1,y-1) == 0 && MakeStone.indata(ix,iy)==1))	// 반대속성의 돌이 나오면
					{
						shadowStone(ix+(x-ix),iy+(y-iy),turn);
					}
				}
			}

			if ((MakeStone.indata(x,y-1) == 1))	//up middle
			{
				for(int iy=y-1; iy>=0; iy--)	//up middle
				{
					if(MakeStone.indata(x,iy)==2)
						break;	
					if((MakeStone.indata(x,y-1) == 1 && MakeStone.indata(x,iy)==0) || (MakeStone.indata(x,y-1) == 0 && MakeStone.indata(x,iy)==1))	// 반대속성의 돌이 나오면
					{
						shadowStone(x,iy+(y-iy),turn);
					}
				}
			}

			if ((MakeStone.indata(x+1,y-1) == 1))	//up right
			{
				for(int ix=x+1,iy=y-1; ix<=12 || iy>=0; ix++ , iy--)	//up right
				{
					if(MakeStone.indata(ix,iy)==2)
						break;		
					if((MakeStone.indata(x+1,y-1) == 1 && MakeStone.indata(ix,iy)==0) || (MakeStone.indata(x+1,y-1) == 0 && MakeStone.indata(ix,iy)==1))	// 반대속성의 돌이 나오면
					{
						shadowStone(ix+(x-ix),iy+(y-iy),turn);
					}
				}
			}

			if ((MakeStone.indata(x+1,y) == 1))	//right
			{
				for(int ix=x+1; ix<=12; ix++)	
				{
					if(MakeStone.indata(ix,y)==2)
						break;		
					if((MakeStone.indata(x+1,y) == 1 && MakeStone.indata(ix,y)==0) || (MakeStone.indata(x+1,y) == 0 && MakeStone.indata(ix,y)==1))	// 반대속성의 돌이 나오면
					{
						shadowStone(ix+(x-ix),y,turn);
					}
				}
			}

			if ((MakeStone.indata(x+1,y+1) == 1))	//down right
			{
				for(int ix=x+1,iy=y+1; ix<=12 || iy<=12; ix++ , iy++)	//down right
				{
					if(MakeStone.indata(ix,iy)==2)
						break;		
					if((MakeStone.indata(x+1,y+1) == 1 && MakeStone.indata(ix,iy)==0) || (MakeStone.indata(x+1,y+1) == 0 && MakeStone.indata(ix,iy)==1))	// 반대속성의 돌이 나오면
					{
						shadowStone(ix+(x-ix),iy+(y-iy),turn);
					}
				}
			}

			if ((MakeStone.indata(x,y+1) == 1))	//down middle
			{
				for(int iy=y+1; iy<=12; iy++)	//down middle
				{
					if(MakeStone.indata(x,iy)==2)
						break;		
					if((MakeStone.indata(x,y+1) == 1 && MakeStone.indata(x,iy)==0) || (MakeStone.indata(x,y+1) == 0 && MakeStone.indata(x,iy)==1))	// 반대속성의 돌이 나오면
					{
						shadowStone(x,iy+(y-iy),turn);
					}
				}
			}

			if ((MakeStone.indata(x-1,y+1) == 1))	//down middle
			{
				for(int ix=x-1,iy=y+1; ix>=0 || iy<=12; ix-- , iy++)	//down middle
				{
					if(MakeStone.indata(ix,iy)==2)
						break;		
					if((MakeStone.indata(x-1,y+1) == 1 && MakeStone.indata(ix,iy)==0) || (MakeStone.indata(x-1,y+1) == 0 && MakeStone.indata(ix,iy)==1))	// 반대속성의 돌이 나오면
					{
						shadowStone(ix+(x-ix),iy+(y-iy),turn);
					}
				}
			}
		}

		else if(turn ==1)// 흰돌 차례 
		{
			if ((MakeStone.indata(x-1,y) == 0))	// 중간 왼쪽 방향
			{
				for(int ix=x-1; ix>=0; ix--)	// 왼쪽 방향
				{
					if(MakeStone.indata(ix,y)==2)
						break;		// 돌이 발견 되지 않으면 스톱
					if((MakeStone.indata(x-1,y) == 1 &&MakeStone.indata(ix,y)==0) || (MakeStone.indata(x-1,y) == 0 &&MakeStone.indata(ix,y)==1))	// 반대속성의 돌이 나오면
					{
						shadowStone(ix+(x-ix),y,turn);
					}
				}
			}

			if ((MakeStone.indata(x-1,y-1) == 0))	// 상 왼쪽 방향
			{
				for(int ix=x-1,iy=y-1; ix>=0 || iy>=0; ix-- , iy--)	// 상 왼쪽 방향
				{
					if(MakeStone.indata(ix,iy)==2)
						break;		
					if((MakeStone.indata(x-1,y-1) == 1 &&MakeStone.indata(ix,iy)==0) || (MakeStone.indata(x-1,y-1) == 0 &&MakeStone.indata(ix,iy)==1))	// 반대속성의 돌이 나오면
					{
						shadowStone(ix+(x-ix),iy+(y-iy),turn);	// shadowStone 함수 호출
					}
				}
			}

			if ((MakeStone.indata(x,y-1) == 0))	//up middle
			{
				for(int iy=y-1; iy>=0; iy--)	//up middle
				{
					if(MakeStone.indata(x,iy)==2)
						break;	
					if((MakeStone.indata(x,y-1) == 1 &&MakeStone.indata(x,iy)==0) || (MakeStone.indata(x,y-1) == 0 &&MakeStone.indata(x,iy)==1))	// 반대속성의 돌이 나오면
					{
						shadowStone(x,iy+(y-iy),turn);
					}
				}
			}

			if ((MakeStone.indata(x+1,y-1) == 0))	//up right
			{
				for(int ix=x+1,iy=y-1; ix<=12 || iy>=0; ix++ , iy--)	//up right
				{
					if(MakeStone.indata(ix,iy)==2)
						break;		
					if((MakeStone.indata(x+1,y-1) == 1 &&MakeStone.indata(ix,iy)==0) || (MakeStone.indata(x+1,y-1) == 0 &&MakeStone.indata(ix,iy)==1))	// 반대속성의 돌이 나오면
					{
						shadowStone(ix+(x-ix),iy+(y-iy),turn);
					}
				}
			}

			if ((MakeStone.indata(x+1,y) == 0))	//right
			{
				for(int ix=x+1; ix<=12; ix++)	// 오른쪽 방향
				{
					if(MakeStone.indata(ix,y)==2)
						break;		
					if((MakeStone.indata(x+1,y) == 1 &&MakeStone.indata(ix,y)==0) || (MakeStone.indata(x+1,y) == 0 &&MakeStone.indata(ix,y)==1))	// 반대속성의 돌이 나오면
					{
						shadowStone(ix+(x-ix),y,turn);
					}
				}
			}

			if ((MakeStone.indata(x+1,y+1) == 0))	//down right
			{
				for(int ix=x+1,iy=y+1; ix<=12 || iy<=12; ix++ , iy++)	//down right
				{
					if(MakeStone.indata(ix,iy)==2)
						break;		
					if((MakeStone.indata(x+1,y+1) == 1 &&MakeStone.indata(ix,iy)==0) || (MakeStone.indata(x+1,y+1) == 0 &&MakeStone.indata(ix,iy)==1))	// 반대속성의 돌이 나오면
					{
						shadowStone(ix+(x-ix),iy+(y-iy),turn);
					}
				}
			}

			if ((MakeStone.indata(x,y+1) == 0))	//down middle
			{
				for(int iy=y+1; iy<=12; iy++)	//down middle
				{
					if(MakeStone.indata(x,iy)==2)
						break;		
					if((MakeStone.indata(x,y+1) == 1 &&MakeStone.indata(x,iy)==0) || (MakeStone.indata(x,y+1) == 0 &&MakeStone.indata(x,iy)==1))	// 반대속성의 돌이 나오면
					{
						shadowStone(x,iy+(y-iy),turn);
					}
				}
			}

			if ((MakeStone.indata(x-1,y+1) == 0))	//down middle
			{
				for(int ix=x-1,iy=y+1; ix>=0 || iy<=12; ix-- , iy++)	//down middle
				{
					if(MakeStone.indata(ix,iy)==2)
						break;		
					if((MakeStone.indata(x-1,y+1) == 1 &&MakeStone.indata(ix,iy)==0) || (MakeStone.indata(x-1,y+1) == 0 &&MakeStone.indata(ix,iy)==1))	// 반대속성의 돌이 나오면
					{
						shadowStone(ix+(x-ix),iy+(y-iy),turn);
					}
				}
			}
		}
	}

}
