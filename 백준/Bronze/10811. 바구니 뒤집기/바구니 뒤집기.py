N, M = map(int, input().split())

basket = []
temp = []

for i in range(N):
    basket.append(i+1)

for _ in range(M):
    i, j = map(int, input().split())
    temp = basket[:]
    for k in range(i-1, j):
        basket[k] = temp[j - 1 - k + i - 1]
    temp = basket[:]

print(*basket)