import sys

input = sys.stdin.readline

words = input().strip()
moeums = ['a', 'e', 'i', 'o', 'u']
result = 0

for word in words:
    for mo in moeums:
        if word == mo:
            result += 1
            break

print(result)