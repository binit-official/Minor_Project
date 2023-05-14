package project;

import java.util.Arrays;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

        Employee[] employees = new Employee[500];
        for (int i = 0; i < 500; i++) {
            employees[i] = EmployeeInput.getInput();
        }
        arrangeEmployeeBySalary(employees);
        System.out.println("Employees sorted by salary:");
        for (Employee e : employees) {
            System.out.println(e);
        }


        getEmployeesByJobPosition(employees, "Manager");


        getEmployeesByHireDate(employees, new Date(1, 4, 2022), new Date(31, 3, 2023));


        int foreignCount = foreignEmployeeCount(employees);
        System.out.println("Number of foreign employees: " + foreignCount);


        getEmployeesBySalary(employees, 150000, 300000);
    }

    public static void arrangeEmployeeBySalary(Employee e[]) {
        Arrays.sort(e, (a, b) -> Double.compare(b.getSalary(), a.getSalary()));
    }

    public static void getEmployeesByJobPosition(Employee e[], String jp) {
        System.out.println("Employees with job position " + jp + ":");
        for (Employee emp : e) {
            if (emp.getJobPosition().equals(jp)) {
                System.out.println(emp);
            }
        }
    }

    public static void getEmployeesByHireDate(Employee e[], Date d1, Date d2) {
        d1 = new Date(01,01,2022);
        d2 = new Date(31,12,2022);
        System.out.println("Employees hired between " + d1 + " and " + d2 + ":");
        for (int i = 0; i < e.length; i++) {
            if (e[i].getHireDate().after(d1) && e[i].getHireDate().before(d2)) {
                System.out.println(e[i]);
            }
        }
    }

    public static int foreignEmployeeCount(Employee e[]) {
        int count = 0;
        for (Employee emp : e) {
            if (!emp.getContactNumber().startsWith("99")) {
                count++;
            }
        }
        return count;
    }

    public static void getEmployeesBySalary(Employee e[], double s1, double s2) {
        System.out.println("Employees with salary between " + s1 + " and " + s2 + ":");
        for (Employee emp : e) {
            if (emp.getSalary() >= s1 && emp.getSalary() <= s2) {
                System.out.println(emp);
            }
        }
    }
}

