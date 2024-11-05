package Bai1;

import java.util.Scanner;

public class Bai1D {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid Age");
        } else if (age < 18) {
            System.out.println("You are under 18 years old, thus unable to drive");
        } else {
            System.out.println("You are or above 18 years old, thus able to drive");
        }
    }
}
