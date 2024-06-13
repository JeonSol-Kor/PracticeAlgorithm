N = int(input())
leftCount = 0
rightCount = 0
leftMax = 0
rightMax = 0
trophys = list()

for i in range(N):
    trophy = int(input())
    trophys.append(trophy)

for i in range(N):
    if trophys[i] > leftMax:
        leftMax = trophys[i]
        leftCount += 1
    if trophys[N - i - 1] > rightMax:
        rightMax = trophys[N - i - 1]
        rightCount += 1

print(f"{leftCount}\n{rightCount}")