package Bai2;

import java.util.Scanner;

public class Bai2C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        while (true) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            if (num == 100){
                break;
            } else {
                System.out.println("You just entered " + num);
                sum += num;
                i++;
            }
        }
        System.out.println("You registered " + i + " number(s). The sum of them is: " + sum);
    }
}
