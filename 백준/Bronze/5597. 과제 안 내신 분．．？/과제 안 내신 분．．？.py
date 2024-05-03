student = []
for _ in range(30):
    student.append(False)

for i in range(28):
    submit = int(input())
    student[submit - 1] = True

for i in range(30):
    if student[i] == False:
        print(i + 1)