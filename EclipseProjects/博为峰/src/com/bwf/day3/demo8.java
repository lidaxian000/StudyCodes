package com.bwf.day3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class demo8 {

	public static void main(String[] args) {
		//建立两个按钮，用来设置模态和非模态
		JButton btn1 = new JButton("模态对话框");
		JButton btn2 = new JButton("非模态对话框");
		JFrame f = new JFrame("对话框练习");
		f.setSize(300, 300);
		f.setLayout(new FlowLayout());
		f.add(btn1);
		f.add(btn2);
		
		//设置关闭方法
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		//处理对话框组件
		final JLabel label = new JLabel();
		final JDialog dialog = new JDialog(f, "Dialog窗口");
		dialog.setSize(220, 150);
		dialog.setLocation(330, 250);
		dialog.setLayout(new FlowLayout());
		
		JButton btn3 = new JButton("确定");
		dialog.add(btn3);
		
		//为模态对话框按钮1添加动作事件
		btn1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// 设置对话框为模态
				dialog.setModal(true);
				//如果JDialog窗口中没有JLable标签，就把JLabel添加进去
				if(dialog.getComponents().length == 1) {
					dialog.add(label);
				}
				label.setText("模态对话框，点击确认按钮关闭！");
				dialog.setVisible(true);
			}});
		
		//为非模态对话框按钮2添加动作事件
		btn2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				dialog.setModal(false);
				if(dialog.getComponents().length == 1) {
					dialog.add(label);
				}
				label.setText("非模态对话框，点击确认按钮关闭！");
				dialog.setVisible(true);
			}
			
		});
		
		//为对话框确定按钮3添加动作事件
		btn3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				dialog.dispose();
			}
			
		});
		
	}

}






