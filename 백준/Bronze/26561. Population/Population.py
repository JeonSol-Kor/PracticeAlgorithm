import sys

n = int(sys.stdin.readline().strip())
for _ in range(n):
    p, t = map(int, sys.stdin.readline().split())
    die = t // 7
    birth = t // 4
    print(p - die + birth)