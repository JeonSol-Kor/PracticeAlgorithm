N = int(input())
size = list(map(int, input().split()))
T, P = map(int, input().split())
muk = 0
for cloth in size:
    if cloth % T == 0:
        muk += cloth // T
    else:
        muk += cloth // T + 1

penMuk = N // P
penEx = N % P

print(f"{muk}\n{penMuk} {penEx}")