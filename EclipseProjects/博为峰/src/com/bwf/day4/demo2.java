package com.bwf.day4;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class demo2 extends JFrame {

	JLabel label;
	JCheckBox italic;
	JCheckBox bold;
	JPanel panel;
	
	public demo2() {
		
		label = new JLabel("江苏科技大学", JLabel.CENTER);
		label.setFont(new Font("黑体", Font.PLAIN, 20));
		this.add(label);
		
		panel = new JPanel();
		italic = new JCheckBox("斜体");
		bold = new JCheckBox("粗体");
		
		ActionListener listener = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int mode = 0;
				if(bold.isSelected()) {
					mode += Font.BOLD;
				}
				if(italic.isSelected()) {
					mode += Font.ITALIC;
				}
				label.setFont(new Font("宋体", mode, 20));
			}
		
		};
		
		italic.addActionListener(listener);
		bold.addActionListener(listener);
		
		panel.add(italic);
		panel.add(bold);
		
		this.add(panel, BorderLayout.SOUTH);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
		
	
	public static void main(String[] args) {
		new demo2();
	}

}
