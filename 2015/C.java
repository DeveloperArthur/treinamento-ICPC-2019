import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int win;
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A>B){
		    win = A;
		}else if(B>A){
		    win = B;
		}else{
		    win = A;
		}
		
		System.out.println(win);
	}

}
