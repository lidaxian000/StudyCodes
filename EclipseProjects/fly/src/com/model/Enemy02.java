package com.model;

import java.awt.Toolkit;

import com.view.MainFrame;
import com.view.MyPanel;

public class Enemy02 extends Enemy {

	public Enemy02(MyPanel mypanel) {
		super(mypanel);
		this.width = 102;
		this.height = 79;
		this.x = (int)(Math.random()*(MainFrame.FrameWidth - this.width));
		this.y = (0 - this.height);
		this.image = Toolkit.getDefaultToolkit().getImage("src/images/enemy02.png");
		this.speed = 3;
		this.hp = 3;
		this.pointer = 100;
		this.items = new Item[] {
			new Item01(mypanel), 
			new Item01(mypanel), 
			new Item01(mypanel)
		};
	}
	
}
