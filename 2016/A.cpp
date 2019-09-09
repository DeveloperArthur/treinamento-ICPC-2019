#include<iostream>
using namespace std;

int main(void) {
  int credito1, credito2, credito3;
  cin >> credito1 >> credito2 >> credito3;

  if(credito1 == credito2 || credito1 == credito3 || credito2 == credito3){
    cout << "S" << endl;
  }else if((credito1+credito2)==credito3 || (credito3+credito1) == credito2 || (credito2+credito3)==credito1){
    cout << "S" << endl;
  }else{
    cout << "N" << endl;
  }
}
