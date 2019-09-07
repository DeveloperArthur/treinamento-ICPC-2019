import java.util.Scanner;

public class H {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int jogadores, partidas, desempenho, gols=0;
		
		jogadores = sc.nextInt();
		partidas = sc.nextInt();
		
		for(int i=0; i<jogadores; i++){
		    int aux=0;
		    for(int j=0; j<partidas; j++){
		        desempenho = sc.nextInt();
		        if(desempenho > 0){
		            aux++;
		        }
		    }
		    if(aux == partidas){
		        gols++;
		    }
		}
		System.out.println(gols);
	}
}
