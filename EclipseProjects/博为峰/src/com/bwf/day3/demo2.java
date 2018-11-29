package com.bwf.day3;

import java.awt.Frame;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class demo2 {
	/**事件处理机制
	 * 事件对象(event)：封装了GUI组件上的特定事件(通常指的是用户的一次操作)
	 * 事件源(组件)：事件发生的场所，通常计时产生事件的组件
	 * 监听器(listener)：负责监听事件源上发生的事件，对各种事件作出相应的处理的对象
	 * 事件处理器：监听器对象对收到的额事件对象进行相应的处理的方法
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("窗口事件");
		f.setSize(300, 300);
		f.setLocation(300, 300);
		f.setVisible(true);
		
		MyWindowListener mw = new MyWindowListener();
		f.addWindowListener(mw);
	}

}
class MyWindowListener implements WindowListener{

	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowClosed(WindowEvent e) {
		System.out.println("你触发了我d");
	}
	
	public void windowClosing(WindowEvent e) {
		// 3,4产生事件对象，接收并处理事件对象
		Window window = e.getWindow();
		window.dispose();//隐藏
	}

	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("你触发了我");
	}

	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}












