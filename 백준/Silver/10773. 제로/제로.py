import sys
input = sys.stdin.readline

K = int(input())

nums = list()

for _ in range(K):
    num = int(input())
    if num == 0:
        nums.pop()
    else:
        nums.append(num)

sum = 0
for num in nums:
    sum += num

print(sum)