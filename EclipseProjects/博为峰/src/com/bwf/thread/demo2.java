package com.bwf.thread;

public class demo2 {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();//启动线程
		
		while(true) {
			System.out.println("主方法中的run方法");
		}
	}

}

class MyThread extends Thread{
	public void run() {
		while(true) {
			System.out.println("MyThread中的run方法");
		}
	}
}