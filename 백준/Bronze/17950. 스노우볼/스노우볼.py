import sys

input = sys.stdin.readline

H, x = map(int, input().strip().split())
result = 0
MOD = 10 ** 9 + 7

for i in range(H):
    c = int(input().strip()) 
    result += (c  * pow(x, i+1, MOD))

result %= MOD

sys.stdout.write(f"{result}\n")