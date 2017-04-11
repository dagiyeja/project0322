package com.ss.gui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyKeyAdapter extends KeyAdapter{
	//남의 것이므로 보유, 기존에 있는 것을 얻어오는 것이므로 new X, 메서드로 얻어오기
	JTextField txt; 
	JTextArea area; 
	
	//getter setter이용도 좋지만 생성자 이용해보자(이왕 호출할 것이므로)
	public MyKeyAdapter(JTextArea area, JTextField txt) {
		this.area=area;
		this.txt=txt;
	}
	
	public void keyReleased(KeyEvent e) {
	//내꺼 아닌 area에 txt의 입력한 문자열 출력
	
		int key=e.getKeyCode();
		if(key==KeyEvent.VK_ENTER){
			String msg=txt.getText();
			area.append(msg+"\n");
			txt.setText("");
			
		}
	}
}
