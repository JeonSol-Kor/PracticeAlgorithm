import sys

input = sys.stdin.readline

Asize, Bsize = map(int, input().split())

Aset = set(map(int, input().split()))
Bset = set(map(int, input().split()))
count = 0

for A in Aset:
    if not A in Bset:
        count += 1

for B in Bset:
    if not B in Aset:
        count += 1
        
print(count)