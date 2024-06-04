N = int(input())
result = 1
output = 0
for i in range(1, N+1):
    result *= i
strRe = str(result)
for i in range(len(strRe) - 1, 0, -1):
    if strRe[i] == '0':
        output += 1
    else:
        break
print(output)