package a2016;

import java.util.Scanner;

public class H {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		String risada = sc.next();
		String risadaSemConsoantes = "";
		
		for(int i=0; i<risada.length(); i++) {
			if(
				risada.charAt(i) == 'a' || 
				risada.charAt(i) == 'e' || 
				risada.charAt(i) == 'i' || 
				risada.charAt(i) == 'o' || 
				risada.charAt(i) == 'u') {
		
				risadaSemConsoantes = risadaSemConsoantes+risada.charAt(i);
			}
		}
		
		String risadaSemConsoantesInversa = new StringBuilder(risadaSemConsoantes).reverse().toString();
		
		if(risadaSemConsoantes.equals(risadaSemConsoantesInversa)) {
			System.out.println("S");
		}else {
			System.out.println("N");
		}
	}
}
