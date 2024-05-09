A, B = map(int, input().split())

hundA = int(A / 100)
deciA = int(A / 10) - hundA * 10
oneA = A - hundA * 100 - deciA * 10
newA = hundA + deciA * 10 + oneA * 100

hundB = int(B / 100)
deciB = int(B / 10) - hundB * 10
oneB = B - hundB * 100 - deciB * 10
newB = hundB + deciB * 10 + oneB * 100

if newA > newB:
    print(newA)
else:
    print(newB)