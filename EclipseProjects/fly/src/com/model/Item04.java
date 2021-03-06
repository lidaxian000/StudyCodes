package com.model;

import java.awt.Image;
import java.awt.Toolkit;

import com.view.MyPanel;

public class Item04 extends Item {

	public Item04(MyPanel myPanel) {
		super(myPanel);
		this.width = 30;
		this.height = 30;
		this.images = new Image[] {
				Toolkit.getDefaultToolkit().getImage("src/images/power.png")
		};
		this.pointer = 0;
		this.atttackMode = 2;
		this.powerTime = 10000;
		this.speed = (int)(Math.random()*3.0D + 3.0D);
	}

}
