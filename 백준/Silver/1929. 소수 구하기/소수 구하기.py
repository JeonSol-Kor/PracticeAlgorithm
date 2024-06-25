import math

def primeNum(M, N):
    primeNums = list()
    for i in range(M, N+1):
        check = True
        for j in range(2, int(math.sqrt(i)) + 1):
            if i % j == 0:
                check = False
                break
        if check:
            primeNums.append(i)
    return primeNums

M, N = map(int, input().split())
if M == 1:
    M = 2
primeNums = primeNum(M, N)
answer = ""
for prime in primeNums:
    answer += str(prime) + "\n"

print(answer)