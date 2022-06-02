import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
    	
     ArrayList < Pessoa > pessoas = new ArrayList();
     
        try {

            for (int i = 0; i <= 2; i++) {

                Scanner s1 = new Scanner(System.in);
                System.out.println("Digite o nome: ");
                String nome = s1.next();

                Scanner s2 = new Scanner(System.in);
                System.out.println("Digite a idade: ");
                int idade = s2.nextInt();

                Scanner s3 = new Scanner(System.in);
                System.out.println("Digite a altura: ");
                float altura = s3.nextFloat();

                Pessoa pessoa = new Pessoa(nome, idade, altura);

                pessoas.add(pessoa);

            }
        } catch (InputMismatchException e) {
            System.out.println("Você digitou um tipo errado.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Há algo de errado com sua lista.");
        }

        DecimalFormat df = new DecimalFormat("#.00");

        for (int k = 0; k <= 2; k++) {

            System.out.println("\nNome: " + pessoas.get(k).getNome());
            System.out.println("Idade: " + pessoas.get(k).getIdade());
            System.out.println("Altura: " + df.format(pessoas.get(k).getAltura()));
            System.out.print("");

        }
    }
}