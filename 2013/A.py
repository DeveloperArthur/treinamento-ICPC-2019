while True:
  A = int(input())
  B = int(input())
  C = int(input())

  if A==B and B==C: print ("*")
  elif A==B and A!=C: print("C")
  elif B==C and B!=A: print("A")
  elif A==C and A!=B: print("B")
  
