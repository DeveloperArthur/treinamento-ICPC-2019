while True:
  cont = 0
  mergulharam = int(input())
  voltaram = int(input())

  mergulhadores = [mergulharam]
  numerosQueVoltaram = [voltaram]

  for i in range(0, mergulharam):
      
    #Este trecho de codigo deu erro 
    #mergulhadores[i] = i+1
    #IndexError: list assignment index out of range
    #E eu nao consegui resolver
    
    mergulhadores[i] = i+1

    for j in range(0, voltaram):
      numerosQueVoltaram[j] = int(input())

    for k in range(0, mergulharam):
      cont = 0
      for l in range(0, voltaram):
        if mergulhadores[k] != numerosQueVoltaram[l]:
          cont = cont+1;
          if cont == voltaram:
            print(mergulhadores[k], " ")
  
  if mergulharam == voltaram:
    print("*")
