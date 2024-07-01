import sys
input = sys.stdin.readline

N = int(input())

xList = list()

for _ in range(N):
    order = input()
    if order[0] == '1':
        num, x = map(int, order.split())
        xList.append(x)
    elif order[0] == '2':
        if len(xList) == 0:
            print(-1)
        else:
            print(xList[-1])
            xList.pop()
    elif order[0] == '3':
        print(len(xList))
    elif order[0] == '4':
        if len(xList) == 0:
            print(1)
        else:
            print(0) 
    elif order[0] == '5':
        if len(xList) == 0:
            print(-1)
        else:
            print(xList[-1])