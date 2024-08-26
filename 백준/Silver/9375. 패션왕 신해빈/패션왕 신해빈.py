import sys

input = sys.stdin.readline

T = int(input().strip())

for _ in range(T):
    n = int(input().strip())
    clothes = {}

    for _ in range(n):
        item, category = input().strip().split()
        
        if category in clothes:
            clothes[category].append(item)
        else:
            clothes[category] = [item]

    result = 1
    for category in clothes:
        result *= (len(clothes[category]) + 1)

    sys.stdout.write(f"{result - 1}\n")