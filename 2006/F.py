cont=0

numeroParticipantes = input()
partidasJogadas = input()

for i in range(0, int(numeroParticipantes)):
    time = input()
    pontuacao = input()
    if int(pontuacao) == 1:
        cont = cont+1
print(cont)
