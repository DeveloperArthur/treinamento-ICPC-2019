#include <stdio.h>

int main(void) {
  int credito1, credito2, credito3;
  scanf("%i %i %i", &credito1, &credito2, &credito3);

  if(credito1 == credito2 || credito1 == credito3 || credito2 == credito3){
    printf("S\n");
  }else if((credito1+credito2)==credito3 || (credito3+credito1) == credito2 || (credito2+credito3)==credito1){
    printf("S\n");
  }else{
    printf("N\n");
  }
}
