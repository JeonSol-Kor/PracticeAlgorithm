import sys

input = sys.stdin.readline

n = int(input().strip())

result = list()
nums = [int(input().strip()) for _ in range(n)] 

stack = []
result = []
current = 1
isYes = True

for num in nums:
    while current <= num:
        stack.append(current)
        result.append('+')
        current += 1
    if stack[-1] == num:
        stack.pop()
        result.append('-')
    else:
        isYes = False
        break

if isYes:
    sys.stdout.write('\n'.join(map(str, result)) + '\n')
else:
    sys.stdout.write('NO' + '\n')