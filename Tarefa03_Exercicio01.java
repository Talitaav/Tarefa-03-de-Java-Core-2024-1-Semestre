package exercicio01;

//1) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, 
// meses e dias e escreva a idade dessa pessoa expressa apenas em dias.Considerar ano com 365 dias e mês com 30 dias.

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a idade em anos: ");
		int anos = sc.nextInt();

		System.out.println("Digite a idade em meses: ");
		int meses = sc.nextInt();

		System.out.println("Digite a idade em dias: ");
		int dias = sc.nextInt();

		int calcularIdade = anos * 365 + meses * 30 + dias;

		System.out.println("A idade em dias é: " + calcularIdade + "dias");

		sc.close();

	}

}
