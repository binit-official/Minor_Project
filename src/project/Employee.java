package project;

import java.util.Date;

import java.util.Scanner;
public class Employee {
    private String name;
    private int empId;
    private double salary;
    private Date hireDate;
    private String jobPosition;
    private String contactNumber;
    private Address address;

    public <Address> Employee(String name, int empId, double salary, Date hireDate, String jobPosition, String contactNumber, Address address){
        this.name = name;
        this.empId = empId;
        this.salary = salary;
        this.hireDate = hireDate;
        this.jobPosition = jobPosition;
        this.contactNumber = contactNumber;
        this.address = (project.Address) address;
    }
    public String getName(){
        return name;
    }
    public int getEmpId(){
        return empId;
    }
    public double getSalary(){
        return salary;
    }
    public Date getHireDate(){
        return hireDate;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
class EmployeeInput {

    public static Employee getInput() {
        Scanner scanner = new Scanner(System.in);

        // Get employee name
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        // Get employee ID
        System.out.print("Enter employee ID: ");
        int empid = scanner.nextInt();

        // Get employee salary
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();

        // Get hire date
        System.out.print("Enter hire date (DD MM YYYY): ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        Date hireDate = new Date(day, month, year);

        // Get job position
        System.out.print("Enter job position: ");
        String jobPosition = scanner.next();

        // Get contact number
        System.out.print("Enter contact number: ");
        String contactNumber = scanner.next();

        // Get address details
        System.out.print("Enter street: ");
        String street = scanner.next();
        System.out.print("Enter city: ");
        String city = scanner.next();
        System.out.print("Enter state: ");
        String state = scanner.next();
        System.out.print("Enter country: ");
        String country = scanner.next();
        System.out.print("Enter zip code: ");
        String zipCode = scanner.next();
        Address address = new Address(street, city, state, country, zipCode);

        return new Employee(name, empid, salary, hireDate, jobPosition, contactNumber, address);
    }
}
