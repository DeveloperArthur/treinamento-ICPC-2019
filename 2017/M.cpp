#include <iostream>
using namespace std;

int main() {
    
    int A1, A2, A3, total=0;
    cin >> A1 >> A2 >> A3;

    if(A1 > A2 && A1 > A3) 
        total = (A2*2)+(A3*4);
    
    else if (A2 > A1 && A2 > A3) 
        total = (A1*2)+(A3*2);

	else if (A3 > A1 && A3 > A2) 
        total = (A1*4)+(A2*2);

	else if(A1 == A2 || A3 == A2) 
        total = (A1*2)+(A3*2);

	else if(A1 == A3) 
        total = (A2*2)+(A3*4);
	
    cout << total << endl;
}
