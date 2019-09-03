#include<stdio.h>
#include<stdlib.h>

int main(){
    int numeroParticipantes, partidasJogadas, pontuacao, cont=0;
    char times[20];
    
    
    scanf("%i", &numeroParticipantes);
    scanf("%i", &partidasJogadas);
    
    for(int i=0; i<numeroParticipantes; i++){
      scanf("%s", &times);
      scanf("%i", &pontuacao);
      printf("pontuacao == %i", pontuacao);
      if(pontuacao == 1){
	        cont++;
	    }
    }
    printf("%i", cont);
    
    return 0;
}
