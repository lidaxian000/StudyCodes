package com.model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import com.view.MyPanel;

public class Bullet {
	public int width;
	public int height;
	public int x;
	public int y;
	
	public Image[] images = new Image[] {
			Toolkit.getDefaultToolkit().getImage("src/images/bullet01.png"),
			Toolkit.getDefaultToolkit().getImage("src/images/bullet02.png"),
			Toolkit.getDefaultToolkit().getImage("src/images/bullet03.png"),
			Toolkit.getDefaultToolkit().getImage("src/images/bullet04.png"),
			Toolkit.getDefaultToolkit().getImage("src/images/bullet05.png"),
			Toolkit.getDefaultToolkit().getImage("src/images/bullet06.png")
	};
	
	public int imageIndex = 0;
	public MyPanel mypanel;
	
	public Bullet(MyPanel mypanel) {
		this.mypanel = mypanel;
		this.width = 15;
		this.height = 15;
	}
	
	public void drawSelf(Graphics g) {
		g.drawImage(this.images[this.imageIndex], this.x, this.y, this.width, this.height, null);
		if(this.mypanel.timer % 1 ==0) {
			this.imageIndex ++;
			this.y --;
			if(imageIndex >= images.length) {
				this.imageIndex = 0;
			}
		}
		if(y < 0) {
			this.mypanel.bullets.remove(this);
		}
		for(int i = 0; i < this.mypanel.enemies.size(); ++i) {
			Enemy e = this.mypanel.enemies.get(i);
			if(e.hp > 0) {
				if((this.x >=  e.x - this.width)&&(this.x <= e.x + e.width)&&(this.y >= e.y-this.y)&&(this.y <= e.y + this.height)) {
					this.mypanel.bullets.remove(this);
					e.underAttact();
				}
			}
		}
	}
		
}
