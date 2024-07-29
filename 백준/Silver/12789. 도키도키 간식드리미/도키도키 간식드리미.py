from collections import deque
import sys
input = sys.stdin.readline

N = int(input())
firstLine = deque(map(int, input().split()))
lastLine = []
check = 1
answer = "Nice"

while firstLine:
    current = firstLine.popleft()
    if current == check:
        check += 1
        while lastLine and lastLine[-1] == check:
            lastLine.pop()
            check += 1
    else:
        if not lastLine or lastLine[-1] > current:
            lastLine.append(current)
        else:
            asnwer = "Sad"
            break

while lastLine:
    if lastLine.pop() != check:
        answer = "Sad"
        break
    check += 1

print(answer)