import sys
from collections import deque

input = sys.stdin.readline

N = int(input().strip())
A = list(map(int, input().strip().split()))
B = list(map(int, input().strip().split()))
M = int(input().strip())
C = list(map(int, input().strip().split()))

queues = deque()

for i in range(N):
    if A[i] == 0:
        queues.appendleft(B[i])

results = []

for value in C:
    queues.append(value)
    results.append(queues.popleft())

sys.stdout.write(' '.join(map(str, results)) + '\n')