from collections import deque

def solution(priorities, location):
    visit = deque([i for i in range(len(priorities))])
    priorities = deque(priorities)
    
    rs, answer = visit[location], 0    
    
    while priorities :
        if priorities[0] == max(priorities):
            
            if visit[0] == rs:
                answer += 1
                return answer
            
            priorities.popleft()
            visit.popleft()
            answer += 1
            
        else:       
            p_tmp = priorities.popleft()
            v_tmp = visit.popleft()
            priorities.append(p_tmp)
            visit.append(v_tmp)
            
    
    return answer