import sys

input = sys.stdin.readline

A = int(input())
B = int(input())
C = int(input())
D = int(input())

sum = A + B + C + D
min = sum // 60
sec = sum % 60

sys.stdout.write(f"{min}\n{sec}")