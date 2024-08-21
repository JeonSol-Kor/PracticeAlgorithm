import sys

input = sys.stdin.readline

n = int(input().strip())
q1, q2, q3, q4, AXIS = 0, 0, 0, 0, 0

for _ in range(n):
    x, y = map(int, input().strip().split())
    if x * y == 0:
        AXIS += 1
    elif x > 0 and y > 0:
        q1 += 1
    elif x < 0 and y > 0:
        q2 += 1
    elif x < 0 and y < 0:
        q3 += 1
    elif x > 0 and y < 0:
        q4 += 1

sys.stdout.write(f"Q1: {q1}\nQ2: {q2}\nQ3: {q3}\nQ4: {q4}\nAXIS: {AXIS}\n")