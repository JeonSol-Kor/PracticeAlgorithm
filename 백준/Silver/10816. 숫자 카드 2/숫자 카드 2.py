import sys

N = int(sys.stdin.readline())
cards = list(map(int, sys.stdin.readline().split()))
M = int(sys.stdin.readline())
checks = list(map(int, sys.stdin.readline().split()))

cardsdict = {}
for num in cards:
    if num in cardsdict:
        cardsdict[num] += 1
    else:
        cardsdict[num] = 1

for check in checks:
    if check in cardsdict:
        print(cardsdict[check], end=" ")
    else:
        print(0, end=" ")