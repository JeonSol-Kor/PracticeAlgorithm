N = int(input())
measures = list()
cpN = N
for i in range(2, N+1):
    while cpN % i == 0:
        cpN = cpN // i
        measures.append(i)
    if cpN == 1:
        break

for measure in measures:
    print(measure)