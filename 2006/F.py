while True:
    cont=0

    numeroParticipantes = input()
    partidasJogadas = input()
    
    if int(numeroParticipantes) == 0 and int(partidasJogadas) == 0:
        break
    
    for i in range(0, int(numeroParticipantes)):
        time = input()
        pontuacao = input()
        if int(pontuacao) == 1:
            cont = cont+1
    print(cont)

