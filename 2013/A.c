#include <stdio.h>

int main(void) {

  while(1){
    int A, B, C;
    scanf("%i", &A);
    scanf("%i", &B);
    scanf("%i", &C);

    if(A == B && A == C) {
      printf("*");
    }
    if(A == B && A != C) {
      printf("C");
    }
    if(B == C && B != A) {
      printf("A");
    }
    if(A == C && A != B) {
      printf("B");
    }
  }
}
