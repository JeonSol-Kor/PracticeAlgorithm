Gunnar = list(map(int, input().split()))
Emma = list(map(int, input().split()))

if sum(Gunnar) == sum(Emma):
    print("Tie")
elif sum(Gunnar) > sum(Emma):
    print("Gunnar")
else:
    print("Emma")