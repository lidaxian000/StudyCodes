package base.ch2.CreateClass;

/**
 * 调用Employee类
 */

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Jihaitao", 1000, 1997, 5, 12);
        staff[1] = new Employee("lidada", 2000, 1997, 4, 28);
        staff[2] = new Employee("name", 3000, 2018, 11, 29);

        for (Employee e:staff)
            e.raiseSalary(5);

        for (Employee e:staff){
            e.setId();
            System.out.println("id: "+ e.getId() + ",name="+e.getName()+
                    ",salary="+e.getSalary()+ ",hireDay="+e.getHireDay());
        }

        int n = Employee.getNextId();
        System.out.println("Next available id=" + n);

    }
}
