package exercicio08;
//8) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 Km por litro. 

//Para obter o cálculo, o usuário deve fornecer o tempo gasto(TEMPO) e a velocidade média (VELOCIDADE) durante a viagem.
//Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA=TEMPO * VELOCIDADE.
//Possuindo o valor dadistância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula LITROS_USADOS=DISTANCIA/12. 
//Ao final, o programa deve apresentar os valores da velocidade média (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a quantidade de litros (LITROS_USADOS) utilizada na viagem.

import java.util.Scanner;

public class Tarefa03_Exercicio08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o tempo gasto na viagem em horas: ");
		double tempo = sc.nextDouble();

		System.out.print("Digite a velocidade média durante a viagem em Km/h: ");
		double velocidade = sc.nextDouble();

		double distancia = tempo * velocidade;
		double litrosUsados = distancia / 12;

		System.out.println("Velocidade média: " + velocidade + " Km/h");
		System.out.println("Tempo gasto na viagem: " + tempo + " horas");
		System.out.println("Distância percorrida: " + distancia + " Km");
		System.out.println("Quantidade de litros utilizada na viagem: " + litrosUsados + " litros");

		sc.close();
	}

}
