 #include<stdio.h>

int main() {
	int jogadores, rodadas;
	while(scanf("%i %i", &jogadores, &rodadas)!=EOF){
		int pontos, maior=0, cont=0, pontuacoes[jogadores], l, i, k;
		
		//inicializar array com todas as posicoes 0
		for(l=0; l<jogadores; l++){
			pontuacoes[l] = 0;
		}
		
		for(i=0; i<(jogadores*rodadas); i++){
			scanf("%i", &pontos);
			//printf("JOGADOR %i FEZ %i PONTOS\n", (i+1), pontos);
			pontuacoes[i] = pontuacoes[i]+pontos;
			if(i == (rodadas-1)){
				i=-1;
				cont++;
			}
			if(cont == jogadores){
				break;
			}
		}
		
		for(k=0; k<jogadores; k++){
			//printf("\nPONTUACAO DO JOGADOR %i == %i\n", (k+1), pontuacoes[k]);
			maior = pontuacoes[k];
			//printf("\nMAIOR ATUAL == %i\n\n", maior);
			if(pontuacoes[k] >= maior){
				maior = pontuacoes[k];
			}
		}
		
		printf("%i\n", maior);	
	}
	
}
