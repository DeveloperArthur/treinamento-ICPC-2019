jogadores = int(input())
rodadas = int(input())

pontos=0
maior=0
cont=0

pontuacoes = [jogadores]

for j in range(0, (jogadores*rodadas)):
    pontos = int(input())
    #deu erro nessa linha
    #pontuacoes[j] = pontuacoes[j] + pontos                                                                                                                 
    #IndexError: list index out of range
    #e nao vou resolver
    pontuacoes[j] = pontuacoes[j] + pontos
    if j==(rodadas-1):
        j=-1;
        cont=cont+1
    
    if cont == jogadores:
        break;
    
for k in range(0, len(pontuacoes)):
    maior = pontuacoes[k]
    if pontuacoes[k] >= maior:
        maior = pontuacoes[k]
    

print(maior)
