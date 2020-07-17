/*Application to demonstrate use of Scanner class create an Application to accept
 name, age, 4-digit code, cpi, mobile no, passed and display these values to user in the given format
 Name : Vaibhav Diwan
 Age : 36
 4-digit Code : 1122
 cpi : 6.6
 Mobile No : 9754435581
 Passed : false
 */

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter your full name");
        String name = object.nextLine();
        System.out.println("Enter your age");
        byte age = object.nextByte();
        System.out.println("Enter 4-digit code");
        short code = object.nextShort();
        System.out.println("Enter your cpi");
        double cpi = object.nextDouble();
        System.out.println("Enter your mobile no");
        long mobileno = object.nextLong();
        System.out.println("Enter your exam status true for pass/false for fail ");
        boolean passed = object.nextBoolean();
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("4-digit Code : " + code);
        System.out.println("cpi : " + cpi);
        System.out.println("Mobile No : " + mobileno);
        System.out.println("Passed : " + passed);


    }
}
