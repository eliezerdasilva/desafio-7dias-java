package listavet_met;
import java.util.Scanner;
public class Exercicio3 {
	/**
	 * @author Eliézer da Silva
	 * @Data 07/10/2022
	 * @version 1.0
	 */
	public static void main(String[] args) {
	// TODO Auto-generated method stub

	/* 13. Faça um método que recebe um vetor de números inteiros ℤ e retorna o menor número
		armazenado do vetor.
	*/
				
		Scanner s = new Scanner(System.in);
		System.out.println("Informe a quantidade de numeros");
		Integer n = s.nextInt();
		Integer vet [] = new Integer [n];
			for (int i = 0; i < vet.length; i++) {
				System.out.println("Informe o dado");
				vet[i] = s.nextInt();
				}
				System.out.println(NovoVet(vet));
			}
		public static Integer NovoVet(Integer[] vetor) {
		// método para ver qual número informado é o menor
			Integer menor = Integer.MAX_VALUE;
			for (int i = 0; i < vetor.length; i++) {
				if (vetor[i] < menor) {
					menor = vetor[i];
				// verificando qual é o menor
				}
			}
					return menor;
		}
			
		
	}



