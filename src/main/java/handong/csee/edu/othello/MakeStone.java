package handong.csee.edu.othello;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MakeStone {
	ImageIcon black;
	ImageIcon white;
	
	public void draw(int x, int y, int turn){
		black = new ImageIcon("./blackj.png");
		white = new ImageIcon("./whitht.png"); 

		if(turn==0) {
			JLabel label = new JLabel();
			label.setIcon(black);	// 생성
			label.setBounds(x*80,y*80,80,80);
			MakeBoard.base.add(label,0);
			MakeBoard.board[y][x] = 0;
		}
		else if (turn == 1) {
			JLabel label = new JLabel();
			label.setIcon(white);
			label.setBounds(x*80,y*80,80,80);
			MakeBoard.base.add(label,0);
			MakeBoard.board[y][x]=1;
		}
		//ChangeTurn();
	}
	
	public void chageStone (int x, int y, int turn) {
		
		if(MakeBoard.board[y][x]<2) {}
		else if(turn == 0)	{
			if ((MakeStone.indata(x-1,y) == 1))	// 중간 왼쪽 방향
			{
				for(int ix=x-1; ix>=0; ix--)
				{
					if(MakeStone.indata(ix,y)==2)
						break;		
					else if((MakeStone.indata(x-1,y) == 1 && MakeStone.indata(ix,y)==0) || (MakeStone.indata(x-1,y) == 0 && MakeStone.indata(ix,y)==1))	// 반대속성의 돌이 나오면
					{
						for(int jx=ix; jx<=x; jx++)
						{	
							//MakeStone.outdata(jx,y,turn);
							draw(jx,y,turn);
						}
						break;
					}
				}
			}

			if ((MakeStone.indata(x-1,y-1) == 1))	// 상 왼쪽 방향
			{
				for(int ix=x-1,iy=y-1; ix>=0 || iy>=0; ix-- , iy--)	// 상 왼쪽 방향으로 돌 조사
				{
					if(MakeStone.indata(ix,iy)==2)
						break;
					else if((MakeStone.indata(x-1,y-1) == 1 && MakeStone.indata(ix,iy)==0) || (MakeStone.indata(x-1,y-1) == 0 && MakeStone.indata(ix,iy)==1))	// 반대속성의 돌이 나오면
					{
						for(int jx=ix,jy=iy ; jx<=x; jx++, jy++)
						{	
							//MakeStone.outdata(jx,jy,turn);
							draw(jx,jy,turn);
						}
						break;
					}
				}
			}

			if ((MakeStone.indata(x,y-1) == 1))	// 상 가운대 방향
			{
				for(int iy=y-1; iy>=0; iy--)	// 상 가운대 방향으로 돌 조사
				{
					if(MakeStone.indata(x,iy)==2)
						break;
					else if((MakeStone.indata(x,y-1) == 1 && MakeStone.indata(x,iy)==0) || (MakeStone.indata(x,y-1) == 0 && MakeStone.indata(x,iy)==1))	
					{
						for(int jy=iy; jy<=y; jy++)
						{	
							//MakeStone.outdata(x,jy,turn);	
							draw(x,jy,turn);
						}
						break;
					}
				}
			}

			if ((MakeStone.indata(x+1,y-1) == 1))	// 상 오른쪽 방향
			{
				for(int ix=x+1,iy=y-1; ix<=12 || iy>=0; ix++ , iy--)
				{
					if(MakeStone.indata(ix,iy)==2)
						break;
					else if((MakeStone.indata(x+1,y-1) == 1 && MakeStone.indata(ix,iy)==0) || (MakeStone.indata(x+1,y-1) == 0 && MakeStone.indata(ix,iy)==1))	
					{
						for(int jx=ix,jy=iy ; jx>=x; jx--, jy++)
						{	
							//MakeStone.outdata(jx,jy,turn);
							draw(jx,jy,turn);	
						}
						break;
					}
				}
			}

			if ((MakeStone.indata(x+1,y) == 1))	// 중간 오른쪽 방향
			{
				for(int ix=x+1; ix<=12; ix++)
				{
					if(MakeStone.indata(ix,y)==2)
						break;	
					else if((MakeStone.indata(x+1,y) == 1 && MakeStone.indata(ix,y)==0) || (MakeStone.indata(x+1,y) == 0 && MakeStone.indata(ix,y)==1))	
					{
						for(int jx=ix; jx>=x; jx--)	
						{	
							//MakeStone.outdata(jx,y,turn);	
							draw(jx,y,turn);	
						}
						break;
					}
				}
			}

			if ((MakeStone.indata(x+1,y+1) == 1))	// 하 오른쪽 방향
			{
				for(int ix=x+1,iy=y+1; ix<=12 || iy<=12; ix++ , iy++)
				{
					if(MakeStone.indata(ix,iy)==2)
						break;
					else if((MakeStone.indata(x+1,y+1) == 1 && MakeStone.indata(ix,iy)==0) || (MakeStone.indata(x+1,y+1) == 0 && MakeStone.indata(ix,iy)==1))
					{
						for(int jx=ix,jy=iy ; jx>=x; jx--, jy--)
						{	
							//MakeStone.outdata(jx,jy,turn);
							draw(jx,jy,turn);	
						}
						break;
					}
				}
			}

			if ((MakeStone.indata(x,y+1) == 1))	// 하 가운데 방향
			{
				for(int iy=y+1; iy<=12; iy++)
				{
					if(MakeStone.indata(x,iy)==2)
						break;		
					else if((MakeStone.indata(x,y+1) == 1 && MakeStone.indata(x,iy)==0) || (MakeStone.indata(x,y+1) == 0 && MakeStone.indata(x,iy)==1))	
					{
						for(int jy=iy; jy>=y; jy--)	
						{	
							//MakeStone.outdata(x,jy,turn);	
							draw(x,jy,turn);
						}
						break;
					}
				}
			}

			if ((MakeStone.indata(x-1,y+1) == 1))	// 하 왼쪽 방향
			{
				for(int ix=x-1,iy=y+1; ix>=0 || iy<=12; ix-- , iy++)
				{
					if(MakeStone.indata(ix,iy)==2)
						break;
					else if((MakeStone.indata(x-1,y+1) == 1 && MakeStone.indata(ix,iy)==0) || (MakeStone.indata(x-1,y+1) == 0 && MakeStone.indata(ix,iy)==1))
					{
						for(int jx=ix,jy=iy ; jx<=x; jx++, jy--)
						{	
							//MakeStone.outdata(jx,jy,turn);
							draw(jx,jy,turn);
						}
						break;
					}
				}
			}

		
		}
		
		else if (turn == 1) {
				if ((MakeStone.indata(x-1,y) == 0))
				{
					for(int ix=x-1; ix>=0; ix--)						
					{
						if(MakeStone.indata(ix,y)==2)
							break;		
						else if((MakeStone.indata(x-1,y) == 1 && MakeStone.indata(ix,y)==0) || (MakeStone.indata(x-1,y) == 0 && MakeStone.indata(ix,y)==1))	// 반대속성의 돌이 나오면
						{
							for(int jx=ix; jx<=x; jx++)	
							{	
								//MakeStone.outdata(jx,y,turn);	
								draw(jx,y,turn);	
							}
							break;
						}
					}
				}

				if ((MakeStone.indata(x-1,y-1) == 0))	
				{
					for(int ix=x-1,iy=y-1; ix>=0 || iy>=0; ix-- , iy--)	
					{
						if(MakeStone.indata(ix,iy)==2)
							break;
						else if((MakeStone.indata(x-1,y-1) == 1 && MakeStone.indata(ix,iy)==0) || (MakeStone.indata(x-1,y-1) == 0 && MakeStone.indata(ix,iy)==1))	
						{
							for(int jx=ix,jy=iy ; jx<=x; jx++, jy++)
							{	
								//MakeStone.outdata(jx,jy,turn);
								draw(jx,jy,turn);
							}
							break;
						}
					}
				}

				if ((MakeStone.indata(x,y-1) == 0))	
				{
					for(int iy=y-1; iy>=0; iy--)	
					{
						if(MakeStone.indata(x,iy)==2)
							break;
						else if((MakeStone.indata(x,y-1) == 1 && MakeStone.indata(x,iy)==0) || (MakeStone.indata(x,y-1) == 0 && MakeStone.indata(x,iy)==1))	
						{
							for(int jy=iy; jy<=y; jy++)
							{	
								//MakeStone.outdata(x,jy,turn);	
								draw(x,jy,turn);
							}
							break;
						}
					}
				}

				if ((MakeStone.indata(x+1,y-1) == 0))	// 상 오른쪽 방향
				{
					for(int ix=x+1,iy=y-1; ix<=12 || iy>=0; ix++ , iy--)
					{
						if(MakeStone.indata(ix,iy)==2)
							break;
						else if((MakeStone.indata(x+1,y-1) == 1 && MakeStone.indata(ix,iy)==0) || (MakeStone.indata(x+1,y-1) == 0 && MakeStone.indata(ix,iy)==1))	
						{
							for(int jx=ix,jy=iy ; jx>=x; jx--, jy++)
							{	
								//MakeStone.outdata(jx,jy,turn);
								draw(jx,jy,turn);	
							}
							break;
						}
					}
				}

				if ((MakeStone.indata(x+1,y) == 0))	// 중간 오른쪽 방향
				{
					for(int ix=x+1; ix<=12; ix++)
					{
						if(MakeStone.indata(ix,y)==2)
							break;	
						else if((MakeStone.indata(x+1,y) == 1 && MakeStone.indata(ix,y)==0) || (MakeStone.indata(x+1,y) == 0 && MakeStone.indata(ix,y)==1))	
						{
							for(int jx=ix; jx>=x; jx--)	
							{	
								//MakeStone.outdata(jx,y,turn);	
								draw(jx,y,turn);	
							}
							break;
						}
					}
				}

				if ((MakeStone.indata(x+1,y+1) == 0))	// 하 오른쪽 방향
				{
					for(int ix=x+1,iy=y+1; ix<=12 || iy<=12; ix++ , iy++)
					{
						if(MakeStone.indata(ix,iy)==2)
							break;
						else if((MakeStone.indata(x+1,y+1) == 1 && MakeStone.indata(ix,iy)==0) || (MakeStone.indata(x+1,y+1) == 0 && MakeStone.indata(ix,iy)==1))
						{
							for(int jx=ix,jy=iy ; jx>=x; jx--, jy--)
							{	
								//MakeStone.outdata(jx,jy,turn);
								draw(jx,jy,turn);	
							}
							break;
						}
					}
				}

				if ((MakeStone.indata(x,y+1) == 0))	// 하 가운데 방향
				{
					for(int iy=y+1; iy<=12; iy++)
					{
						if(MakeStone.indata(x,iy)==2)
							break;		
						else if((MakeStone.indata(x,y+1) == 1 && MakeStone.indata(x,iy)==0) || (MakeStone.indata(x,y+1) == 0 && MakeStone.indata(x,iy)==1))	
						{
							for(int jy=iy; jy>=y; jy--)	
							{	
								//MakeStone.outdata(x,jy,turn);	
								draw(x,jy,turn);
							}
							break;
						}
					}
				}

				if ((MakeStone.indata(x-1,y+1) == 0))	// 하 왼쪽 방향
				{
					for(int ix=x-1,iy=y+1; ix>=0 || iy<=12; ix-- , iy++)
					{
						if(MakeStone.indata(ix,iy)==2)
							break;
						else if((MakeStone.indata(x-1,y+1) == 1 && MakeStone.indata(ix,iy)==0) || (MakeStone.indata(x-1,y+1) == 0 && MakeStone.indata(ix,iy)==1))
						{
							for(int jx=ix,jy=iy ; jx<=x; jx++, jy--)
							{	
								//MakeStone.outdata(jx,jy,turn);
								draw(jx,jy,turn);
							}
							break;
						}
					}
				}
		}

		//return 0;
	}


	static public int indata(int x, int y)	
	{
		if(x<0 || x>7)
			return -1;
		if(y<0 || y>7)
			return -1;

		return MakeBoard.board[y][x];
	}	
	
}
