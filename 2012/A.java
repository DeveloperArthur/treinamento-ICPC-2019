package a2012;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//n = quantidade de palavras
		//l = maximo de linhas por pagina
		//c = maximo de caracteres por linha

		while(true) {
			int linhas = 0, paginas = 0, caracteres = 0;
			
			int n = sc.nextInt();
			int l = sc.nextInt();
			int c = sc.nextInt();
			
			String[] palavras = new String[n];
			String[] palavras_com_espaco = new String[n+(n-1)];
			
			//lendo palavras
			for(int i=0; i<palavras.length; i++) {
				palavras[i] = sc.next();
			}
			
			//acrescentar palavras no array de palavras com espaco
			for(int k=0; k<palavras.length; k++) {
				if(k==0) {
					palavras_com_espaco[k] = palavras[k];
				}else {
					palavras_com_espaco[k*2] = palavras[k];
				}
			}
			
			//acrescentar espacos entre as palavras que foram adicionadas
			for(int m=1; m<palavras_com_espaco.length; m+=2) {
				palavras_com_espaco[m] = " ";
			}
			
			/*for(int o=0; o<palavras_com_espaco.length; o++) {
				System.out.println("POSICAO ["+o+"] == \""+palavras_com_espaco[o]+"\"");
				System.out.print("\""+palavras_com_espaco[o]+"\". ");
			}*/
			
			for(int j=0; j<palavras_com_espaco.length; j++) {
				caracteres = palavras_com_espaco[j].length() + caracteres;
				//System.out.println("PALAVRA LIDA == \""+palavras_com_espaco[j]+"\"");
				//System.out.println("CARACTERES ATUAIS == "+caracteres);
				//System.out.println();
				//System.out.println();
				if(caracteres >= c) {
					if(caracteres >= c && j == ((n+(n-1))-1)) {
						//System.out.println("SE CARACTERES PASSAR DA LINHA E AS PALAVRAS JA TIVEREM ACABADO, ACRESCENTA +1 NA PAGINA PRO RESTANTE DA PALAVRA QUE SOBRAR");
						paginas++;
					}
					caracteres = caracteres - c;
					linhas++;
					//System.out.println("LINHAS ATUAIS == "+linhas);
					//System.out.println();
					if(paginas >= 1 && linhas < l && j == ((n+(n-1))-1)) {
						//System.out.println("PAGINAS SAO >=1 MAS NAO BATEU O NUMERO DE LINHAS NECESSARIAS PRA CRIAR OUTRA PAGINA");
						paginas++;
					}
					if(linhas >= l) {
						linhas = 0;
						paginas++;
						//System.out.println("PAGINAS ATUAIS == "+paginas);
						//System.out.println();
					}
				}
				if(paginas == 0 && j == ((n+(n-1))-1)) {
					//System.out.println("O PROGRAMA ACABOU E NAO TEVE LINHAS SUFICIENTES PARA ACRESCENTAR UMA SEGUNDA PAGINA");
					paginas++;
				}
			}
			System.out.println(paginas);
		}
	}
}
