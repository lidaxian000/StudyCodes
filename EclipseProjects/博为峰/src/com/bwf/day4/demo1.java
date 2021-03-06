package com.bwf.day4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class demo1 extends JFrame {
	
	JPanel panel;//声明用来放置三个按钮的画板
	JPanel pallet;//用来做调色板
	ButtonGroup group;
	
	public demo1() {
		pallet = new JPanel();
		this.add(pallet, BorderLayout.CENTER);//将调色板放到CENTER区域
		panel = new JPanel();
		group = new ButtonGroup();
		
		addRadioButton("红");
		addRadioButton("黄");
		addRadioButton("蓝");
		
		this.add(panel, BorderLayout.SOUTH);
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void addRadioButton(final String text) {
		JRadioButton radioButton = new JRadioButton(text);
		group.add(radioButton);
		panel.add(radioButton);
		
		radioButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Color color = null;
				if("红".equals(text)) {
					color = Color.RED;
				}else if("黄".equals(text)) {
					color = Color.YELLOW;
				}else if("蓝".equals(text)) {
					color = Color.BLUE;
				}else {
					color = Color.WHITE;
				}
				panel.setBackground(color);
			}
			
		});
	}
	
	public static void main(String[] args) {
		new demo1();
	}

}
