package Recursiva;

import java.util.Scanner;

public class Soma_R {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            int resposta = somaAlgarismo(i);
            System.out.print(" "+ resposta);
        }
    }
    public static int somaAlgarismo (int n) {
        if(n < 10) {
            return n;
        }else
            return somaAlgarismo(n/10) + n%10;
    }

}
