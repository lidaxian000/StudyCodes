package com.bwf.day1;

public class test {

	public static void printM(int weight, int height) {
		for (int i = 0; i <= height; i++) {
			for (int j = 0; j <= weight; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printM(3, 4);
	}
	

}
