package exercicio06;

//6) Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius.
//A fórmula deconversão é C=(F-32)*(5/9), sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

import java.util.Scanner;

public class Tarefa03_Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a tempreatura em graus Fahrenheit: ");
		double fahrenheit = sc.nextDouble();

		double celsius = (fahrenheit - 32) * (5.0 / 9.0);

		System.out.println("A temperatura em graus Celsius é: " + celsius);

		sc.close();

	}
}
