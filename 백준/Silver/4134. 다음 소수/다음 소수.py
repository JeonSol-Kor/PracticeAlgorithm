import math, sys
input = sys.stdin.readline

def isPrimeNum(n):
    prime = 0
    for i in range(n, 2*n+1):
        check = True
        for j in range(2, int(math.sqrt(i)) + 1):
            if i % j == 0:
                check = False
                break
        if check:
            prime = i
            break
    return prime

T = int(input().strip())
for _ in range(T):
    n = int(input().strip())
    if n < 2:
        print(2)
    else:
        print(isPrimeNum(n))