N, B = input().split()

B = int(B)

output = 0

for i in range(len(N)):
    if ord(N[i]) > 64 and ord(N[i]) < 91:
        output += (ord(N[i])-55) * B**(len(N)-i-1)
    else:
        output += int(N[i]) * B**(len(N)-i-1)

print(output)