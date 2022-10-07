
package listavet_met;

/**
 * @author Eliézer da Silva
 * @data   05/10/2022
 * @version 1.0   
 * 
 */

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * 10-) Faça um método que recebe dois números reais R como parâmetro e retorna a
		 * soma de ambos.
		 * 
		 */

		Scanner s = new Scanner(System.in);
		// Scanner faz a leitura
		
		System.out.println("Informe dois numeros");
		// Infomativo 
		
		Integer[] vet = new Integer[2];
		// vetor de 2 tamanhos
		for (int i = 0; i < vet.length; i++) {
			//Leitura 
			vet[i] = Integer.valueOf(s.nextLine());
			// Conversão
		}
		System.out.println(somaVetor(vet));
	}

	public static Integer somaVetor(Integer vet[]) {
		Integer soma = 0;
		for (int i = 0; i < vet.length; i++) {
			//soma
			soma = soma + vet[i];

		}
		return soma;

	}

}
