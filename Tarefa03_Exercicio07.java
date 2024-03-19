package exercicio07;

//7) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: Volume = π*Raio2*Altura

import java.util.Scanner;

public class Tarefa03_Exercicio07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o raio da lata de óleo: ");
		double raio = sc.nextDouble();
		
		System.out.println("Informe a altura da lata de óleo: ");
		double altura = sc.nextDouble();
		
		double volume = Math.PI * Math.pow(raio,2) * altura;
		
		System.out.println("O volume da lata de óleo é: " +volume);
		
		sc.close();
		

	}
}
