#include <iostream>
#include <string.h>
using namespace std;

int main() {
  int l, c, n, x;
  int linhas, paginas, letras;
  char palavra[71];
  
  while(1){
      cin >> n >> l >> c;
      paginas = 1;
      linhas = 1;
      scanf("%s", &palavra);
      letras = strlen(palavra);
      n--;
      for(int i=0; i<n; ++i){
        scanf("%s", &palavra);
        x = strlen(palavra);
        if(c >= (letras+x+1)){
            letras+=x+1;
        }else{
            ++linhas;
            if(linhas>l){
                ++paginas, linhas = 1;
            }
            letras = x;
        }
      }
      printf("%d\n", paginas);
  }
  return 0;
}
