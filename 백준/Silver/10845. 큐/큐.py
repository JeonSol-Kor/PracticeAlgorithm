import sys
from collections import deque

input = sys.stdin.readline

N = int(input())
queue = deque()
result = list()

for _ in range(N):
    line = list(input().strip().split())
    if line[0] == "push":
        queue.append(int(line[1]))
    elif line[0] == "pop":
        if queue:
            result.append(queue.popleft())
        else:
            result.append(-1)
    elif line[0] == "size":
        result.append(len(queue))
    elif line[0] == "empty":
        if queue:
            result.append(0)
        else:
            result.append(1)
    elif line[0] == "front":
        if queue:
            result.append(queue[0])
        else:
            result.append(-1)
    elif line[0] == "back":
        if queue:
            result.append(queue[-1])
        else:
            result.append(-1)

sys.stdout.write('\n'.join(map(str, result)) + '\n')