import sys
input = sys.stdin.readline

M = int(input())
S = dict()
for i in range(21):
    S[i] = 0

for _ in range(M):
    yeonSan = input().split()
    if len(yeonSan) == 2:
        func, num = yeonSan[0], int(yeonSan[1])
        if func == "add":
            S[num] = 1
        elif func == "remove":
            S[num] = 0
        elif func == "check":
            if S[num] == 0:
                print(0)
            elif S[num] == 1:
                print(1)
        elif func == "toggle":
            if S[num] == 0:
                S[num] = 1
            elif S[num] == 1:
                S[num] = 0
    elif yeonSan[0] == "empty":
        for i in range(21):
            S[i] = 0
    elif yeonSan[0] == "all":
        for i in range(21):
            S[i] = 1