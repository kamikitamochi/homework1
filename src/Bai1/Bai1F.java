package Bai1;

import java.util.Scanner;

public class Bai1F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.print("This is a ");
        } else {
            System.out.println("This isn't a triangle");
            return;
        }

        if (a == b & a == c){
            System.out.println("Equilateral Triangle.");
        } else if (a == b || b == c) {
            System.out.println("Isosceles Triangle");
        } else if ((a*a) + (b*b) == (c*c) || (a*a) + (c*c) == (b*b) || (b*b) + (c*c) == (a*a)) {
            System.out.println("Right Triangle");
        } else {
            System.out.println("normal Triangle");
        }
    }
}
