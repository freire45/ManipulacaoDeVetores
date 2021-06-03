package br.com.erickfreire.manipulacaodevetores;

import java.util.Arrays;

/**
 * Programa em Java que testa funcionalidades de manipulação de valores com a classe Array
 * @author Erick Freire
 * @version 1  - Criado em 03-06-2021 as 15:00
 */

public class ManipulacaoDeVetores {
	public static void main(String[] args) {
		double[] vetorDouble = { 8.4, 9.3, 0.2, 7.9, 3.4 };
		Arrays.sort(vetorDouble);
		System.out.printf("%nvetor de Double em ordem crescente: ");
		
		for (double valor : vetorDouble)
			System.out.printf("%.1f ", valor);
		
		int[] vetorIntPreenchido = new int[10];
		Arrays.fill(vetorIntPreenchido, 7);
		mostraVetor(vetorIntPreenchido, "Vetor de Inteiro Preenchido");
		
		int[] vetorInteiro = { 1, 2, 3, 4, 5, 6 };
		int[] vetorInteiroCopia = new int[vetorInteiro.length];
	    System.arraycopy(vetorInteiro, 0, vetorInteiroCopia, 0, vetorInteiro.length);
		mostraVetor(vetorInteiro, "Vetor De Inteiro");
		mostraVetor(vetorInteiroCopia, "Copia Do Vetor De Inteiro");
		
		boolean b = Arrays.equals(vetorInteiro, vetorInteiroCopia);
		System.out.printf("%n%nVetor De Inteiro %s Copia do Vetor De Inteiro%n",
		(b ? "==" : "!="));
		
		b = Arrays.equals(vetorInteiro, vetorIntPreenchido);
		System.out.printf("Vetor De Inteiro %s Vetor de inteiro preenchido%n",
		(b ? "==" : "!="));
		
		int localizacao = Arrays.binarySearch(vetorInteiro, 5);
		
		if (localizacao >= 0)
		System.out.printf("Econtrado 5 de:  %d no vetor de inteiro%n", localizacao);
		else
		System.out.println("Não foi encontrado 5 no vetor de inteiro");
		
		localizacao = Arrays.binarySearch(vetorInteiro, 8763);
	
		if (localizacao >= 0)
		System.out.printf(
		"Encontrado 8763 no elemento %d no vetor de inteiro%n", localizacao);
		else
		System.out.println("8763 não encontrado no vetor de inteiro");
		
		
	}
	
	public static void mostraVetor(int[] vetor, String descricao) {
		
		System.out.printf("%n%s: ", descricao);
		
		for (int valor : vetor)
			System.out.printf("%d ", valor);
		
	}

}
