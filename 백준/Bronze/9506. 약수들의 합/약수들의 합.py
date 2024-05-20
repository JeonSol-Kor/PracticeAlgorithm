n = int(input())
while n != -1:
    aliquot = []
    for i in range(1, n):
        if n % i == 0:
            aliquot.append(i)
    if sum(aliquot) == n:
        print(str(sum(aliquot)) + " = ", end="")
        for i in range(len(aliquot) - 1):
            print(str(aliquot[i]) + " + ", end="")
        print(str(aliquot[len(aliquot) - 1]))
    else:
        print(f"{n} is NOT perfect.")

    n = int(input())