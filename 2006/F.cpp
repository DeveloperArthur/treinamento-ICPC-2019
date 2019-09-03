#include <iostream>
#include <string>
using namespace std;

int main(){
    int numeroParticipante, partidasJogadas, pontuacao, cont;
    string times;
    
    while(true){
        cont = 0;
        cin >> numeroParticipante;
        cin >> partidasJogadas;
        
        if(numeroParticipante == 0 && partidasJogadas == 0){
            break;
        }
        
        for(int i=0; i<numeroParticipante; i++){
            cin >> times;
            cin >> pontuacao;
            if(pontuacao == 1){
                cont++;
            }
        }
        cout << cont << endl;    
    }
    return 0;
}
