import sys

input = sys.stdin.readline

m = int(input().strip())
d = int(input().strip())
result = "Before"

if m == 2:
    if d == 18:
        result = "Special"
    elif d > 18:
        result = "After"
elif m > 2:
    result = "After"

sys.stdout.write(result + '\n')