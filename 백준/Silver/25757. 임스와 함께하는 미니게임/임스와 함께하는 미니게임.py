import sys

input = sys.stdin.readline

N, game = map(str, input().strip().split())

people = set()

for _ in range(int(N)):
    person = input().strip()
    people.add(person)

div = 1
if game == 'F':
    div = 2
elif game == 'O':
    div = 3

print(len(people) // div)