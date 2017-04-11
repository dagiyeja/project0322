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
		bt=new JButton("나 버튼");
		
		setLayout(new FlowLayout());
		
		add(txt); //add(txt=new JTextField(20)); 도 가능
		add(bt);
		add(area);
		
		//txt와 리스너와의 연결
		//.java 파일을 만들기 싫은 경우, 클래스 코드 자체를 메서드의 인수나, 
		//클래스의 멤버변수 등에 바로 대입할 수도 있다.
		//내부 익명 클래스의 부모(keyAdapter) 먼저 메모리에 올림->그리고 자식이 오버라이드
		//내부익명클래스를 사용하는 이유?
		//Anonymous inner class 
		//.java vs 내부익명
		//재사용 유무에 따라 적절히 사용
		//내부익명은 주로 이벤트리스너에 연결할 때 쓰인다.
		//.java를 물리적으로 원본소스까지 작성하는 이유는 
		//코드의 재사용성에 있다. 하지만, 
		//GUI 프로그래밍 등에서 특히 이벤트 구현코드는 특정 클래스에 종속적이기 때문에
		//재사용성이 상당히 떨어진다. 이 경우
		//개발자가 .java까지 만들어가며, 인수를 통해 객체를 넘겨받는 수고를 해야할까? -할 필요 없다.
		//즉 현재 클래스의 일부로 클래스를 존재시켜 사용하자
		txt.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				//같은 몸체이므로 area, txt 받아올 필요도 없다
				int key=e.getKeyCode();
				if(key==KeyEvent.VK_ENTER){
					String msg=txt.getText();
					area.append(msg+"\n");
					txt.setText("");
					
				}
			}
		}); 
		
		//내부익명 클래스의 장점
		//내부익명 메서드 코드 안에서 자신을 포함한 
		//외부의 클래스(MyFrame)에 멤버변수를 내것처럼 쓸 수 있다.
		//자격증 시험 문제
		//내부 익명 클래스 사용으로 얻는 이점은 멤버변수를 공유할 수 있다는 것인데, 
		//만일 개발자가 지역변수를 내부익명내에서 사용하고자 할때는
		//그 지역변수는 final로 선언되어 있어야 한다.
		//int a=9; // 생성자의 지역변수이므로 접근 불가능
		
		bt.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("눌렀어?");
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
