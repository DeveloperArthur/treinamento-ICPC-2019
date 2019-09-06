package a2012;

import java.util.Scanner;

public class G {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int ultrapassagens = 0;

			int n = sc.nextInt();

			int[] largada = new int[n];
			int[] chegada = new int[n];

			// LENDO GRID DA LARGADA
			for (int i = 0; i < largada.length; i++) {
				largada[i] = sc.nextInt();
			}

			// LENDO GRID DA CHEGADA
			for (int j = 0; j < chegada.length; j++) {
				chegada[j] = sc.nextInt();
			}

			// PERCORRENDO GRID'S E COMPARANDO PRA VER SE ESTAO DIFERENTES
			for (int k = 0; k < n; k++) {
				if (largada[k] != chegada[k]) {
					// SE O NUMERO FOR DIFERENTE, PROCURA NO ARRAY DE LARGADA O GRID DE CHEGADA
					// CORRESPONDENTE AO CHEGADA PRA TROCAR
					for (int l = 0; l < n; l++) {
						if (largada[l] == chegada[k]) {
							int valor_K = largada[k];
							// System.out.println("VALOR_K == "+valor_K);
							largada[k] = largada[l];
							// System.out.println("POSICAO "+k+" RECEBEU O VALOR DA POSICAO "+l);
							// l = l-1
							for (int o = l; o != k; o--) {
								if (o == 1) {
									break;
								}
								// System.out.println("POSICAO "+o+" TROCANDO COM POSICAO "+(o-1));
								int aux = largada[o];
								largada[o] = largada[o - 1];
								largada[o - 1] = aux;
							}
							largada[k + 1] = valor_K;
							// System.out.println("POSICAO "+l+" RECEBEU O VALOR_K == "+valor_K);
							// System.out.println("POSICAO LARGADA[L] == "+l);
							// System.out.println("POSICAO LARGADA[K] == "+k);
							// System.out.println();
							ultrapassagens += Math.abs(l - k);
							// System.out.println("ULTRAPASSAGENS ATUAIS == "+ultrapassagens);
							// System.out.println("LOG ATUAL:");
							/*
							 * for(int m=0; m<n; m++) { System.out.print(largada[m]+" "); }
							 * System.out.println();
							 */
						}
					}
				}
			}
			System.out.println(ultrapassagens);
		}
	}
}
