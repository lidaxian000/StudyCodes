package com.model;

import java.awt.Image;
import java.awt.Toolkit;

import com.view.MyPanel;

public class Item03 extends Item {

	public Item03(MyPanel myPanel) {
		super(myPanel);
		this.width = 30;
		this.height = 30;
		this.images = new Image[] {
				Toolkit.getDefaultToolkit().getImage("src/images/diamond02.png")
		};
		this.pointer = 2000;
		this.atttackMode = 1;
		this.powerTime = 0;
		this.speed = (int)(Math.random()*3.0D + 3.0D);
	}

}
