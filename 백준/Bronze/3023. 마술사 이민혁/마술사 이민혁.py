import sys

input = sys.stdin.readline

R, C = map(int, input().strip().split())

exCards = list()
resultCards = list()

for i in range(R):
    exCards.append(list(input().strip()))

A, B = map(int, input().strip().split())

for i in range(R):
    resultCards.append(exCards[i] + exCards[i][::-1])

for i in range(R):
    resultCards.append(exCards[R-i-1] + exCards[R-i-1][::-1])

if resultCards[A-1][B-1] == '#':
    resultCards[A-1][B-1] = "."
else:
    resultCards[A-1][B-1] = "#"

resultCards = [''.join(row) for row in resultCards]
sys.stdout.write('\n'.join(map(str, resultCards)))