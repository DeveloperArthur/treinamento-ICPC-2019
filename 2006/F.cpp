#include <iostream>
#include <string>
using namespace std;

int main(){
    int numeroParticipante, partidasJogadas, pontuacao, cont=0;
    string times;
    
    cin >> numeroParticipante;
    cin >> partidasJogadas;
    
    for(int i=0; i<numeroParticipante; i++){
        cin >> times;
        cin >> pontuacao;
        if(pontuacao == 1){
            cont++;
        }
    }
    cout << cont << endl;
    return 0;
}
