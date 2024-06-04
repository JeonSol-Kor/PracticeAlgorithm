def factorial(n):
    fact = 1
    for i in range(1, n + 1):
        fact *= i
    return fact

def combination(n, k):
    return factorial(n) // (factorial(k) * factorial(n - k))


T = int(input())

for _ in range(T):
    N, M = map(int, input().split())
    print(combination(M, N))