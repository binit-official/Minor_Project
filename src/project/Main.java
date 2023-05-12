package project;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void arrangeEmployeeBySalary(Employee[] e){
            for(int i =0 ;i<500 ; i++){
                if(e[i].salary < e[i+1].salary){
                    Employee temp = new Employee(e[i]);
                    e[i]=e[i+1];
                    e[i+1]=temp;
                }
            }
        }

        public static void getEmployeesByJobPosition(Employee[] e, String jp)
        {
            for(int i =0;i<500 ;i++){
                if(Objects.equals(e[i].jobPosition.toLowerCase(), jp.toLowerCase() )){
                    e[i].display();
                }
            }
        }
        public static int foreignEmployeeCount(Employee e[]){
            int n=0 ;
            for(int i =0; i<500; i++){
                if(!Objects.equals(e[i].countryCode(), "+91"))
                    n++;
            }
            return n;
        }
        public static void getEmployeesByHireDate(Employee[] e, Date d1, Date d2) {
            for (int i = 0; i < 500; i++) {
                if (d1.year <= e[i].hiredate.year && d2.year >= e[i].hiredate.year){
                    if(d1.month <= e[i].hiredate.month && d2.month >= e[i].hiredate.month){
                        if(d1.day <= e[i].hiredate.day && d2.day >= e[i].hiredate.day){
                            e[i].display();
                        }
                    }

                }
            }
        }


        public static void getEmployeesBySalary(Employee e[], double s1, double s2){
            for(int i =0;i<500;i++){
                if(s1 <= e[i].salary && e[i].salary <=s2){
                    e[i].display();
                }
            }
        }

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);

            Employee[] e =new Employee[500];

            for(int i =0;i<500;i++){
                e[i] = new Employee();
            }
            arrangeEmployeeBySalary(e);
            getEmployeesByJobPosition(e,"Manager");
            Date d1=new Date();
            Date d2 = new Date();
            getEmployeesByHireDate(e,d1,d2);
            System.out.println(foreignEmployeeCount(e));
            getEmployeesBySalary(e,150000,300000);

            sc.close();
        }
    }

