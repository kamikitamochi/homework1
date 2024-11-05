package Bai2;

import java.util.Scanner;

public class Bai2A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");

        int num = sc.nextInt();

        if (num <= 0 || num == 1) {
            System.out.println("The number is invalid");
        } else {
            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
            System.out.println("The sum is: " + sum);
        }
    }
}
