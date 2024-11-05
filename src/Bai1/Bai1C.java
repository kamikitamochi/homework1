package Bai1;

import java.util.Scanner;

public class Bai1C {
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a == b){
            System.out.println(a + " + " + b + " = " + (a+b));
        }
        else {
            if (a < b){
                System.out.println(a + " is less than " + b);
            } else {
                System.out.println(a + " is greater than " + b);
            }
        }
    }
}
