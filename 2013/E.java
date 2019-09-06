package a2013;

import java.util.Scanner;

public class E {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int cont=0;
			int mergulharam = sc.nextInt();
			int voltaram = sc.nextInt();
			
			
			int[] mergulhadores = new int[mergulharam]; 
			int[] numerosQueVoltaram = new int[voltaram];
			
			for(int i=0; i<mergulhadores.length; i++) {
				mergulhadores[i] = i+1;
			}
			
			for(int j=0; j<numerosQueVoltaram.length; j++) {
				numerosQueVoltaram[j] = sc.nextInt();
			}

			for(int k=0; k<mergulhadores.length; k++) {
				cont = 0;
				for(int l=0; l<numerosQueVoltaram.length; l++) {
					if(mergulhadores[k] != numerosQueVoltaram[l]) {
						cont++;
						if(cont == numerosQueVoltaram.length) {
							System.out.println(mergulhadores[k]);
						}
					}
				}
			}
			if(mergulharam == voltaram) {
				System.out.println("*");
			}
		}
	}
}
