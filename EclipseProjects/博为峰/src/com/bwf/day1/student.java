package com.bwf.day1;

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentInfo stu1 = new studentInfo();
		studentInfo stu2 = new studentInfo();
		studentInfo.schoolname = "江苏科技大学";
		System.out.println(stu1.schoolname);
		System.out.println(stu2.schoolname);
		studentInfo.show();
		stu1.show();
		stu1.showNumber1();
	}

}
class studentInfo{
	static String schoolname;
	private int number1 = 1;
	private static int number2 = 2;
	
	public studentInfo() {
		System.out.println("构造方法");
	}
	
	static {
		System.out.println("静态语句块");
	}
	
	public void showNumber1() {
		System.out.println(number1);
	}
	
	public static void show() {
		System.out.println(number2);
	}
	
	
	public String toString() {
		return schoolname;
	}
}