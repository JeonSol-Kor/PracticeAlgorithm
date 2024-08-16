import sys

input = sys.stdin.readline

A, B, C = map(int, input().strip().split())

if C % 2 == 0:
    result = A
else:
    result = A ^ B

sys.stdout.write(str(result) + '\n')