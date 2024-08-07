import sys
from collections import deque

input = sys.stdin.readline

n = int(input())
balloons = list(map(int, input().split()))

dq = deque((i, num) for i, num in enumerate(balloons, start=1))
result = []

while dq:
    idx, num = dq.popleft()
    result.append(idx)
    if not dq:
        break
    if num > 0:
        dq.rotate(-(num - 1))
    else:
        dq.rotate(-num)

print(*result)