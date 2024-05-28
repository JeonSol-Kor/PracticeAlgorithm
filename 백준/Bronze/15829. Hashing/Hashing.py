L = int(input())
Hash = input()
M = 0

for i in range(len(Hash)):
    M += (ord(Hash[i]) - 96) * 31**i

print(M)