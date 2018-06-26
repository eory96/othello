package handong.csee.edu.othello;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class MakeBoard{


	ImageIcon backicon;	// 배경 이미지 아이콘
	MakeStone stone = new MakeStone();
	public static int[][] board;	// 오델로판 배열 선언
	public JLabel label = new JLabel();	// 오델로판이미지 라벨
	public static JLayeredPane base;
	public static int x, y;
	public int turn = 0;
	
	//public ScoreBoard scoreboard;
	
	//StoneDrawer drawer = new StoneDrawer();



	public void Board () {
		// ** 전체 창을 생성
		JFrame window = new JFrame();
		window.setTitle("Othello");
		window.setSize(800,640);  

		// ** 게임 베이스 생성
		base = new JLayeredPane();

		// ** 게임 베이스를 창에 띄운다
		window.setContentPane(base);	
		window.setVisible(true);

		board = new int[8][8];	// 배열을 8*8으로 오델로판 생성
		for(int i=0; i<8; i++)
		{
			for(int j=0; j<8; j++)
				board[i][j] = 2;	
		}


		backicon = new ImageIcon("/Users/gimdaegyo/Desktop/GBC/kge.png");	// 오델로판 배경이미지				
		label.setIcon(backicon);
		label.setBounds(0, 0, 640, 640);
		base.add(label);

		stone.draw(3,3,0);
		stone.draw(4,4,0);
		stone.draw(3,4,1);				
		stone.draw(4,3,1);
		MakeBoard.board[3][3] = 0;	
		MakeBoard.board[4][4] = 0;
		MakeBoard.board[3][4] = 1;
		MakeBoard.board[4][3] = 1;
		
		MakeBoard.base.addMouseListener(new XYSetting());	// 클릭 모션을 위한 설정
		MakeBoard.base.addMouseMotionListener(new XYSetting());	// 무브모션을 위한 설정
	}

}
/*
2 그림 안들어간거
0 블랙 
1 화이츠
*/