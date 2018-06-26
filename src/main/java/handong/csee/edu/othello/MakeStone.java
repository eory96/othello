package handong.csee.edu.othello;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MakeStone {
	ImageIcon black;
	ImageIcon white;
	
	public void draw(int x, int y, int turn){
		black = new ImageIcon("/Users/gimdaegyo/Desktop/black.png");
		white = new ImageIcon("/Users/gimdaegyo/Desktop/white.png");

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
			//upCheck(x,y,turn);
		}
	}
	
	public int DrawStone (int x, int y, int turn) {
		
		if(MakeBoard.board[y][x]<2) {
			turn=turn-1;
			return turn-1;
		}
		else if(turn == 0)	{
			if ((MakeStone.indata(x-1,y) == 1) || (turn == 1 && MakeStone.indata(x-1,y) == 0))	// 중간 왼쪽 방향
			{
				for(int ix=x-1; ix>=0; ix--)	// 왼쪽 방향으로 돌 조사
				{
					if(MakeStone.indata(ix,y)==2)
						break;		// 돌이 발견 되지 않으면 스톱
					if((MakeStone.indata(x-1,y) == 1 && MakeStone.indata(ix,y)==0) || (MakeStone.indata(x-1,y) == 0 && MakeStone.indata(ix,y)==1))	// 반대속성의 돌이 나오면
					{
						for(int jx=ix; jx<=x; jx++)	// 발생지점 -> 해당 좌표까지 x축의 반대속성의 돌을 해당돌로 변경
						{	
							MakeStone.outdata(jx,y,turn);	// 게임판에 새로운 돌의 데이터 입력
							draw(jx,y,turn);	// 새로운 돌 표시
						}
						break;
					}
				}
			}

			if ((MakeStone.indata(x-1,y-1) == 1) || (turn == 1 && MakeStone.indata(x-1,y-1) == 0))	// 상 왼쪽 방향
			{
				for(int ix=x-1,iy=y-1; ix>=0 || iy>=0; ix-- , iy--)	// 상 왼쪽 방향으로 돌 조사
				{
					if(MakeStone.indata(ix,iy)==2)
						break;
					if((MakeStone.indata(x-1,y-1) == 1 && MakeStone.indata(ix,iy)==0) || (MakeStone.indata(x-1,y-1) == 0 && MakeStone.indata(ix,iy)==1))	// 반대속성의 돌이 나오면
					{
						for(int jx=ix,jy=iy ; jx<=x; jx++, jy++)
						{	
							MakeStone.outdata(jx,jy,turn);
							draw(jx,jy,turn);
						}
						break;
					}
				}
			}

			if ((MakeStone.indata(x,y-1) == 1) || (turn == 1 && MakeStone.indata(x,y-1) == 0))	// 상 가운대 방향
			{
				for(int iy=y-1; iy>=0; iy--)	// 상 가운대 방향으로 돌 조사
				{
					if(MakeStone.indata(x,iy)==2)
						break;
					if((MakeStone.indata(x,y-1) == 1 && MakeStone.indata(x,iy)==0) || (MakeStone.indata(x,y-1) == 0 && MakeStone.indata(x,iy)==1))	
					{
						for(int jy=iy; jy<=y; jy++)
						{	
							MakeStone.outdata(x,jy,turn);	
							draw(x,jy,turn);
						}
						break;
					}
				}
			}

			if ((MakeStone.indata(x+1,y-1) == 1) || (turn == 1 && MakeStone.indata(x+1,y-1) == 0))	// 상 오른쪽 방향
			{
				for(int ix=x+1,iy=y-1; ix<=12 || iy>=0; ix++ , iy--)
				{
					if(MakeStone.indata(ix,iy)==2)
						break;
					if((MakeStone.indata(x+1,y-1) == 1 && MakeStone.indata(ix,iy)==0) || (MakeStone.indata(x+1,y-1) == 0 && MakeStone.indata(ix,iy)==1))	
					{
						for(int jx=ix,jy=iy ; jx>=x; jx--, jy++)
						{	
							MakeStone.outdata(jx,jy,turn);
							draw(jx,jy,turn);	
						}
						break;
					}
				}
			}

			if ((MakeStone.indata(x+1,y) == 1) || (turn == 1 && MakeStone.indata(x+1,y) == 0))	// 중간 오른쪽 방향
			{
				for(int ix=x+1; ix<=12; ix++)
				{
					if(MakeStone.indata(ix,y)==2)
						break;	
					if((MakeStone.indata(x+1,y) == 1 && MakeStone.indata(ix,y)==0) || (MakeStone.indata(x+1,y) == 0 && MakeStone.indata(ix,y)==1))	
					{
						for(int jx=ix; jx>=x; jx--)	
						{	
							MakeStone.outdata(jx,y,turn);	
							draw(jx,y,turn);	
						}
						break;
					}
				}
			}

			if ((MakeStone.indata(x+1,y+1) == 1) || (turn == 1 && MakeStone.indata(x+1,y+1) == 0))	// 하 오른쪽 방향
			{
				for(int ix=x+1,iy=y+1; ix<=12 || iy<=12; ix++ , iy++)
				{
					if(MakeStone.indata(ix,iy)==2)
						break;
					if((MakeStone.indata(x+1,y+1) == 1 && MakeStone.indata(ix,iy)==0) || (MakeStone.indata(x+1,y+1) == 0 && MakeStone.indata(ix,iy)==1))
					{
						for(int jx=ix,jy=iy ; jx>=x; jx--, jy--)
						{	
							MakeStone.outdata(jx,jy,turn);
							draw(jx,jy,turn);	
						}
						break;
					}
				}
			}

			if ((MakeStone.indata(x,y+1) == 1) || (turn == 1 && MakeStone.indata(x,y+1) == 0))	// 하 가운데 방향
			{
				for(int iy=y+1; iy<=12; iy++)
				{
					if(MakeStone.indata(x,iy)==2)
						break;		
					if((MakeStone.indata(x,y+1) == 1 && MakeStone.indata(x,iy)==0) || (MakeStone.indata(x,y+1) == 0 && MakeStone.indata(x,iy)==1))	
					{
						for(int jy=iy; jy>=y; jy--)	
						{	
							MakeStone.outdata(x,jy,turn);	
							draw(x,jy,turn);
						}
						break;
					}
				}
			}

			if ((MakeStone.indata(x-1,y+1) == 1) || (turn == 1 && MakeStone.indata(x-1,y+1) == 0))	// 하 왼쪽 방향
			{
				for(int ix=x-1,iy=y+1; ix>=0 || iy<=12; ix-- , iy++)
				{
					if(MakeStone.indata(ix,iy)==2)
						break;
					if((MakeStone.indata(x-1,y+1) == 1 && MakeStone.indata(ix,iy)==0) || (MakeStone.indata(x-1,y+1) == 0 && MakeStone.indata(ix,iy)==1))
					{
						for(int jx=ix,jy=iy ; jx<=x; jx++, jy--)
						{	
							MakeStone.outdata(jx,jy,turn);
							draw(jx,jy,turn);
						}
						break;
					}
				}
			}

			/*for(int q=0;q<8;q++) {
				for(int p=0 ; p<8;p++) {
					if(MakeBoard.board[p][q]==0) {
						JLabel label = new JLabel();
						label.setIcon(black);	// 생성
						label.setBounds(x*80,y*80,80,80);
						MakeBoard.base.add(label,0);
						MakeBoard.board[y][x] = 0;
					}
				}
			}*/
		}
		//upCheck(x,y,turn);
		else if (turn == 1) {
				if ((turn == 0 && MakeStone.indata(x-1,y) == 1) || (MakeStone.indata(x-1,y) == 0))	// 중간 왼쪽 방향
				{
					for(int ix=x-1; ix>=0; ix--)	// 왼쪽 방향으로 돌 조사
					{
						if(MakeStone.indata(ix,y)==2)
							break;		// 돌이 발견 되지 않으면 스톱
						if((MakeStone.indata(x-1,y) == 1 && MakeStone.indata(ix,y)==0) || (MakeStone.indata(x-1,y) == 0 && MakeStone.indata(ix,y)==1))	// 반대속성의 돌이 나오면
						{
							for(int jx=ix; jx<=x; jx++)	// 발생지점 -> 해당 좌표까지 x축의 반대속성의 돌을 해당돌로 변경
							{	
								MakeStone.outdata(jx,y,turn);	// 게임판에 새로운 돌의 데이터 입력
								draw(jx,y,turn);	// 새로운 돌 표시
							}
							break;
						}
					}
				}

				if ((turn == 0 && MakeStone.indata(x-1,y-1) == 1) || (MakeStone.indata(x-1,y-1) == 0))	// 상 왼쪽 방향
				{
					for(int ix=x-1,iy=y-1; ix>=0 || iy>=0; ix-- , iy--)	// 상 왼쪽 방향으로 돌 조사
					{
						if(MakeStone.indata(ix,iy)==2)
							break;
						if((MakeStone.indata(x-1,y-1) == 1 && MakeStone.indata(ix,iy)==0) || (MakeStone.indata(x-1,y-1) == 0 && MakeStone.indata(ix,iy)==1))	// 반대속성의 돌이 나오면
						{
							for(int jx=ix,jy=iy ; jx<=x; jx++, jy++)
							{	
								MakeStone.outdata(jx,jy,turn);
								draw(jx,jy,turn);
							}
							break;
						}
					}
				}

				if ((turn == 0 && MakeStone.indata(x,y-1) == 1) || (MakeStone.indata(x,y-1) == 0))	// 상 가운대 방향
				{
					for(int iy=y-1; iy>=0; iy--)	// 상 가운대 방향으로 돌 조사
					{
						if(MakeStone.indata(x,iy)==2)
							break;
						if((MakeStone.indata(x,y-1) == 1 && MakeStone.indata(x,iy)==0) || (MakeStone.indata(x,y-1) == 0 && MakeStone.indata(x,iy)==1))	
						{
							for(int jy=iy; jy<=y; jy++)
							{	
								MakeStone.outdata(x,jy,turn);	
								draw(x,jy,turn);
							}
							break;
						}
					}
				}

				if ((turn == 0 && MakeStone.indata(x+1,y-1) == 1) || (MakeStone.indata(x+1,y-1) == 0))	// 상 오른쪽 방향
				{
					for(int ix=x+1,iy=y-1; ix<=12 || iy>=0; ix++ , iy--)
					{
						if(MakeStone.indata(ix,iy)==2)
							break;
						if((MakeStone.indata(x+1,y-1) == 1 && MakeStone.indata(ix,iy)==0) || (MakeStone.indata(x+1,y-1) == 0 && MakeStone.indata(ix,iy)==1))	
						{
							for(int jx=ix,jy=iy ; jx>=x; jx--, jy++)
							{	
								MakeStone.outdata(jx,jy,turn);
								draw(jx,jy,turn);	
							}
							break;
						}
					}
				}

				if ((turn == 0 && MakeStone.indata(x+1,y) == 1) || (MakeStone.indata(x+1,y) == 0))	// 중간 오른쪽 방향
				{
					for(int ix=x+1; ix<=12; ix++)
					{
						if(MakeStone.indata(ix,y)==2)
							break;	
						if((MakeStone.indata(x+1,y) == 1 && MakeStone.indata(ix,y)==0) || (MakeStone.indata(x+1,y) == 0 && MakeStone.indata(ix,y)==1))	
						{
							for(int jx=ix; jx>=x; jx--)	
							{	
								MakeStone.outdata(jx,y,turn);	
								draw(jx,y,turn);	
							}
							break;
						}
					}
				}

				if ((turn == 0 && MakeStone.indata(x+1,y+1) == 1) || (MakeStone.indata(x+1,y+1) == 0))	// 하 오른쪽 방향
				{
					for(int ix=x+1,iy=y+1; ix<=12 || iy<=12; ix++ , iy++)
					{
						if(MakeStone.indata(ix,iy)==2)
							break;
						if((MakeStone.indata(x+1,y+1) == 1 && MakeStone.indata(ix,iy)==0) || (MakeStone.indata(x+1,y+1) == 0 && MakeStone.indata(ix,iy)==1))
						{
							for(int jx=ix,jy=iy ; jx>=x; jx--, jy--)
							{	
								MakeStone.outdata(jx,jy,turn);
								draw(jx,jy,turn);	
							}
							break;
						}
					}
				}

				if ((turn == 0 && MakeStone.indata(x,y+1) == 1) || (MakeStone.indata(x,y+1) == 0))	// 하 가운데 방향
				{
					for(int iy=y+1; iy<=12; iy++)
					{
						if(MakeStone.indata(x,iy)==2)
							break;		
						if((MakeStone.indata(x,y+1) == 1 && MakeStone.indata(x,iy)==0) || (MakeStone.indata(x,y+1) == 0 && MakeStone.indata(x,iy)==1))	
						{
							for(int jy=iy; jy>=y; jy--)	
							{	
								MakeStone.outdata(x,jy,turn);	
								draw(x,jy,turn);
							}
							break;
						}
					}
				}

				if ((turn == 0 && MakeStone.indata(x-1,y+1) == 1) || (MakeStone.indata(x-1,y+1) == 0))	// 하 왼쪽 방향
				{
					for(int ix=x-1,iy=y+1; ix>=0 || iy<=12; ix-- , iy++)
					{
						if(MakeStone.indata(ix,iy)==2)
							break;
						if((MakeStone.indata(x-1,y+1) == 1 && MakeStone.indata(ix,iy)==0) || (MakeStone.indata(x-1,y+1) == 0 && MakeStone.indata(ix,iy)==1))
						{
							for(int jx=ix,jy=iy ; jx<=x; jx++, jy--)
							{	
								MakeStone.outdata(jx,jy,turn);
								draw(jx,jy,turn);
							}
							break;
						}
					}
				}
		}

		return 0;
	}


	static public int indata(int x, int y)	//해당 좌표에 매칭되는 배열값을 얻어오는 함수.
	{
		if(x<0 || x>7)
			return -1;
		if(y<0 || y>7)
			return -1;

		return MakeBoard.board[y][x];
	}	
	static public void outdata(int x, int y, int turn) {//해당 좌표에 배열값 대입.

		if(x<0 || x>7)
			return ;
		if(y<0 || y>7)
			return ;

		MakeBoard.board[y][x] = turn;
	}
}
