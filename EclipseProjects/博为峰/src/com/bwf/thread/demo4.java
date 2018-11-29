package com.bwf.thread;

public class demo4 {

	/***
	 * 	假设售票厅有四个售票窗口，票买100张
	 * 	100张票共享，需要四个线程
	 */
	public static void main(String[] args) {
		new TicketThread().start();
		new TicketThread().start();
		new TicketThread().start();
		new TicketThread().start();
	}

}
class TicketThread extends Thread {
	private int ticket = 100;
	
	public void run() {
		while(true) {
			if(ticket > 0) {
				Thread t = Thread.currentThread();
				String t_name = t.getName();
				System.out.println(t_name + "正在售票" + ticket --);
			}
		}
	}

}