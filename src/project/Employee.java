package project;
import java.util.Scanner;
public class Employee {




        String name;
        int empid;
        double salary;
        Date hiredate =new Date();
        String jobPosition;
        String contactNumber;
        Address address = new Address();
        Employee(Employee e){
            name = e.name;
            empid = e.empid;
            salary =e.salary;
            hiredate = e.hiredate;
            jobPosition =e.jobPosition;
            contactNumber =e.contactNumber;
            address = e.address;
        }
        Employee(){
            Scanner sc =new Scanner(System.in);

            System.out.println("Enter your name : ");
            name= sc.nextLine();
            System.out.println("Enter the Employee ID : ");
            empid=sc.nextInt();
            System.out.println("Enter the Salary :");
            salary=sc.nextDouble();
            hiredate.setter();
            System.out.println("Enter the Job Position : ");
            jobPosition=sc.nextLine();
            System.out.println("Enter the contact number (with country code) : ");
            contactNumber=sc.nextLine();
            address.setter();
            sc.close();
        }
        void display(){
            System.out.println("The name : "+name);
            System.out.println("Employee ID : "+empid);
            System.out.println("The Salary : "+salary);
            hiredate.getter();
            System.out.println("Job Position : "+jobPosition);
            System.out.println("Contact number : "+contactNumber);
            address.getter();
        }
        String countryCode(){
            String s="";
            for(int i =0;i<3;i++) {
                s= s + contactNumber.charAt(i);
            }

            return s;
        }
    }


