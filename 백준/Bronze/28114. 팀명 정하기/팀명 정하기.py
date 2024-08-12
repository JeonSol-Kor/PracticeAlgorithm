import sys

input =  sys.stdin.readline

participants = []
for _ in range(3):
    P, Y, S = input().split()
    P = int(P)
    Y = int(Y)
    participants.append((P, Y, S))

years_remainder = sorted([y % 100 for _, y, _ in participants])
first_team_name = ''.join(map(str, years_remainder))

sorted_participants = sorted(participants, key=lambda x: x[0], reverse=True)
second_team_name = ''.join([s[0] for _, _, s in sorted_participants])

print(first_team_name)
print(second_team_name)