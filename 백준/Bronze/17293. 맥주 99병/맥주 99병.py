import sys

input = sys.stdin.readline
print = sys.stdout.write

N = int(input().strip())

def S(num):
    if num == 1:
        return '1 bottle'
    elif num > 1:
        return f'{num} bottles'
    elif num == 0:
        return 'no more bottles'

for i in range(N, 0, -1):
    print(f"{S(i)} of beer on the wall, {S(i)} of beer.\nTake one down and pass it around, {S(i-1)} of beer on the wall.\n\n")

print(f"No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, {S(N)} of beer on the wall.\n")