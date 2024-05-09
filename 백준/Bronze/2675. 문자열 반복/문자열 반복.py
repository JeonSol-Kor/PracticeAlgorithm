T = int(input())

output = list()

for i in range(T):
    R, S = map(str, input().split())
    R = int(R)
    output.append('')
    for j in range(len(S)):
        output[i] += S[j] * R
    print(output[i])