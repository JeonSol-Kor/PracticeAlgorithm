N, K = map(int, input().split())

count = 0
aliquot = 1
while count < K and aliquot <= N:
    if N % aliquot == 0:
        count += 1
    aliquot += 1
    
if aliquot == N + 1:
    if count < K:
        print("0")
    else:
        print(aliquot-1)
else:
    print(aliquot-1)