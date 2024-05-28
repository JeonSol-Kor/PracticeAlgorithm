while True:
    sides = list(map(int, input().split()))
    if sides[0] == 0 or sides[1] == 0 or sides[2] == 0:
        break
    else:
        sides.sort()
        if sides[2]**2 == sides[1]**2 + sides[0]**2:
            print("right")
        else:
            print("wrong")