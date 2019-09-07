import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextInt();
		double y = sc.nextInt();
		
		double voltas;
		
		x = Math.abs(x-y);
		voltas = Math.ceil(y/x);
		
		//nao consegui tirar o ponto flutuante, estava dando erro java.util.IllegalFormatConversionException
		System.out.printf(voltas);
	}

}
