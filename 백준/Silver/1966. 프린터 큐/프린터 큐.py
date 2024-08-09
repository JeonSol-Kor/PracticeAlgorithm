import sys
from collections import deque

input = sys.stdin.readline

T = int(input())
result = list()

for _ in range(T):
    N, M = map(int, input().strip().split())
    scores = deque(map(int, input().strip().split()))
    index = deque(range(N))

    order = 0

    while scores:
        if scores[0] == max(scores):
            order += 1
            scores.popleft()
            if index.popleft() == M:
                result.append(order)
                break
        else:
            scores.rotate(-1)
            index.rotate(-1)

sys.stdout.write('\n'.join(map(str, result)) + '\n')