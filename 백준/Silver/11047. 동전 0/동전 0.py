import sys
input = sys.stdin.readline

N, K = map(int, input().split())

coins = list()

for _ in range(N):
    coins.append(int(input()))

count = 0
for i in range(N):
    coin = coins[N - i - 1]
    if K >= coin:
        count += K // coin
        K %= coin
    if K == 0:
        break

print(count)