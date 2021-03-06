package com.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import listener.FrameMouseListener;
import listener.FrameMouseMotionListener;

public class MainFrame extends JFrame {
	
	//相当于java类型的身份验证，主要用版本控制
	private static final long serialVersionUID = 11; 
	//窗体的宽度和长度
	public static int FrameWidth = 512;
	public static int FrameHeight = 768;
	
	public MyPanel panel;
	public FrameMouseListener mouselistener;
	public FrameMouseMotionListener mousemotionlistener;
	
	//构造方法
	public MainFrame() {
		//用来获取整个屏幕的尺寸
		Dimension screnSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		setBounds(((int)screnSize.getWidth()-FrameWidth)/2, 0, FrameWidth, FrameHeight);
		
		//清除窗口布局管理器
		setLayout(null);
		
		this.panel = new MyPanel();
		this.panel.setBounds(0, 0, getWidth(), getHeight());
		this.add(panel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		this.mouselistener = new FrameMouseListener();
		this.mouselistener.mainframe = this;
		addMouseListener(mouselistener);
		this.mousemotionlistener = new FrameMouseMotionListener();
		this.mousemotionlistener.mainframe = this;
		addMouseMotionListener(mousemotionlistener);
	}
	
}
