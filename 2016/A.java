package a2016;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int credito1 = sc.nextInt();
		int credito2 = sc.nextInt();
		int credito3 = sc.nextInt();
		
		if(credito1 == credito2 || credito1 == credito3 || credito2 == credito3) {
			System.out.println("S");
		}else if(
				(credito1+credito2)==credito3 || 
				(credito3+credito1)==credito2 || 
				(credito2+credito3)==credito1) {
			System.out.println("S");
		}else {
			System.out.println("N");
		}
		
	}

}
