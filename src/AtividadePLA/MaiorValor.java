package AtividadePLA;

import java.util.Scanner;

public class MaiorValor {

    public static void main(String[] args) {
        int maior = 0, linha = 0, coluna = 0, numero = 0;
        boolean control;
        char filtro;
        int[][] quant = new int[2][2];

        Scanner s = new Scanner(System.in);
        System.out.print("DESEJA LIGAR FILTRO PARA NÃO REPETIÇÃO DE NÚMEROS?[S/N]");
        filtro = s.next().charAt(0);

        if ((filtro == 'n') || (filtro == 'N')) {
            System.out.println("[DESATIVADO]");
            System.out.println("Digite os números para preencher a matriz:");
            for (int i = 0; i < quant.length; i++) {
                for (int j = 0; j < quant.length; j++) {
                    System.out.print("Linha[" + i + "] Coluna[" + j + "]:");
                    quant[i][j] = s.nextInt();
                }
            }
        }
        if ((filtro == 's') || (filtro == 'S')) {
            System.out.println("[ATIVADO]");
            System.out.println("Digite os números para preencher a matriz:");
            for (int i = 0; i < quant.length; i++) {
                for (int j = 0; j < quant.length; j++) {
                    System.out.print("Linha[" + i + "] Coluna[" + j + "]:");
                    numero = s.nextInt();
                    control = false;

                    while (control == false) {
                        control = true;
                        for (int m = 0; m < quant.length; m++) {
                            for (int n = 0; n < quant.length; n++) {
                                if (quant[m][n] == numero) {
                                    System.out.println("Número já alocado na matriz");
                                    System.out.print("Linha[" + i + " ] Coluna[" + j + " ] : ");
                                    numero = s.nextInt();
                                    control = false;
                                }
                            }
                        }
                    }
                    quant[i][j] = numero;
                }
            }
        }
        maior = quant[1][1];
        for (int i = 0; i < quant.length; i++) {
            for (int j = 0; j < quant[i].length; j++) {
                if (quant[i][j] > maior) {
                    maior = quant[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        System.out.println("O maior número foi:" + maior);
        System.out.println("Localizado na Linha: [" + linha + "] Coluna[" + coluna + "]");
    }
}
