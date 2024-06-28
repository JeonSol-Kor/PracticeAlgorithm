import sys
input = sys.stdin.readline

T = int(input().strip())

checkPrime = [True for _ in range(1000001)]

for i in range(2, int(1000000 ** 0.5) + 1):
    if checkPrime[i]:
        for j in range(2 * i, len(checkPrime), i):
            checkPrime[j] = False

primeNums = [i for i in range(2, 1000000 + 1) if checkPrime[i]]
primeSet = set(primeNums)

answer = list()
for _ in range(T):
    count = 0
    N = int(input().strip())
    for prime in primeNums:
        if prime > N // 2:
            break
        elif (N - prime) in primeSet:
            count += 1
    answer.append(str(count))

sys.stdout.write("\n".join(answer) + "\n")