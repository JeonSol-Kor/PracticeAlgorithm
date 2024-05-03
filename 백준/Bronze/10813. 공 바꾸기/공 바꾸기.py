N, M = map(int, input().split())

basket = []
for i in range(N):
    basket.append(i+1)

for _ in range(M):
    A, B = map(int, input().split())
    C = 0
    C = basket[A -1]
    basket[A -1] = basket[B -1]
    basket[B -1] = C

print(*basket)