package com.model;

import java.awt.Toolkit;

import com.view.MainFrame;
import com.view.MyPanel;

public class Enemy09 extends Enemy {

	public Enemy09(MyPanel mypanel) {
		super(mypanel);
		this.width = 248;
		this.height = 200;
		this.x = (int)(Math.random()*(MainFrame.FrameWidth - this.width));
		this.y = (0 - this.height);
		this.image = Toolkit.getDefaultToolkit().getImage("src/images/enemy09.png");
		this.speed = 2;
		this.hp = 10;
		this.pointer = 2000;
		this.items = new Item[] { 
			new Item05(mypanel), 
			new Item03(mypanel), 
			new Item03(mypanel), 
			new Item01(mypanel), 
			new Item01(mypanel) 
		};
	}
	
}
