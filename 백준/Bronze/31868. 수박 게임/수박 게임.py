N, K = map(int, input().split())

result = K

for _ in range(N - 1):
    result //= 2

print(result)