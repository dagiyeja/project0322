/*
 �̺�Ʈ ���α׷��ֽ� �����ʰ� �������̽��̱� ������ �� �ϳ��� �޼��带 �������̵����� ������
 ���� ������ ����� ���� �Ǿ�, ������ ������ �߻��Ѵ�..
 �� ��Ģ�� Ư���� �߻�޼��带 ���� ������ �������̽��� ��� �ʹ� ��ȿ�����̰� �ǰ��ϴ�..
 
 �ذ�å)�����ڸ� ����Ͽ� �̹� �������� �޼������ �������س��� ��ü���� ������ ����Ͷ� �Ѵ�!!
 but, ����ʹ� ������ �����Ǵ� ���� �ƴ϶�, ����� ���� 3���̻��� �߻�޼��带 ������ �����ʶ�� 
 ����� ������ �ϴ� �ǽ��غ��� �Ѵ�..
 
 */

package com.ss.gui;

import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*������ �̺�Ʈ�� �����غ���*/
public class WindowTest extends JFrame{
	JButton bt;
	
	public WindowTest(){
		JButton bt=new JButton("����ư");
		setLayout(new FlowLayout());
		add(bt);
		
		this.addWindowListener(new MyAdapter()); // �̺�Ʈ�� ��ü�� ��(������)�̹Ƿ� this
		setSize(300,400);
		setVisible(true);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		//�ؿ� close���� �޼��� �����Ƿ� ���ʿ� ����.
		
	}

	public static void main(String[] args) {
		new WindowTest();
	}
}
