#include <stdio.h>

int main(){
    int n, cont=0, a;
    scanf("%i", &n);
    
    for(int i=0; i<n; i++){
        scanf("%i", &a);
        if(a != 1){
            cont++;
        }
    }
    
    printf("%i", cont);
}
