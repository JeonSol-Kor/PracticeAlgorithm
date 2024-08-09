import sys
import math

input = sys.stdin.readline

def my_round(val):
    if val - int(val) >= 0.5:
        return int(val)+1
    else:
        return int(val)

n = int(input().strip())
if n:
    scores = []

    for _ in range(n):
        scores.append(int(input().strip()))

    scores.sort()

    exclusion = my_round(n * 0.15)

    if exclusion > 0:
        new_scores = scores[exclusion:-exclusion]
    else:
        new_scores = scores

    avg = sum(new_scores) / len(new_scores) if new_scores else 0

    print(my_round(avg))
else:
    print(0)