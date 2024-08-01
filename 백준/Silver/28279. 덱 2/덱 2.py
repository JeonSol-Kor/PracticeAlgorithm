from collections import deque
import sys

input = sys.stdin.readline

N = int(input())
queue = deque()
result = []

for _ in range(N):
    command = input().split()
    if command[0] == "1":
        queue.appendleft(int(command[1]))
    elif command[0] == "2":
        queue.append(int(command[1]))
    elif command[0] == "3":
        if len(queue) != 0:
            result.append(queue.popleft())
        else:
            result.append(-1)
    elif command[0] == "4":
        if len(queue) != 0:
            result.append(queue.pop())
        else:
            result.append(-1)
    elif command[0] == "5":
        result.append(len(queue))
    elif command[0] == "6":
        if len(queue) == 0:
            result.append(1)
        else:
            result.append(0)
    elif command[0] == "7":
        if len(queue) != 0:
            result.append(queue[0])
        else:
            result.append(-1)
    elif command[0] == "8":
        if len(queue) != 0:
            result.append(queue[-1])
        else:
            result.append(-1)

sys.stdout.write("\n".join(map(str, result)) + '\n')