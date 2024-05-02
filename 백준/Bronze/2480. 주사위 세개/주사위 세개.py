dice1, dice2, dice3 = map(int, input().split())

if(dice1 == dice2 and dice2 == dice3 and dice3 == dice1):
    print(10000 + dice1 * 1000)
elif(dice1 == dice2 or dice2 == dice3 or dice3 == dice1):
    if(dice1 == dice2 or dice3 == dice1):
        print(1000 + dice1 * 100)
    else:
        print(1000 + dice2 * 100)
else:
    max = dice1
    if(dice2 > max):
        max = dice2
    if(dice3 > max):
        max = dice3
    print(max * 100)