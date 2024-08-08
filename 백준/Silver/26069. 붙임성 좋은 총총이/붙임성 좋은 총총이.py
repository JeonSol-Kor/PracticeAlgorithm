import sys

input = sys.stdin.readline

N = int(input().strip())
people = set()
people.add("ChongChong")

for _ in range(N):
    one, two = map(str, input().split())
    if one in people or two in people:
        people.add(one)
        people.add(two)

sys.stdout.write(str(len(people)) + '\n')