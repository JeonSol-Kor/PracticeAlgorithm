A, B = map(int, input().split())

result = 0
score = 512

if A != B:
    while score > 0:
        if (A >= score and B < score) or (A < score and B >= score):
            result += score
        if A >= score:
            A -= score
        if B >= score:
            B -= score
        score //= 2

print(result)