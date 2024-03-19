package exercicio10;

//10) Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B,
//e efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a 
//possuir o valor da variável A.Apresentar os valores trocados.

import java.util.Scanner;

public class Tarefa03_Exercicio10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor para A: ");
		String valorA = sc.nextLine();

		System.out.print("Digite o valor para B: ");
		String valorB = sc.nextLine();

		System.out.println("Valores antes da troca:");
		System.out.println("A: " + valorA);
		System.out.println("B: " + valorB);

		String troca = valorA;
		valorA = valorB;
		valorB = troca;

		System.out.println("Valores depois da troca:");
		System.out.println("A: " + valorA);
		System.out.println("B: " + valorB);

		sc.close();
	}

}
