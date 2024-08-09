import sys

input = sys.stdin.readline

N = int(input())
A = set(map(int, input().split()))
M = int(input())
B = list(map(int, input().split()))
result = list()

for checkNum in B:
    if checkNum in A:
        result.append(1)
    else:
        result.append(0)

sys.stdout.write('\n'.join(map(str, result)) + '\n')