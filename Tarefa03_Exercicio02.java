package exercicio02;

/*2) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. 
  Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
 */
import java.util.Scanner;

public class Tarefa03_Exercicio02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de eleitores: ");
		int eleitores = sc.nextInt();
		
		System.out.println("Digite a quantidade de votos brancos: ");
		int votosBrancos = sc.nextInt();
		
		System.out.println("Digite a quantidade de votos nulos: ");
		int votosNulos = sc.nextInt();
		
		System.out.println("Digite a quantidade de votos válidos: ");
		int votosValidos = sc.nextInt();
		
		int votosValidos1 = eleitores - (votosBrancos + votosNulos);
		
		System.out.println("Resultado:");
		System.out.println("O percentual de votos brancos é: " + votosBrancos + "%");
		System.out.println("O percentual de votos  nulos é: " + votosNulos + "%");
		System.out.println("O percentual de votos válidos é: " + votosValidos + "%");

		sc.close();
	}
	

}
