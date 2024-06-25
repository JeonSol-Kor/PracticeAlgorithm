import sys, math
input = sys.stdin.readline

def eratosChe(n):
    limit = 2 * n
    isPrimeNums = [True] * (limit + 1)
    isPrimeNums[0] = False
    isPrimeNums[1] = False
    for i in range(2, int(math.sqrt(limit)) + 1):
        if isPrimeNums[i]:
            for j in range(i * i, limit + 1, i):
                isPrimeNums[j] = False
    
    count = 0
    for i in range(n+1, 2*n+1):
        if isPrimeNums[i]:
            count += 1

    return count

while True:
    n = int(input())
    if n == 0:
        break
    sys.stdout.write(str(eratosChe(n)) + "\n")