def solution(a, b):
    check1 = str(a) + str(b)
    check2 = str(b) + str(a)
    num1 = int(check1)
    num2 = int(check2)
    if check1 > check2:
        answer = check1
    else:
        answer = check2
    return int(answer)