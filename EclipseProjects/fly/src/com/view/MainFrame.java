package com.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import listener.FrameMouseListener;
import listener.FrameMouseMotionListener;

public class MainFrame extends JFrame {
	
	//�൱��java���͵�������֤����Ҫ�ð汾����
	private static final long serialVersionUID = 11; 
	//����Ŀ��Ⱥͳ���
	public static int FrameWidth = 512;
	public static int FrameHeight = 768;
	
	public MyPanel panel;
	public FrameMouseListener mouselistener;
	public FrameMouseMotionListener mousemotionlistener;
	
	//���췽��
	public MainFrame() {
		//������ȡ������Ļ�ĳߴ�
		Dimension screnSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		setBounds(((int)screnSize.getWidth()-FrameWidth)/2, 0, FrameWidth, FrameHeight);
		
		//������ڲ��ֹ�����
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