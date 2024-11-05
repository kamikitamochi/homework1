package Bai1;

import java.util.Scanner;

public class Bai1A {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        }
        else {
            System.out.println(num + " is odd. Square of " + num + " is " + (num*num));
        }
    }
}
