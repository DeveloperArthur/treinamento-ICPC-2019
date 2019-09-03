#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main(){
	int x1,x2,y1,y2, movimentos = 2;
	while(1){
		movimentos = 2;
		scanf("%i", &x1);
		scanf("%i", &y1);
		scanf("%i", &x2);
		scanf("%i", &y2);
		
		if(x1 == 0 && x2 == 0 && y1 == 0 && y2 == 0){
			break;
		}
		
		bool vertical = (x1 == x2 && y1 != y2);
		bool horizontal = (x1 != x2 && y1 == y2);
		bool diagonal = (abs(x1-x2) == abs(y1-y2));
		
		if(x1 == x2 && y1 == y2){
			movimentos = 0;
		}else if(vertical || horizontal || diagonal){
			movimentos = 1;
		}
		printf("%i\n", movimentos);
	}
	return 0;
}
