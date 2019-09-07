#include <iostream>
using namespace std;

int main() {
	int jogadores, partidas, gols=0;
	int desempenho;
	
	cin >> jogadores >> partidas;
	
	for(int i=0; i<jogadores; i++){
		int aux = 0;
		for(int j=0; j<partidas; j++){
			cin >> desempenho;
			if(desempenho > 0){
				aux++;
			}
		}
		if(aux == partidas){
			gols++;
		}
	}
	cout << gols << endl;
	return 0;
}
