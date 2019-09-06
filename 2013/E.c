#include <stdio.h>

int main(void) {
	
	while(1){
		int cont=0;
		int mergulharam;
		int voltaram;
		
		scanf("%i", &mergulharam);
		scanf("%i", &voltaram);
		
		int mergulhadores[mergulharam];
		int numerosQueVoltaram[voltaram];
		
		for(int i=0; i<mergulharam; i++){
			mergulhadores[i] = i+1;
		}
		
		for(int j=0; j<voltaram; j++){
			scanf("%i", &numerosQueVoltaram[j]);
		}
		
		for(int k=0; k<mergulharam; k++){
			cont = 0;
			for(int l=0; l<voltaram; l++){
				if(mergulhadores[k] != numerosQueVoltaram[l]){
					cont++;
					if(cont == voltaram){
						printf("%i ", mergulhadores[k]);
					}
				}
			}
		}
		
		if(mergulharam == voltaram){
			printf("*");
		}
	}
	return 0;
}
