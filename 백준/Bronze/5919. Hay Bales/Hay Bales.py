import sys

N = int(sys.stdin.readline().strip())

piles = list()
sum = 0
for _ in range(N):
    pile = int(sys.stdin.readline().strip())
    sum += pile
    piles.append(pile)

average = sum // N

move = 0
for pile in piles:
    if pile > average:
        move += pile - average

print(move)