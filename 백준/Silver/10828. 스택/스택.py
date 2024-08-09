import sys
from collections import deque

input = sys.stdin.readline

N = int(input())
stack = deque()
result = list()

for _ in range(N):
    line = list(input().strip().split())
    if line[0] == "push":
        stack.append(int(line[1]))
    elif line[0] == "pop":
        if stack:
            result.append(stack.pop())
        else:
            result.append(-1)
    elif line[0] == "size":
        result.append(len(stack))
    elif line[0] == "empty":
        if stack:
            result.append(0)
        else:
            result.append(1)
    elif line[0] == "top":
        if stack:
            result.append(stack[-1])
        else:
            result.append(-1)

sys.stdout.write('\n'.join(map(str, result)) + '\n')