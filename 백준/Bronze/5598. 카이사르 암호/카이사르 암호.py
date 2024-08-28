import sys

input = sys.stdin.readline

word = input().strip()
result = ""

for wo in word:
    add = ord(wo) - 3
    if ord(wo) - 3 < ord('A'):
        add += (ord('Z') - ord('A') + 1)
    result += chr(add)

print(result)