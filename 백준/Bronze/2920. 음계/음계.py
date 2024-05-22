music = list(map(int, input().split()))
output = ""
for i in range(len(music)):
    if music[0] == 1:
        if music[i] != i + 1:
            output = "mixed"
            break
        else:
            output = "ascending"
    elif music[0] == 8:
        if music[i] != 8 - i:
            output = "mixed"
            break
        else:
            output = "descending"
    else:
        output = "mixed"

print(output)