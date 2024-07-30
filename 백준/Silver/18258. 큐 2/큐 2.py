import sys
from collections import deque

input = sys.stdin.readline

queue = deque()
results = []

while True:
    line = input().strip()
    if not line:
        break
    command = line.split()
    
    if command[0] == "push":
        queue.append(int(command[1]))
    elif command[0] == "pop":
        if queue:
            results.append(queue.popleft())
        else:
            results.append(-1)
    elif command[0] == "size":
        results.append(len(queue))
    elif command[0] == "empty":
        results.append(1 if not queue else 0)
    elif command[0] == "front":
        results.append(queue[0] if queue else -1)
    elif command[0] == "back":
        results.append(queue[-1] if queue else -1)

# 출력 결과를 줄 단위로 작성
sys.stdout.write("\n".join(map(str, results)) + "\n")
