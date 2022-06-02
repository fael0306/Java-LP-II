import java.text.DecimalFormat;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = s1.next();
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = s2.nextInt();
		
		Scanner s3 = new Scanner(System.in);
		System.out.println("Digite sua altura: ");
		float altura = s3.nextFloat();
		
		Pessoa eu = new Pessoa(nome, idade, altura);
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Nome da pessoa1: " + eu.getNome());
		System.out.println("Idade da pessoa1: " + eu.getIdade());
		System.out.println("Altura da pessoa1: " + df.format(eu.getAltura()));
		
	}
}
