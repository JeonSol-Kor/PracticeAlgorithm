import sys

input = sys.stdin.readline

N, M = map(int, input().split())

hear = set()
for _ in range(N):
    hear.add(input().strip())

see = set()
for _ in range(M):
    see.add(input().strip())

result = sorted(hear & see)

print(len(result))
for name in result:
    print(name)