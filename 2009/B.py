while True:
    h1 = int(input())
    m1 = int(input())
    h2 = int(input())
    m2 = int(input())
    
    if h1 == 0 and m1 == 0 and h2 == 0 and m2 == 0:
        break
    
    t1 = (60*h1)+m1
    t2 = (60*h2)+m2
    
    if t1 < t2:
        print (t2-t1)
    else:
        print (1440+(t2-t1))
