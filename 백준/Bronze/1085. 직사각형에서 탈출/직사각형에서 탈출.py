x, y, w, h = map(int, input().split())

distances = [w - x, h - y, x, y]
min = 1001
for distance in distances:
    if min > distance:
        min = distance

print(min)
