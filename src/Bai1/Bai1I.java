package Bai1;

import java.util.Scanner;

public class Bai1I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        float grade = sc.nextFloat();

        if (grade < 0 || grade > 10) {
            System.out.println("Invalid grade");
            return;
        }

        if (grade > 8.5){
            System.out.println("Excellent");
        } else if (grade > 7){
            System.out.println("Good");
        } else if (grade > 5){
            System.out.println("Average");
        } else {
            System.out.println("Bad");
        }
    }
}
