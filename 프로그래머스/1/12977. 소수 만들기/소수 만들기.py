def solution(nums):
    answer = 0
    for i in range(0, len(nums)-2):
        for j in range(i+1, len(nums)-1):
            for k in range(j+1, len(nums)):
                checkNum = nums[i] + nums[j] + nums[k]
                if isPrime(checkNum):
                    answer += 1
    return answer

def isPrime(num):
    if num < 2:
        return False
    else:
        i = 2
        while i <= (num ** 0.5):
            if num % i == 0:
                return False
            i += 1
    return True