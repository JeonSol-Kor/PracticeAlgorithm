import sys
input = sys.stdin.readline

T = int(input().strip())

for _ in range(T):
    n = int(input().strip())
    big = n
    while n > 1:
        if n % 2 == 0:
            n //= 2
        else:
            n = 3 * n + 1
            if n > big:
                big = n
    print(big)