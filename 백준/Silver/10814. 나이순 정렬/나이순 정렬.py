import sys

N = int(sys.stdin.readline())
members = list()
for index in range(N):
    age, name = sys.stdin.readline().split()
    age = int(age)
    members.append([index, age, name])

members.sort(key=lambda member: (member[1], member[0]))

for member in members:
    sys.stdout.write(f"{member[1]} {member[2]}\n")