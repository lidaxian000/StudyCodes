package com.model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import com.view.MainFrame;
import com.view.MyPanel;

public class Enemy {
	public int x;
	public int y;
	public int width;
	public int height;
	public int speed;
	public int hp;
	public int pointer = 0;
	public Image image;
	public MyPanel mypanel;
	
	public Image[] images = new Image[] {
			Toolkit.getDefaultToolkit().getImage("src/images/die01.png"),
			Toolkit.getDefaultToolkit().getImage("src/images/die02.png"),
			Toolkit.getDefaultToolkit().getImage("src/images/die03.png"),
			Toolkit.getDefaultToolkit().getImage("src/images/die04.png"),
	};
	
	
	public int imageIndex = 0;
	public Item[] items = null;
	
	public Enemy(MyPanel mypanel) {
		this.mypanel = mypanel;
	}
	
	public void drawSelf(Graphics g) {
		if(this.hp > 0) {
			g.drawImage(this.image, this.x, this.y, this.width, this.height, null);
		}else {
			this.x = (this.x + this.width/2 - 22);
			this.y = (this.y + this.height/2 - 22);
			this.width = 45;
			this.height = 45;
			g.drawImage(this.images[this.imageIndex], this.x, this.y, this.width, this.height, null);
			
			if(this.mypanel.timer % 10 == 0) {
				this.imageIndex ++;
				if(this.imageIndex >= images.length) {
					killed();
				}
			}
		
		}
		if(this.mypanel.timer % this.speed == 0) {
			this.y ++;
			if(this.y > MainFrame.FrameHeight) {
				this.mypanel.enemies.remove(this);
			}
		}
		
	}
	
	private void killed() {
		this.mypanel.player.pointer += this.pointer;
		if ((this.items != null) && (this.items.length > 0)){
	      for (int i = 0; i <= this.items.length - 1; i++){
	        Item item = this.items[i];
	        item.y = this.y;
	        if (i == 0)
	          item.x = (this.x + this.width / 2 - item.width / 2);
	        else if (i == 1)
	          item.x = (this.x + this.width / 2 - item.width / 2 - item.width - 10);
	        else if (i == 3)
	          item.x = (this.x + this.width / 2 - item.width / 2 - item.width * 2 - 20);
	        else if (i == 2)
	          item.x = (this.x + this.width / 2 - item.width / 2 + item.width + 10);
	        else if (i == 4) {
	          item.x = (this.x + this.width / 2 - item.width / 2 + item.width * 2 + 20);
	        }
	        this.mypanel.items.add(item);
	      }
	    }
		this.mypanel.enemies.remove(this);
	}

	public void underAttact() {
		if(this.hp > 0) {
			this.hp -= 1;
		}
	}
		
}
