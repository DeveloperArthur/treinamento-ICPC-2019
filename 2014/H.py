gols = 0

jogadores = int(input())
partidas = int(input())

for i in range(0, jogadores):
    aux = 0
    for j in range(0, partidas):
        desempenho = int(input())
        if desempenho > 0:
            aux=aux+1
            
    if aux == partidas:
        gols=gols+1 
        
print(gols)
