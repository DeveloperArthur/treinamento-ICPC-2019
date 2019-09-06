import math

ultrapassagens = 0
while True:
    n = int(input())
    
    largada = [n]
    chegada = [n]
    
    for i in range(0, n):
        largada.append(int(input()))
    
    for j in range(0, n):
        chegada.append(int(input()))
        
    for k in range(0, n):
        if largada[k] != chegada[k]:
            
            for l in range(0, n):
                if largada[l] == chegada[k]:
                    valor_K = largada[k]
                    largada[k] = largada[l]
                    
                    
                    o=l
                    while o!=k:
                      if o ==  1:
                        break

                      aux = largada[o]
                      largada[o] = largada[o-1]
                      largada[o-1] = aux
                  
                      o=o-1
                    
                    
                    largada[k+1] = valor_K
                    ultrapassagens += math.fabs(l-k)
                    
    print (ultrapassagens)
