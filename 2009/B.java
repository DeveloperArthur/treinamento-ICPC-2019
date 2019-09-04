package a2009;


import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int minutos = 0;
			
			int h1 = sc.nextInt();
			int m1 = sc.nextInt();
			int h2 = sc.nextInt();
			int m2 = sc.nextInt();
			
			if(h1 == 0 && m1 == 0 && h2 == 0 && m2 ==0) {
				break;
			}
			
			//QUANDO AS HORAS SAO IGUAIS
			if(h1 == h2 && m1 > m2) {
				int aux1 = m1 - m2;
				int aux2 = 60-aux1;
				minutos = 23*60;
				minutos = minutos + aux2;
			}else if(h1 == h2 && m1 == m2) {
				minutos = 24*60;
			}else if(h1 == h2 && m1 < m2) {
				minutos = m2-m1;
			}
			
			//QUANDO A HORA ATUAL EH MENOR QUE HORA DE ACORDAR
			else if(h1 < h2 && m1 == m2) {
				minutos = h2-h1;
				minutos = minutos * 60;
			}else if(h1 < h2 && m1 < m2) {
				int aux = h2-h1;
				int aux2 = aux*60;
				int aux3 = m2-m1;
				minutos = aux2 + aux3;
			}else if(h1 < h2 && m1 > m2) {
				int aux = (h2-h1)-1;
				int aux2 = m1-m2;
				int aux3 = 60-aux2;
				minutos = (aux*60)+aux3;
			}
			
			//QUANDO A HORA ATUAL EH MAIOR QUE HORA DE ACORDAR
			else if(h1 > h2 && m1 == m2) {
				int aux = h1-h2;
				int aux3 = 1440;
				int aux2 = aux*60;
				minutos = aux3 - aux2;	
			}else if(h1 > h2 && m1 < m2) {
				int aux = h1-h2;
				int aux3 = 1440;
				int aux2 = aux*60;
				int aux4 = m2-m1;
				minutos = (aux3 - aux2)+aux4;
			}else if(h1 > h2 && m1 > m2) {
				if(h1 == 0) {
					h1 = 24;
				}
				int aux = h1-h2;
				int aux2 = (24-aux)-1;
				int aux3 = (60-m1)+m2;
				minutos = (60*aux2)+aux3;
			}
			
			System.out.println(minutos);
		}
		
	}

}
