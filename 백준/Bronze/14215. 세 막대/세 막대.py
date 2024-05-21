sides = list(map(int, input().split()))
sides.sort()

if sides[2] < sides[0] + sides[1]:
    print(sum(sides))
else:
    print(2 * (sides[0] + sides[1]) - 1)
