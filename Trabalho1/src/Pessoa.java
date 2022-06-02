public class Pessoa {

    String nome;
    int idade;
    double altura;

    Pessoa(String nome, int idade, double altura) {
        setNome(nome);
        setIdade(idade);
        setAltura(altura);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
}