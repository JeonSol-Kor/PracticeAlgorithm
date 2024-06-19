import sys

input = sys.stdin.readline

T = int(input())
for _ in range(T):
    words = input()
    leftCount = 0
    rightCount = 0
    stop = False
    for word in words:
        if leftCount < rightCount:
            stop = True
            break
        if word == "(":
            leftCount += 1
        elif word == ")":
            rightCount += 1
    if stop or leftCount != rightCount:
        print("NO")
    elif leftCount == rightCount:
        print("YES")