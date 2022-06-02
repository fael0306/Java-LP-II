public class Pessoa {
	
	static String nome;
	static int idade;
	static double altura;

	Pessoa(String nome, int idade, double altura){
		Pessoa.setNome(nome);
		Pessoa.setIdade(idade);
		Pessoa.setAltura(altura);
	}

	public static void setNome(String nome) {
		Pessoa.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public static void setIdade(int idade) {
		Pessoa.idade = idade;
	}

	public int getIdade() {
		return idade;
	}
	
	public static void setAltura(double altura){
		Pessoa.altura = altura;
	}
	
	public double getAltura(){
		return altura;
	}
}
