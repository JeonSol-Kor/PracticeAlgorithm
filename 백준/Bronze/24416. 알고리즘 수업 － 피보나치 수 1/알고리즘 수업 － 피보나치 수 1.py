import sys

input = sys.stdin.readline

n = int(input().strip())

fib_count = list(range(n))
fib_count[0], fib_count[1] = 1, 1

for i in range(2, n):
    fib_count[i] = fib_count[i-1] + fib_count[i-2]

sys.stdout.write(f"{fib_count[n-1]} {n-2}\n")