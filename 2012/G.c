#include <stdio.h>
#include<stdlib.h>

int ultrapassagens = 0;

int main(void) {
  while(1){
    int n;

    scanf("%i", &n);

    int largada[n];
    int chegada[n];

    for(int i=0; i<n; i++){
      scanf("%i", &largada[i]);
    }

    for(int j=0; j<n; j++){
      scanf("%i", &chegada[j]);
    }

    for(int k=0; k<n; k++){
      if(largada[k] != chegada[k]){

        for(int l=0; l<n; l++){
          if(largada[l] == chegada[k]){

            int valor_K = largada[k];
            largada[k] = largada[l];

            for(int o=l; o!=k; o--){
              if(o==1){
                break;
              }

              int aux = largada[o];
              largada[o] = largada[o-1];
              largada[o-1] = aux;         
            }
            largada[k+1] = valor_K;
            ultrapassagens += abs(l-k);
          }
        }
      }
    }
    printf("%i\n", ultrapassagens);
  }
  return 0;
}
