package a2013;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			
			if(A == B && A == C) {
				System.out.println("*");
			}
			if(A == B && A != C) {
				System.out.println("C");
			}
			if(B == C && B != A) {
				System.out.println("A");
			}
			if(A == C && A != B) {
				System.out.println("B");
			}
			
		}
		
	}

}
