#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main() {
	float x, y;
	scanf("%f %f", &x, &y);
	float voltas;
	
	x = abs(x-y);
	voltas = ceil(y/x);
	
	printf("%.f\n", voltas);
	return 0;
}
