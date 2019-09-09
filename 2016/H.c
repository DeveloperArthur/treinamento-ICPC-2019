/*Programa nao funcionou corretamente, provavel problema em Buffer*/

#include <stdio.h>
#include <string.h>

int main(void) {
    char risada[50], risadaSemConsoantes[50] = "", risadaInversa[50] = "";
    scanf("%s", risada);
    
    //COLOCANDO SOH AS VOGAIS EM UMA STRING
    for(int i=0; i<strlen(risada); i++){
        if(risada[i] == 'a' || risada[i] == 'e' || risada[i] == 'i' || risada[i] == 'o' || risada[i] == 'u'){
            risadaSemConsoantes[i] = risadaSemConsoantes[i] + risada[i];
        }
    }
    
    //INVERTENDO A STRING SOH DE VOGAIS E ATRIBUINDO A OUTRA STRING
    for(int j=strlen(risadaSemConsoantes); j>0; j--){
        risadaInversa[j] = risadaInversa[j] + risadaSemConsoantes[j];
        //printf("%c", risadaSemConsoantes[j]);
    }
    
    //printf("%s\n", risadaSemConsoantes);
    //printf("%s\n", risadaInversa);
    
    
    //COMPARANDO SE STRING'S SAO IGUAIS
    if(strcmp(risadaSemConsoantes, risadaInversa) == 0){
        printf("S");
    }else{
        printf("N");
    }

}
