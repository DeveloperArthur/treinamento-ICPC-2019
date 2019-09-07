#include <iostream>
#include<stdlib.h>
#include<math.h>
using namespace std;

int main(){
	float x, y;
	cin >> x >> y;
	float voltas;
	
	x = abs(x-y);
	voltas = ceil(y/x);
	
	cout << voltas << endl;
	return 0;
}
