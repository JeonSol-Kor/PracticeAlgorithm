N = int(input())
sequence = 1
door = 1
while N > sequence:
    sequence += 6 * door
    door += 1

print(door)