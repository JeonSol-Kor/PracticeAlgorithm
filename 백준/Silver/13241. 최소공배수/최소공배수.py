def GCD(a, b):
    while b > 0:
        a, b = b, a % b
    return a

A, B = map(int, input().split())
print(A * B // GCD(A, B))