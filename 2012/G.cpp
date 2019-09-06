#include <iostream>
#include <stdlib.h>
using namespace std;

int ultrapassagens = 0;

int main(void) {
  while(1){
    int n; 
    cin >> n;

    int largada[n];
    int chegada[n];

    for(int i=0; i<n; i++){
      cin >> largada[i];
    }

    for(int j=0; j<n; j++){
      cin >> chegada[j];
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
    cout << ultrapassagens << endl;
  }
  return 0;
}
