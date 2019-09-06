#include <iostream>
using namespace std;

int main(){
  while(true){
      int A,B,C;
      cin >> A >> B >> C;
      
      if(A==B && A==C){
          cout << "*" << endl;
      }else if(A == B && A != C){
          cout << "C" << endl;
      }else if(B == C && B != A){
          cout << "A" << endl;
      }else if(A == C && A != B){
          cout << "B" << endl;
      }
  }
  return 0;
}
