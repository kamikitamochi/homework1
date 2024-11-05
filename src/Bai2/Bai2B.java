package Bai2;

import java.util.Scanner;

public class Bai2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");

        int num = sc.nextInt();

        for (int i = 1; i <= num - 1; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
