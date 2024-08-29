def solution(n, lost, reserve):
    answer = n
    stds = [0] * n
    
    for lo in lost:
        stds[lo-1] -= 1
    
    for re in reserve:
        stds[re-1] += 1
    
    for i in range(n):
        if stds[i] == -1:
            if i > 0 and stds[i-1] == 1:
                stds[i-1] -= 1
                stds[i] += 1
            elif i < n-1 and stds[i+1] == 1:
                stds[i] += 1
                stds[i+1] -= 1
            else:
                answer -= 1

    return answer