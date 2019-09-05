package a2012;

import java.util.Scanner;

public class G {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int ultrapassagens = 0;
			
			int n = sc.nextInt();
			
			int[] largada = new int[n];
			int[] chegada = new int[n];
			
			//LENDO GRID DA LARGADA
			for(int i=0; i<largada.length; i++) {
				largada[i] = sc.nextInt();
			}
			
			//LENDO GRID DA CHEGADA
			for(int j=0; j<chegada.length; j++) {	
				chegada[j] = sc.nextInt();
			}
			
			//PERCORRENDO GRID'S E COMPARANDO PRA VER SE ESTAO DIFERENTES
			for(int k=0; k<n; k++) {
				if(largada[k] != chegada[k]) {
					//SE O NUMERO FOR DIFERENTE, PROCURA NO ARRAY DE LARGADA O GRID DE CHEGADA CORRESPONDENTE AO CHEGADA PRA TROCAR
					for(int l=0; l<n; l++) {
						//QUANDO ACHAR O NUMERO TROCA
						if(largada[l] == chegada[k]) {
							int aux = largada[k];
							largada[k] = largada[l];
							largada[l] = aux;
							
							System.out.println("POSICAO LARGADA[l] == "+largada[l]);
							System.out.println("POSICAO CHEGADA[] == "+k);
							System.out.println("L == "+l);
							System.out.println("K == "+k);
							System.out.println();
							ultrapassagens += Math.abs(l-k);
						}
					}
				}
			}
			System.out.println(ultrapassagens);
		}
	}
}
