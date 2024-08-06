import sys

input = sys.stdin.readline

N = int(input().strip())
time = 1
result = list()
isReverse = False
answer = "NO"

for _ in range(N):
    type, num = map(str, input().strip().split())
    if type == "HOURGLASS":
        if time != int(num):
            isReverse = False if isReverse else True
        answer = "NO"
    else:
        answer = "YES" if time == int(num) else "NO"
    
    result.append(f"{time} {answer}")

    if isReverse:
        time -= 1
    else:
        time += 1
    if time > 12:
        time -= 12
    elif time < 1:
        time += 12

sys.stdout.write("\n".join(result) + "\n")