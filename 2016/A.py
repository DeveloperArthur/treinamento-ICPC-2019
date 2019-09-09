credito1 = int(input())
credito2 = int(input())
credito3 = int(input())

if credito1 == credito2 or credito1 == credito3 or credito2 == credito3:
    print("S")
elif (credito1+credito2) == credito3 or (credito3+credito1) == credito2 or (credito2+credito3) == credito1:
    print("S")
else:
    print("N")
