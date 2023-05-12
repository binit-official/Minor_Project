package project;
import java.util.Scanner;
public class Address {

        private String address;
        void setter(){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the address : ");
            address =sc.nextLine();

            sc.close();
        }
        void getter(){
            System.out.println("The Address : "+address);
        }
    }


