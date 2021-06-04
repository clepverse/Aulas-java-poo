package Recursiva;

import java.util.Scanner;

public class Potencia_R {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o valor de X: ");
        double x = s.nextDouble();
        System.out.print("Digite o valor de Y: ");
        int y = s.nextInt();
        double resp = potencia(x,y);
        System.out.println(x+ " elevado a "+ y+ " = "+resp);
        s.close();
    }
    /*public static double potencia(double x, int y) {
        if (y == 0)
            return 1;
        else
            return x * potencia(x, y - 1);
    }*/
    public static double potencia(double x, int y) {
        return (y == 0) ? 1 : x * potencia(x, y - 1);

    }
}
