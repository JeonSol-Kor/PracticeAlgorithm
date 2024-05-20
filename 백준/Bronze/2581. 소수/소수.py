M = int(input())
N = int(input())

primeN = list()

if N == 1:
    print("-1")
else:
    if M == 1 or M == 2:
        primeN.append(2)
    for i in range(M, N+1):
        for j in range(2, i):
            if i % j == 0:
                break
            else:
                if j == i - 1:
                    primeN.append(i)
    if len(primeN) == 0:
        print("-1")
    else:
        print(sum(primeN))
        print(primeN[0])