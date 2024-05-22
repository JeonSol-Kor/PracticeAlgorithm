N, M = map(int, input().split())
cards = list(map(int, input().split()))

output = 0

for i in range(N-2):
    for j in range(i+1, N-1):
        for k in range(j+1, N):
            cardsSum = cards[i] + cards[j] + cards[k]
            if cardsSum <= M and cardsSum > output:
                output = cardsSum

print(output)