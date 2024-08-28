import sys

input = sys.stdin.readline

n, e = map(int,input().strip().split())
if n == 1:
    if e == 1: print(0)
    else:
        input()
        print(sum(map(int, input().strip().split())))
elif n > 1:
    if e == 1:
        print(sum(map(int, input().strip().split())))
    else:
        x, y = sum(map(int, input().strip().split())), sum(map(int,input().strip().split()))
        pita = x ** 2 + y ** 2
        d = int(pita ** (1/2))
        if d ** 2 < pita:
            d += 1
        print(d)