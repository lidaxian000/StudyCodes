package com.model;

import java.awt.Toolkit;

import com.view.MainFrame;
import com.view.MyPanel;

public class Enemy06 extends Enemy {

	public Enemy06(MyPanel mypanel) {
		super(mypanel);
		this.width = 193;
		this.height = 132;
		this.x = (int)(Math.random()*(MainFrame.FrameWidth - this.width));
		this.y = (0 - this.height);
		this.image = Toolkit.getDefaultToolkit().getImage("src/images/enemy06.png");
		this.speed = 3;
		this.hp = 6;
		this.pointer = 500;
		this.items = new Item[] { 
			new Item03(mypanel), 
			new Item01(mypanel), 
			new Item01(mypanel), 
			new Item01(mypanel), 
			new Item01(mypanel) 
		};
	}
	
}
