package collectionAssignment;

import java.util.*;

class Employee {
    Double age;
    Double salary;
    String name;

    public Employee(Double age, Double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" + "age=" + age + ", salary=" + salary + ", name='" + name + '\'' + '}';
    }


}

public class Ques5 {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>(10);
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            empList.add(new Employee(
                    (double) rand.nextInt(30)+20,
                    (double) rand.nextInt(20000)+10000,
                    "Name" + (i + 1))
            );
        }

        for (Employee employee : empList) {
            System.out.println(employee);
        }


        Collections.sort(empList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int ret = 0;
                ret = o1.salary > o2.salary ? -1 : 1;
                return ret;
            }
        });

        System.out.println("-------------------------------------------");
        System.out.println("Sorted");
        System.out.println("-------------------------------------------");
        for (Employee employee : empList) {
            System.out.println(employee);
        }

    }
}
