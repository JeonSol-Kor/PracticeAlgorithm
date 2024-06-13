JOIOI = input()

JOIcount = 0
IOIcount = 0
for i in range(len(JOIOI)-2):
    if JOIOI[i:i+3] == "JOI":
        JOIcount += 1
    elif JOIOI[i:i+3] == "IOI":
        IOIcount += 1

print(f"{JOIcount}\n{IOIcount}")