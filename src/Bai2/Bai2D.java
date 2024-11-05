package Bai2;

import java.util.Scanner;

public class Bai2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of multiplication table: ");
        int n = sc.nextInt();

        if (n < 1 || n > 10){
            System.out.println("Invalid size");
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }
    }
}
