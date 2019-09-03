import math

movimentos = 2

while True:
    movimentos = 2
    x1 = input()
    y1 = input()
    x2 = input()
    y2 = input()
    
    if int(x1) == 0 and int(x2) == 0 and int(y1) == 0 and int(y2) == 0:
        break
    
    
    vertical = (int(x1) == int(x2) and int(y1) != int(y2))
    horizontal = (int(x1) != int(x2) and int(y1) == int(y2))
    diagonal = (math.fabs(int(x1)-int(x2)) == math.fabs(int(y1)-int(y2)))
    
    if x1 == x2 and y1 == y2:
        movimentos = 0
    elif vertical or horizontal or diagonal:
        movimentos = 1
    
    print(movimentos)
