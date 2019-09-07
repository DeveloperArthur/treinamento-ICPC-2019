#include<stdio.h>

int main() {
	int A,B, win;
	while(scanf("%d %d", &A, &B)!=EOF){
		if(A>B){
			win = A;
		}else if(B>A){
			win = B;
		}else{
			win = A;
		}
		printf("%d\n", win);
	}
	return 0;
}
