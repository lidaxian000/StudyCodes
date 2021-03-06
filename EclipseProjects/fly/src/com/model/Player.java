package com.model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import com.thread.DrawableThread;
import com.view.MainFrame;
import com.view.MyPanel;

public class Player {
	//ͼƬ�Ŀ���
	public int width;
	public int height;
	//��ʼ����
	public int x;
	public int y;
	
	public Image[] images = new Image[] {
		Toolkit.getDefaultToolkit().getImage("src/images/player01.png"),
		Toolkit.getDefaultToolkit().getImage("src/images/player02.png"),
		Toolkit.getDefaultToolkit().getImage("src/images/player03.png"),
		Toolkit.getDefaultToolkit().getImage("src/images/player04.png"),
		Toolkit.getDefaultToolkit().getImage("src/images/player05.png"),
		Toolkit.getDefaultToolkit().getImage("src/images/player06.png"),
		Toolkit.getDefaultToolkit().getImage("src/images/player07.png"),
		Toolkit.getDefaultToolkit().getImage("src/images/player08.png"),
		Toolkit.getDefaultToolkit().getImage("src/images/player09.png"),
		Toolkit.getDefaultToolkit().getImage("src/images/player10.png"),
	};
	
	public int imagesIndex = 0;
	public MyPanel mypanel;
	public int pointer = 0;
	public int attackMode = 1;
	public int powerTime = 0;
	
	public Player(MyPanel mypanel) {
		this.mypanel = mypanel;
		this.width = 100;
		this.height = 100;
		this.x = ((MainFrame.FrameWidth - this.width)/2);
		this.y = (MainFrame.FrameHeight - this.height*2);
	}
	
	public void drawSelf(Graphics g) {
		g.drawImage(this.images[this.imagesIndex], this.x, this.y, this.width, this.height, null);
		if (this.mypanel.timer % 50 == 0) {
			this.imagesIndex ++;
			if (this.imagesIndex >= this.images.length) {
				this.imagesIndex = 0;
			}
		}
		
		if((this.attackMode > 1)&&(this.powerTime > 0)) {
			this.powerTime -= 1;
			if(this.powerTime <= 0) {
				this.attackMode = 1;
			}
		}
		
		for(int i = 0; i < this.mypanel.items.size(); ++ i) {
			Item item = this.mypanel.items.get(i);
			if((this.x < item.x - this.width)||(this.x > item.x + item.width)||(this.y < item.y - item.height)||(this.y > item.y + item.height))
				continue;
			item.eated();
		}
		
	}
	
	
	
}
