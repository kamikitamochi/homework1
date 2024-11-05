package Bai1;

import java.util.Scanner;

public class Bai1B {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Vietnam");
        }
        else if (num % 3 == 0) {
            System.out.println("Viet");
        } else if (num % 5 == 0) {
            System.out.println("Nam");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
