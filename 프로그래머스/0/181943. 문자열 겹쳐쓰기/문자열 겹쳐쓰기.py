def solution(my_string, overwrite_string, s):
    answer = my_string[0:s] + overwrite_string + my_string[len(overwrite_string)+s:]
    return answer