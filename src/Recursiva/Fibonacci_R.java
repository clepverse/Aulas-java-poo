package Recursiva;

import java.util.Scanner;

public class Fibonacci_R {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Dê um valor limite: ");
        int l = s.nextInt();
        for (int i = 0; i < l; i++) {
            System.out.println(calcFibonacci(i));
        }
    }
    private static int calcFibonacci(int n) {
        return (n < 2) ? n : calcFibonacci(n - 1) + calcFibonacci(n - 2);
    }
}
