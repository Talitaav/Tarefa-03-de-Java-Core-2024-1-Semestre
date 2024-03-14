package exercicio04;

import java.util.Scanner;

/*4) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.*/

public class Tarefa03_Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o custo de fábrica do carro: ");
		double custoF = sc.nextDouble();

		double distribuidor = 0.28;
		double impostos = 0.45;

		double custoConsumidor = custoF + (custoF * distribuidor) + (custoF * impostos);

		System.out.println("O custo final ao consumidor é: R$" + custoF);

		sc.close();

	}
}
