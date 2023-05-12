package project;
import java.util.Scanner;
public class Date {



        int day;
        int month;
        int year;
        void setter(){
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter the Hire Date day, month, year : ");
            day =sc.nextInt();
            month= sc.nextInt();
            year=sc.nextInt();
            sc.close();
        }
        void getter(){
            System.out.println("Hire Date : " +day+"/"+month+"/"+year);

        }
    }


