package application;

class Person {

    public static void main(String[] args) {


    }

}
class Pessoa {

    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private boolean sexo;

    public Pessoa(String nome, int idade, double altura, double peso, boolean sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }


    public double getIMC()  {
        return peso / (altura*altura);
    }

    public String getCategoriaIMC()  {
        String s = "";
        double IMC = getIMC();
        if (IMC <=18.5)
            s = s + "Abaixo do peso normal";
        else if (IMC <=25)
            s = s + "Peso normal";
        else if (IMC <=30)
            s = s + "Acima do Peso normal";
        else
            s = s + "obesidade";
        return s;
    }

    public String toString()  {
        return "nome: " + getNome() +
                "  categoria:  " + getCategoriaIMC();
    }
}
