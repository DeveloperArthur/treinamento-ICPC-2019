#include <stdio.h>

int main() {
	int jogadores, partidas, gols=0;
	int desempenho;
	
	while(scanf("%i %i", &jogadores, &partidas)){
		for(int i=0; i<jogadores; i++){
			int aux = 0;
			for(int j=0; j<partidas; j++){
				scanf("%i", &desempenho);
				if(desempenho > 0){
					aux++;
				}
			}
			if(aux == partidas){
				gols++;
			}
		}
		printf("%i", gols);
	}
	return 0;
}
