package exercicio03;

//3) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
//  Calcular e escrever o valor do novo salário.*/

import java.util.Scanner;

public class Tarefa03_Exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o salário mensal atual: ");
		double atual = sc.nextDouble();

		System.out.println("Informe o reajuste em percentual: ");
		double reajuste = sc.nextDouble();

		double novoSalario = atual + (atual * (reajuste / 100));

		System.out.println("O novo salário do funcionário é: " + novoSalario);

		sc.close();

	}

}
