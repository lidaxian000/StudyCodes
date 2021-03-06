package com.model;

import java.awt.Toolkit;

import com.view.MainFrame;
import com.view.MyPanel;

public class Enemy10 extends Enemy {

	public Enemy10(MyPanel mypanel) {
		super(mypanel);
		this.width = 260;
		this.height = 199;
		this.x = (int)(Math.random()*(MainFrame.FrameWidth - this.width));
		this.y = (0 - this.height);
		this.image = Toolkit.getDefaultToolkit().getImage("src/images/enemy10.png");
		this.speed = 3;
		this.hp = 12;
		this.pointer = 2000;
		this.items = new Item[] { 
			new Item05(mypanel), 
			new Item02(mypanel), 
		    new Item02(mypanel), 
		    new Item02(mypanel), 
		    new Item02(mypanel) 
		};
	}
	
}
