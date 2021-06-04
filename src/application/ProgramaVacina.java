package application;

class Vacina {

    public static void main(String[] args) {

    }

}

class Animal  {

    private String especie;
    private int idade;
    private boolean vacinado;
    private double preco;
    private String descricao;

    public Animal(String especie, int idade, boolean vacinado, double preco, String descricao) {
        this.especie = especie;
        this.idade = idade;
        this.vacinado = vacinado;
        this.preco = preco;
        this.descricao = descricao;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public boolean isVacinado() {
        return vacinado;
    }
    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}

