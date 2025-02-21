from collections import deque

def solution(s):
    answer = True
    lst = []
        
    for i in range(len(s)):
        if lst and s[i] == ")" : 
            lst.pop()
            continue 
            
        lst.append(s[i])
    
    if lst : 
        return False
    
    return True