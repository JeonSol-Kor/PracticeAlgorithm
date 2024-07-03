nowTime = list(map(int, input().split(":")))
endTime = list(map(int, input().split(":")))

answer = [0] * 3

for i in range(2, -1, -1):
    answer[i] += endTime[i] - nowTime[i]
    if i > 0:
        if answer[i] < 0:
            answer[i] += 60
            answer[i - 1] -= 1
        elif answer[i] > 60:
            answer[i] -= 60
            answer[i - 1] += 1

    elif i == 0:
        if answer[i] < 0:
            answer[i] += 24
        elif answer[i] > 23:
            answer[i] -= 24

result = list()
for time in answer:
    if time < 10:
        fix = "0" + str(time)
    else:
        fix = str(time)
    result.append(fix)

print(":".join(map(str, result)))