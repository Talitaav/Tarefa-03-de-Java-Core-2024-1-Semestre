package exercicio09;

//9) Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).

import java.util.Scanner;

public class Tarefa03_Exrecicio09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da prestação: ");
		double valorPres = sc.nextDouble();
		
		System.out.println("Digite a taxa de juros: ");
		double valorJuros = sc.nextDouble();
		
		System.out.println("Digite o tempo de atraso da prestação: ");
		double tempAtraso = sc.nextDouble();
		
		double valorAtraso = valorPres + (valorPres * valorJuros / 100) * tempAtraso;
		
		System.out.println("O valor da prestação em atraso é: " + valorAtraso);
		
		sc.close();
	}

}
