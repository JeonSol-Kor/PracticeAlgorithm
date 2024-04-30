A = int(input())
B = int(input())

B1 = int(B % 10)
B10 = int((B / 10) % 10)
B100 = int((B / 100) % 10)

print(A * B1)
print(A * B10)
print(A * B100)
print(A * B)