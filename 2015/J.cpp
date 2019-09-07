#include<iostream>
using namespace std;

int main() {
	int jogadores, rodadas;
	cin >> jogadores >> rodadas;
	
	int pontos, maior=0, cont=0, pontuacoes[jogadores], l, i, k;
	
	for(l=0; l<jogadores; l++){
		pontuacoes[l] = 0;
	}
	
	for(i=0; i<(jogadores*rodadas); i++){
		cin >> pontos;
		pontuacoes[i] = pontuacoes[i]+pontos;
		if(i == (rodadas-1)){
			i=-1;
			cont++;
		}
		if(cont == jogadores){
			break;
		}
	}
	
	for(k=0; k<jogadores; k++){
		maior = pontuacoes[k];
		if(pontuacoes[k] >= maior){
			maior = pontuacoes[k];
		}
	}
	
	cout << maior << endl;
}
