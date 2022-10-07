package listavet_met;


import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * 12. Faça um método que recebe como parâmetro um vetor de números inteiros ℤ, realiza a soma de
todos os elementos do vetor e retorna esta soma.
		 */
		Scanner x = new Scanner(System.in);
		//leitura 
		System.out.println("Informe  o tamanho do vetor: ");
		Integer tam = x.nextInt();
		
		// leitura da quantidade de vetor

		Integer[] vet = new Integer[tam];

		for (int i = 0; i < vet.length; i++) {
			// leitura do vetor com for
			System.out.println("Digite o valor do vetor na posição " + i + ": ");
			vet[i] = x.nextInt();
		}

		System.out.println(NovoVet(vet));
		//(final), mostra a soma.
	}

	public static Integer NovoVet(Integer[] vetor) {
		// método de somar

		Integer soma = 0;

		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		return soma;

	}

}
