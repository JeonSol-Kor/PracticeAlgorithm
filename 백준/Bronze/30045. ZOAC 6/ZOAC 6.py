N = int(input())
count = 0
for _ in range(N):
    check = input()
    if '01' in check:
        count += 1
    elif 'OI' in check:
        count += 1
print(count)