import math

x = int(input())
y = int(input())

voltas = 0

x = math.fabs(x-y)
voltas = math.ceil(y/x)

print(voltas)
