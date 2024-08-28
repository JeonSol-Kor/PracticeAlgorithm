import sys

input = sys.stdin.readline
print = sys.stdout.write

min_buger = 2001
min_drink = 2001

for _ in range(3):
    buger = int(input().strip())
    if buger < min_buger:
        min_buger = buger

for _ in range(2):
    drink = int(input().strip())
    if drink < min_drink:
        min_drink = drink

print(f"{min_buger + min_drink - 50}\n")