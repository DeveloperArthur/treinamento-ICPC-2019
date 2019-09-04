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
			
			//lendo palavras
			for(int i=0; i<palavras.length; i++) {
				palavras[i] = sc.next();
			}
			
			for(int j=0; j<palavras.length; j++) {
				caracteres = palavras[j].length() + caracteres;
				System.out.println("CARACTERES ATUAIS == "+caracteres);
				if(caracteres >= c) {
					caracteres = 0;
					linhas++;
					System.out.println("LINHAS ATUAIS == "+linhas);
					if(paginas >= 1 && linhas < l) {
						paginas++;
					}
					if(linhas >= l) {
						linhas = 0;
						paginas++;
						System.out.println("PAGINAS ATUAIS == "+paginas);
					}
				}
			}
			System.out.println(paginas);
		}
	}
}
