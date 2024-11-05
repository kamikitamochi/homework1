package Bai2;

public class Bai2G {
    public static void main(String[] args) {
        int firstNum = 0, secondNum = 1;

        System.out.println("First 20 Fibonacci numbers:");

        for (int i = 1; i <= 20; i++) {
            System.out.print(firstNum + " ");
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}
