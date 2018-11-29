package Base.ch2;

import java.time.LocalDate;

/**
 * 构造Employee类
 */

class Employee {

    private static int nextId = 1;

    //属性
    private String name;
    private double salary;
    private LocalDate hireDay;

    private int id;


    //构造方法
    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
        id = 0;
    }

    //方法1
    public String getName(){
        return name;
    }

    //方法2
    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public int getId(){ return id; }

    public void setId(){
        id = nextId;
        nextId ++;
    }

    public static int getNextId(){ return nextId; }

    public static void main(String[] args) {
        Employee e = new Employee("Jihaitao", 1000, 1997, 5, 12);
        System.out.println(e.getName() + " " + e.getSalary());
    }

}
