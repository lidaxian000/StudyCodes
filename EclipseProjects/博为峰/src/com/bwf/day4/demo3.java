package com.bwf.day4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class demo3 extends JFrame {
	
	JComboBox combobox;
	JTextField field;
	JPanel panel;
	
	public demo3() {
		panel = new JPanel();
		combobox = new JComboBox();
		field = new JTextField(20);
		
		combobox.addItem("请选择城市");
		combobox.addItem("北京");
		combobox.addItem("上海");
		
		combobox.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String item = (String)combobox.getSelectedItem();
				if("请选择城市".equals(item)) {
					field.setText("");
				}else {
					field.setText("您的城市是：" + item);
				}
			}
		});
		
		panel.add(combobox);
		panel.add(field);
		this.add(panel, BorderLayout.NORTH);
		this.setTitle("下拉选择框");
		this.setLocation(300, 400);
		this.setSize(500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new demo3();
	}

}
