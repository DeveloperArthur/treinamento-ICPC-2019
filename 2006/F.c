#include<stdio.h>
#include<stdlib.h>

int main(){
    int numeroParticipantes, partidasJogadas, pontuacao, cont;
    char times[20];
    
    while(1){
      cont = 0;
      scanf("%i", &numeroParticipantes);
      scanf("%i", &partidasJogadas);
      if(numeroParticipantes == 0 && partidasJogadas == 0){
        break;
      }
      
      for(int i=0; i<numeroParticipantes; i++){
        scanf("%s", &times);
        scanf("%i", &pontuacao);
        if(pontuacao == 1){
            cont++;
        }
      }
      printf("%i", cont);
    }

    return 0;
}
