#include <iostream>
using namespace std;

int main(){
    int n, cont=0, a;
    cin >> n;
    
    for(int i=0; i<n; i++){
        cin >> a;
        if(a != 1){
            cont++;
        }
    }
    
    cout << cont << endl;
}
