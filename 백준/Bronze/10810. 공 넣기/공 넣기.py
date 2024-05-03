N, M = map(int, input().split())

basket = []
for _ in range(N):
    basket.append(0)

for _ in range(M):
    min, max, ball = map(int, input().split())
    
    for i in range(min-1, max):
        basket[i] = ball;

print(*basket)