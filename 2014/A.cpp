#include <iostream>
#include<stdlib.h>
#include<math.h>
using namespace std;

int main(){
	double x, y;
	cin >> x >> y;
	double voltas;
	
	x = abs(x-y);
	voltas = ceil(y/x);
	
	cout << voltas << endl;
	return 0;
}
