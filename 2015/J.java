import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int jogadores = sc.nextInt();
		int rodadas = sc.nextInt();
		
		int pontos, maior=0, cont=0;
		int[] pontuacoes = new int[jogadores];
		
		for(int i=0; i<pontuacoes.length; i++){
		    pontuacoes[i] = 0;
		}
		
		for(int j=0; j<(jogadores*rodadas); j++){
		    pontos = sc.nextInt();
		    pontuacoes[j] = pontuacoes[j] + pontos;
		    if(j==(rodadas-1)){
		        j=-1;
		        cont++;
		    }
		    if(cont == jogadores){
		        break;
		    }
		}
		
		for(int k=0; k<pontuacoes.length; k++){
		    maior = pontuacoes[k];
		    if(pontuacoes[k] >= maior){
		        maior = pontuacoes[k];
		    }
		}
		System.out.println(maior);
	}
}
