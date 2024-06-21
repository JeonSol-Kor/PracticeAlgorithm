increase = True
output = "YES"

N = int(input())
A = list(map(int, input().split()))
check = 0
for i in A:
    if check == i:
        output = "NO"
        break
    if increase:
        if check < i:
            check = i
        else:
            increase = False
    else:
        if check > i:
            check = i
        else:
            output = "NO"
            break

print(output)