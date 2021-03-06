package com.bwf.day3;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class demo1 {
	public static void main(String[] args) {
		new Cardlayout();
	}
}

class Cardlayout extends Frame implements ActionListener{
	Panel cardPanel = new Panel();//定义Panel面板设置卡片
	Panel controlPanel = new Panel();//定义Panel面板设置按钮
	Button nextbutton, prebutton;//声明两个按钮
	CardLayout cardlayout = new CardLayout();//定义卡片布局
	
	//定义构造方法，设置卡片布局管理器的属性
	public Cardlayout(){
		setSize(300, 200);
		setVisible(true);
		cardPanel.setLayout(cardlayout);
		
		//在cardPanel面板设置三个Label
		cardPanel.add(new Label("第一页界面", Label.CENTER));
		cardPanel.add(new Label("第二页界面", Label.CENTER));
		cardPanel.add(new Label("第三页界面", Label.CENTER));
		
		//创建两个按钮对象
		nextbutton = new Button("下一张卡片");
		prebutton = new Button("上一张卡片");
		
		//为按钮对象注册监听器
		nextbutton.addActionListener(this);
		prebutton.addActionListener(this);
		
		//将按钮添加到card Panel面板中去
		controlPanel.add(prebutton);
		controlPanel.add(nextbutton);
		
		this.add(cardPanel, BorderLayout.CENTER);
		this.add(controlPanel, BorderLayout.SOUTH);
	}

	//实现按钮的监听出发，并且对触发事件做出相应的处理

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == nextbutton) {
			//切换面板中的组件，若当前的组件为最后一个，则显示第一个组件
			cardlayout.next(cardPanel);
		}
		if(e.getSource() == prebutton) {
			cardlayout.previous(cardPanel);
		}
	}
	
	
}