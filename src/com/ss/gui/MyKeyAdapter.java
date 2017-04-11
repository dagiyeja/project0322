package com.ss.gui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyKeyAdapter extends KeyAdapter{
	//���� ���̹Ƿ� ����, ������ �ִ� ���� ������ ���̹Ƿ� new X, �޼���� ������
	JTextField txt; 
	JTextArea area; 
	
	//getter setter�̿뵵 ������ ������ �̿��غ���(�̿� ȣ���� ���̹Ƿ�)
	public MyKeyAdapter(JTextArea area, JTextField txt) {
		this.area=area;
		this.txt=txt;
	}
	
	public void keyReleased(KeyEvent e) {
	//���� �ƴ� area�� txt�� �Է��� ���ڿ� ���
	
		int key=e.getKeyCode();
		if(key==KeyEvent.VK_ENTER){
			String msg=txt.getText();
			area.append(msg+"\n");
			txt.setText("");
			
		}
	}
}
