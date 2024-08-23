import sys
from collections import deque

input = sys.stdin.readline

comCount = int(input().strip())
lines = int(input().strip())
result = 0

connecting = list(list() for _ in range(comCount))
check = list(False for _ in range(comCount))
check[0] = True 

for _ in range(lines):
    a, b = map(int, input().strip().split())
    connecting[a-1].append(b-1)
    connecting[b-1].append(a-1)

stack = deque()
stack.append(0)

while stack:
    node = stack.pop()
    result += 1

    for neighbor in connecting[node]:
        if not check[neighbor]:
            stack.append(neighbor)
            check[neighbor] = True

sys.stdout.write(f"{result - 1}\n")