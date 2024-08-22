import sys

input = sys.stdin.readline

line = input().strip()
score = 0
score_board = []
result = 0

for li in line:
    if li == '(':
        score += 1
    elif li == '{':
        score += 2
    elif li == '[':
        score += 3
    elif li == ')':
        score -= 1
    elif li == '}':
        score -= 2
    elif li == ']':
        score -= 3
    else:
        score_board.append((li, score))

for _, score in score_board:
    if result < score:
        result = score

print(result)