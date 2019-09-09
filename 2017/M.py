A1 = int(input())
A2 = int(input())
A3 = int(input())

if A1 > A2 and A1 > A3:
    total = (A2*2)+(A3*4);

elif A2 > A1 and A2 > A3:
    total = (A1*2)+(A3*2);

elif A3 > A1 and A3 > A2:
    total = (A1*4)+(A2*2);

elif A1 == A2 or A3 == A2:
    total = (A1*2)+(A3*2);

elif A1 == A3:
    total = (A2*2)+(A3*4);

print(total)
