while True:
    A, B, C = map(int, input().split())
    if A == 0 or B == 0 or C == 0:
        break
    else:
        output = ""
        maxV = max(A, B, C)
        if maxV >= A + B or maxV >= B + C or maxV >= C + A:
            output = "Invalid"
        elif A == B == C:
            output = "Equilateral"
        elif A == B or B == C or C == A:
            output = "Isosceles"
        else:
            output = "Scalene"
        print(output)