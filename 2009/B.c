#include <stdio.h>

int main(){
    int h1,h2,m1,m2,t1,t2;
    
    while(1){
        scanf("%i %i %i %i", &h1, &m1, &h2, &m2);
        
        if(h1 == 0 && m1 == 0 && h2 == 0 && m2 == 0){
            break;
        }
        
        t1 = (60*h1)+m1;
        t2 = (60*h2)+m2;
        
        if(t1 < t2){
            printf("%i\n", (t2-t1));
        }else{
            printf("%i\n", 1440+(t2-t1));
        }
    }
}
