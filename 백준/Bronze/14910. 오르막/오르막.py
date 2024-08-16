import sys

input = sys.stdin.readline

nums = list(map(int, input().strip().split()))
temp = -1000001
result = "Good"

for num in nums:
    if num >= temp:
        temp = num
    else:
        result = "Bad"
        break

sys.stdout.write(f"{result}" + '\n')