H, M = map(int, input().split())
time = int(input())

timeH = 0
timeM = 0

if(time > 59):
    timeH = int(time / 60)
    timeM = time % 60
else:
    timeM = time

outputH = timeH + H
outputM = timeM + M

if(outputM > 59):
    outputH = outputH + 1
    outputM = outputM - 60

if(outputH > 23):
    outputH = outputH - 24

print(outputH, outputM)