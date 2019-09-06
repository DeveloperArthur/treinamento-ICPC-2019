#include <iostream>
using namespace std;

int main(){
	while(true){
  	
  		int cont=0;
		int mergulharam;
		int voltaram;
	
		cin >> mergulharam >> voltaram;
	
		int mergulhadores[mergulharam];
		int numerosQueVoltaram[voltaram];
	
		for(int i=0; i<mergulharam; i++){
			mergulhadores[i] = i+1;
		}
	
		for(int j=0; j<voltaram; j++){
			cin >> numerosQueVoltaram[j];
		}
	
		for(int k=0; k<mergulharam; k++){
			cont = 0;
			for(int l=0; l<voltaram; l++){
				if(mergulhadores[k] != numerosQueVoltaram[l]){
					cont++;
					if(cont == voltaram){
						cout << mergulhadores[k] << " ";
					}
				}
			}
		}
		if(mergulharam == voltaram){
			cout << "*" << endl;
		}
	}
}
