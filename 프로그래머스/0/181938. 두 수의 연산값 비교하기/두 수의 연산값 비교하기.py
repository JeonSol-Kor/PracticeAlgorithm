def solution(a, b):
    check1 = str(a) + str(b)
    num1 = int(check1)
    num2 = 2 * a * b
    if num1 > num2:
        answer = num1
    else:
        answer = num2
    return answer