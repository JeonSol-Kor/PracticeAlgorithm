N = input()

oldNum = N
newNum = ""
count = 0

while N != newNum:
    if len(oldNum) == 1:
        oldNum = "0" + oldNum
    sumNum = str(int(oldNum[0]) + int(oldNum[1]))
    newNum = str(oldNum[-1]) + str(sumNum[-1])
    oldNum = newNum
    count += 1
    if newNum[0] == "0":
        newNum = newNum[-1]
    
print(count)