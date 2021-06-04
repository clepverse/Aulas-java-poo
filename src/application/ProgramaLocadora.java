package application;

import java.util.Scanner;

class Programalocadora {
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o preço:");
        Double preco = s.nextDouble();

        System.out.print("Digite o preço do aluguel:");
        Double preco_aluguel = s.nextDouble();



        DVD d = new DVD("Matrix",preco, preco_aluguel);
        System.out.println("Título do DVD: "+d.getTitulo() );
        System.out.println("Preço do DVD: "+d.getPreco_venda() );

    }
}
class DVD   {
    private String titulo;
    private double preco_venda;
    private double preco_aluguel;

    public DVD(String titulo, double preco_venda, double preco_aluguel) {
        this.titulo = titulo;
        this.preco_venda = preco_venda;
        this.preco_aluguel = preco_aluguel;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getPreco_venda() {
        return preco_venda;
    }
    public void setPreco_venda(double preco_venda) {
        this.preco_venda = preco_venda;
    }
    public double getPreco_aluguel() {
        return preco_aluguel;
    }
    public void setPreco_aluguel(double preco_aluguel) {
        this.preco_aluguel = preco_aluguel;
    }

    public double getAluguelDevido(int dias)  {
        return preco_aluguel*dias;
    }

}

