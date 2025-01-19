def solution(nums):
    lst = set(nums)
    answer = min(len(lst),len(nums)//2)
    return answer
