import sys
input = sys.stdin.readline

N = int(input())
count = 0
gomgom = set()
for i in range(N):
    inputChat = input().strip()
    if inputChat == "ENTER":
        gomgom.clear()
    elif inputChat not in gomgom:
        gomgom.add(inputChat)
        count += 1

print(count)