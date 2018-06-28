package handong.csee.edu.othello;

import javax.swing.*;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class MakeBoard extends JFrame{
	ImageIcon zero = new ImageIcon("./0.png");
	ImageIcon two = new ImageIcon("./2.png");
	ImageIcon black = new ImageIcon("./blackj.png");
	ImageIcon white = new ImageIcon("./whitht.png");
	ImageIcon forChat = new ImageIcon("./chat.jpg");
	ImageIcon backicon;	// 배경 이미지 아이콘
	MakeStone stone = new MakeStone();
	public static int[][] board;	// 오델로판 배열 선언
	public JLabel label = new JLabel();	// 오델로판이미지 라벨
	public static JLayeredPane base;
	public static int x, y;
	
	//public ScoreBoard scoreboard;
	
	//StoneDrawer drawer = new StoneDrawer();



	public void Board () {
		// ** 전체 창을 생성
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		JLabel label4 = new JLabel();
		JLabel blackJ = new JLabel();
		JLabel whiteT = new JLabel();
		JLabel chat = new JLabel();
		JFrame window = new JFrame();
		
		//window.setTitle("Othello");
		window.setTitle("누가 이 물건좀 치워주세요!!");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		window.setSize(1099,640);  

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
		blackJ.setIcon(black);
		blackJ.setBounds(670,20,80,80);
		MakeBoard.base.add(blackJ,0);
		whiteT.setIcon(white);
		whiteT.setBounds(670,500,80,80);
		MakeBoard.base.add(whiteT,0);
		label1.setIcon(zero);
		label1.setBounds(750,20,80,80);
		MakeBoard.base.add(label1,0);
		label2.setIcon(two);
		label2.setBounds(830,20,80,80);
		MakeBoard.base.add(label2,0);
		label3.setIcon(zero);
		label3.setBounds(750,500,80,80);
		MakeBoard.base.add(label3,0);
		label4.setIcon(two);
		label4.setBounds(830,500,80,80);
		MakeBoard.base.add(label4,0);
		chat.setIcon(forChat);
		chat.setBounds(650, 110, 350, 380);
		MakeBoard.base.add(chat, 0);

		backicon = new ImageIcon("./kge3.jpg");	// 오델로판 배경이미지		
		label.setIcon(backicon);
		label.setBounds(0, 0, 1099, 640);
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