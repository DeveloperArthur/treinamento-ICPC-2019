#include<iostream>
#include <stdbool.h>
#include <stdlib.h> 
using namespace std;

int main(){
	int x1, x2, y1, y2, movimentos = 2;
	while(true){
		movimentos = 2;
		cin >> x1 >> y1 >> x2 >> y2;
		
		if(x1 == 0 && x2 == 0 && y1 == 0 && y2 == 0){
			break;
		}
		
		bool vertical = (x1 == x2 && y1 != y2);
		bool horizontal = (x1 != x2 && y1 == y2);
		bool diagonal = (abs(x1-x2) == abs(y1-y2));
		
		if(x1 == x2 && y1 == y2){
			movimentos = 0;
		}else if(vertical || horizontal || diagonal){
			movimentos = 1;
		}
		cout << movimentos << endl;
	}
}
