package Recursiva;

import java.util.Scanner;

public class Triangulo_R {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            int resposta = numero_triangular(i);
            System.out.print(" "+ resposta);
        }
    }
    public static int numero_triangular(int n) {
        return(n == 1) ? 1 : n + numero_triangular(n - 1);
    }
}