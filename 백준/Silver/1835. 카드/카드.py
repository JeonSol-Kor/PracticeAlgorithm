import sys
from collections import deque

input = sys.stdin.readline

N = int(input().strip())

cards = deque()

for i in range(N, 0, -1):
    cards.appendleft(i)
    for j in range(i % len(cards)):
        cards.appendleft(cards.pop())

result = list()
for card in cards:
    result.append(card)

sys.stdout.write(' '.join(map(str, result)) + '\n')