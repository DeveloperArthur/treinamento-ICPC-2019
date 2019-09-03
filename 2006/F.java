package a2006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class F {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int cont;
		
		while(true) {
			cont = 0;
			int timesParticipantes = sc.nextInt();
			int partidasJogadas = sc.nextInt();
			
			if(timesParticipantes == 0 && partidasJogadas == 0) {
				break;
			}
			
			for(int i=0; i<timesParticipantes; i++) {
				String time = in.readLine();
				int pontuacao = sc.nextInt();
				if(pontuacao == 1) {
					cont++;
				}
			}
			System.out.println(cont);
		}
	}
}
