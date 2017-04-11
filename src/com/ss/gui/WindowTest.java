/*
 이벤트 프로그래밍시 리스너가 인터페이스이기 때문에 단 하나라도 메서드를 오버라이드하지 않으면
 구현 강제의 약속을 어기게 되어, 컴파일 에러가 발생한다..
 이 원칙은 특히나 추상메서드를 많이 보유한 인터페이스일 경우 너무 비효율적이고 피곤하다..
 
 해결책)개발자를 대신하여 이미 리스너의 메서드들을 재정의해놓은 객체들을 가리켜 어댑터라 한다!!
 but, 어댑터는 무조건 지원되는 것이 아니라, 경험상 보통 3개이상의 추상메서드를 보유한 리스너라면 
 어댑터 지원을 일단 의심해봐야 한다..
 
 */

package com.ss.gui;

import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*윈도우 이벤트를 구현해본다*/
public class WindowTest extends JFrame{
	JButton bt;
	
	public WindowTest(){
		JButton bt=new JButton("나버튼");
		setLayout(new FlowLayout());
		add(bt);
		
		this.addWindowListener(new MyAdapter()); // 이벤트의 주체가 나(윈도우)이므로 this
		setSize(300,400);
		setVisible(true);
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		//밑에 close관련 메서드 있으므로 쓸필요 없다.
		
	}

	public static void main(String[] args) {
		new WindowTest();
	}
}
