package com.ss.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame{
	JTextField txt;
	JTextArea area;
	JButton bt;
	
	
	public MyFrame(){
		txt=new JTextField(20);
		area=new JTextArea(20,20);
		bt=new JButton("�� ��ư");
		
		setLayout(new FlowLayout());
		
		add(txt); //add(txt=new JTextField(20)); �� ����
		add(bt);
		add(area);
		
		//txt�� �����ʿ��� ����
		//.java ������ ����� ���� ���, Ŭ���� �ڵ� ��ü�� �޼����� �μ���, 
		//Ŭ������ ������� � �ٷ� ������ ���� �ִ�.
		//���� �͸� Ŭ������ �θ�(keyAdapter) ���� �޸𸮿� �ø�->�׸��� �ڽ��� �������̵�
		//�����͸�Ŭ������ ����ϴ� ����?
		//Anonymous inner class 
		//.java vs �����͸�
		//���� ������ ���� ������ ���
		//�����͸��� �ַ� �̺�Ʈ�����ʿ� ������ �� ���δ�.
		//.java�� ���������� �����ҽ����� �ۼ��ϴ� ������ 
		//�ڵ��� ���뼺�� �ִ�. ������, 
		//GUI ���α׷��� ��� Ư�� �̺�Ʈ �����ڵ�� Ư�� Ŭ������ �������̱� ������
		//���뼺�� ����� ��������. �� ���
		//�����ڰ� .java���� ������, �μ��� ���� ��ü�� �Ѱܹ޴� ���� �ؾ��ұ�? -�� �ʿ� ����.
		//�� ���� Ŭ������ �Ϻη� Ŭ������ ������� �������
		txt.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				//���� ��ü�̹Ƿ� area, txt �޾ƿ� �ʿ䵵 ����
				int key=e.getKeyCode();
				if(key==KeyEvent.VK_ENTER){
					String msg=txt.getText();
					area.append(msg+"\n");
					txt.setText("");
					
				}
			}
		}); 
		
		//�����͸� Ŭ������ ����
		//�����͸� �޼��� �ڵ� �ȿ��� �ڽ��� ������ 
		//�ܺ��� Ŭ����(MyFrame)�� ��������� ����ó�� �� �� �ִ�.
		//�ڰ��� ���� ����
		//���� �͸� Ŭ���� ������� ��� ������ ��������� ������ �� �ִٴ� ���ε�, 
		//���� �����ڰ� ���������� �����͸����� ����ϰ��� �Ҷ���
		//�� ���������� final�� ����Ǿ� �־�� �Ѵ�.
		//int a=9; // �������� ���������̹Ƿ� ���� �Ұ���
		
		bt.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("������?");
				//a=8;
			}
		});
		
		setVisible(true);
		setSize(300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		new MyFrame();
		
	}

}
