package Recursiva;

import java.util.Scanner;

public class Fatorial_R {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o número que deseja calcular o fatorial: ");
        int n = s.nextInt();
        int resposta = fatorial(n);
        System.out.println("Fatorial de "+n+ "  é: "+resposta);
    }
    public static int fatorial (int n)  {
        return (n == 0) ? 1 : n*fatorial(n-1);
    }
}