#include <stdio.h>

int main() {
	int jogadores, partidas, gols=0;
	int desempenho;
	
	scanf("%i %i", &jogadores, &partidas);
	
	for(int i=0; i<jogadores; i++){
		for(int j=0; j<partidas; j++){
			scanf("%i", &desempenho);
		}
	}
}
