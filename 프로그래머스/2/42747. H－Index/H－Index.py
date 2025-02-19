def solution(citations):
    answer = 0
    citations.sort()
    mx = 0 
    
    for idx,value in enumerate(citations):
        if len(citations) - idx <= value :
            return len(citations) - idx
        mx = value 
    
    
    return mx