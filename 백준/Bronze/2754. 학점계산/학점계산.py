score = input()
if score == 'F':
    print("0.0")
else:
    output = 69 - ord(score[0]) + 0.0
    if score[1] == "+":
        output += 0.3
    elif score[1] == "-":
        output -= 0.3
    
    print(output)