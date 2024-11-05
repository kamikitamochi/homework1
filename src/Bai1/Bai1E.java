package Bai1;

import java.util.Scanner;

public class Bai1E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a == b && a == c){
            System.out.println("All numbers are equal");
        } else if (a > b){
            System.out.println("a (" + a + ") is the biggest number");
        } else if (b > c){
            System.out.println("b (" + b + ") is the biggest number");
        } else {
            System.out.println("c (" + c + ") is the biggest number");
        }
    }
}
