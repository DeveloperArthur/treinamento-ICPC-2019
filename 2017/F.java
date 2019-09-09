/*tentativa falha de resolver o problema*/
package a2017;

import java.util.Scanner;
import java.util.Arrays;

public class F {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int competidores = sc.nextInt();
		int minimoClassificados = sc.nextInt();
		int[] pontuacoes = new int[competidores];
		int[] classificados = new int[minimoClassificados];
		int cont = 0, maior = 0;

		for (int i = 0; i < competidores; i++) {
			pontuacoes[i] = sc.nextInt();
		}

		Arrays.sort(pontuacoes);
		for (int i = 0; i < pontuacoes.length; i++) {
			maior = pontuacoes[i];
			if(pontuacoes[i] >= maior) {
				if(pontuacoes[i] == maior) {
					cont++; 
					maior = maior*cont; 
				}
				maior = pontuacoes[i]; 
				System.out.println("MAIOR ATUAL == " +maior); 
				System.out.println();
			}
		}
			
		maior = pontuacoes[0];
		for (int i = 0; i < pontuacoes.length; i++) {
			if (pontuacoes[i] == maior) {
				cont++;
			}
		}
		if (cont == pontuacoes.length) {
			System.out.println(cont);
		}
	}
}
