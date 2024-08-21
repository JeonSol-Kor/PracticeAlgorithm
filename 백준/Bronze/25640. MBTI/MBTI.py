import sys

input = sys.stdin.readline

jinho = input().strip()
N = int(input().strip())
result = 0

for _ in range(N):
    mbti = input().strip()
    if mbti == jinho:
        result += 1

sys.stdout.write(str(result) + '\n')