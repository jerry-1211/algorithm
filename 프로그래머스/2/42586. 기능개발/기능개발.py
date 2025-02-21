from collections import deque

def solution(progresses, speeds):
    answer = []
    
    lst = deque()
    for i in range(len(speeds)):
        lst.append([progresses[i],speeds[i]])

            
    while(lst):
        cnt = 0 
        for i in range(len(lst)) :
            lst[i][0] += lst[i][1]
            
        while lst and lst[0][0] >= 100:
            lst.popleft()
            cnt += 1 
        
        if cnt : 
            answer.append(cnt)

        
    return answer