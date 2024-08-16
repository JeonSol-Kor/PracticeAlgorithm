import sys

input = sys.stdin.readline

A, B, C = map(int, input().strip().split())

result = 0

if C - B <= 0:
    result = -1
else:
    result = A // (C - B) + 1

sys.stdout.write(str(result) + "\n")