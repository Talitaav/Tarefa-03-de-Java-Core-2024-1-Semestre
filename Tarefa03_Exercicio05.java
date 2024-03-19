package exercicio05;

//5) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
//A fórmula de conversão é F = (9*C + 160)/5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

import java.util.Scanner;

public class Tarefa03_Exercicio05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a temperatura em graus Celsius: ");
		double celsius = sc.nextDouble();
		double fahrenheit = (9 * celsius + 160) / 5;

		System.out.println("A temperatura de fahrenheit é: " + fahrenheit);

		sc.close();
	}
}
