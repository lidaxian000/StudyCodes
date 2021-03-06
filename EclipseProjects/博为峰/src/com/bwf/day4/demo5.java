package com.bwf.day4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class demo5 extends JFrame {
	
	public demo5() {
		final JPopupMenu popopMenu = new JPopupMenu();
		
		JMenuItem refreshItem = new JMenuItem("ˢ��");
		JMenuItem createItem = new JMenuItem("����");
		JMenuItem exitItem = new JMenuItem("�˳�");
		
		exitItem.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		popopMenu.add(refreshItem);
		popopMenu.addSeparator();
		popopMenu.add(createItem);
		popopMenu.addSeparator();
		popopMenu.add(exitItem);
		
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == e.BUTTON3) {
					popopMenu.show(e.getComponent(), e.getX(), e.getY());
				}
			}
		});
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new demo5();
	}

}
