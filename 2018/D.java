package a2018;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cont = 0;
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			if(a != 1) {
				cont++;
			}
		}
		
		System.out.println(cont);
	}

}
