N = int(input())

Scores = [int(x) for x in input().split()]

max = 0
fixAverage = 0.0
fixSum = 0.0

for score in Scores:
    if score > max:
        max = score

for score in Scores:
    fixSum += score / max * 100

fixAverage = fixSum / N

print(fixAverage)