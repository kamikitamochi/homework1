package Bai2;

public class Bai2E {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        int sum = 0;
        while (count < 20){
            if(i % 7 == 0){
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println("The sum of the first 20 number that divide by 7 is: " + sum);
    }
}
