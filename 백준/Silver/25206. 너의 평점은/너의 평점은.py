sumScore = 0.0
sumCredit = 0.0

for _ in range(20):
    subject, crdit, grade = input().split()
    credit = float(crdit)
    
    if grade != "P":
        if grade == "F":
            score = 0.0
        elif grade == "A+":
            score = 4.5
        elif grade == "A0":
            score = 4.0
        elif grade == "B+":
            score = 3.5
        elif grade == "B0":
            score = 3.0
        elif grade == "C+":
            score = 2.5
        elif grade == "C0":
            score = 2.0
        elif grade == "D+":
            score = 1.5
        elif grade == "D0":
            score = 1.0
            
        sumCredit += credit
        sumScore += score * credit

print(sumScore/sumCredit)