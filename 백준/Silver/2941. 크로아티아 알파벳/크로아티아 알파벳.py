Input = input()

croatia = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]

for i in range(len(croatia)):
    if croatia[i] in Input:
        Input = Input.replace(croatia[i], 'A')

print(len(Input))