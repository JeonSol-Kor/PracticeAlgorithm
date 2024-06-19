C = int(input())

for _ in range(C):
    scores = list(map(int, input().split()))
    sum = 0
    for i in range(1, len(scores)):
        sum += scores[i]
    average = sum / scores[0]
    count = 0
    for i in range(1, len(scores)):
        if average < scores[i]:
            count += 1
    print(f"{(count * 100 / scores[0]):.3f}%")