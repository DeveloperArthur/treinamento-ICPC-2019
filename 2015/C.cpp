#include<iostream>
using namespace std;

int main() {
	int A,B, win;
	cin >> A >> B;
	if(A>B){
		win = A;
	}else if(B>A){
		win = B;
	}else{
		win = A;
	}
	cout << win << endl;
	return 0;
}
