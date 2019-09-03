package a2008;

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1, x2, y1, y2, result = 2;
		while(true) {
			result = 2;
			//casa de começo
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			
			//casa de destino
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			
			if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) {
				break;
			}
				
			boolean vertical = (x1 == x2 && y1 != y2); 
		    boolean horizontal = (x1 != x2 && y1 == y2); 
		    boolean diagonal = (Math.abs(x1-x2) == Math.abs(y1 - y2)); 
		     
		    if (x1 == x2 && y1 == y2){ 
		        result = 0; 
		    }else if (vertical || horizontal || diagonal){ 
		    	result = 1; 
		    }
			
			System.out.println(result);
		}
	}
}
