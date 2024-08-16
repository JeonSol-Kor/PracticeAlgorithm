import sys

input = sys.stdin.readline

A, B = map(int, input().strip().split())
result = (2 + (A - 2) * B) * (B + 1) // 2

sys.stdout.write(f"{result}" + '\n')