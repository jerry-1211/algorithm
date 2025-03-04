from collections import deque 
def solution(begin, target, words):
    answer = 0
    
    if target not in words:
        return 0 
    
    words = [[0,words[i]] for i in range(len(words))]
    
    q = deque([[0,begin]])
    
    
    while q:
        v = q.popleft()
        if v[1] == target:
            return v[0]
        
        for k in range(len(words)):
            if words[k][0] == 0:  # 방문하지 않는 경우 
                count = 0 
                for i in range(len(words[k][1])):
                    if words[k][1][i] != v[1][i]: # 방문하지 않은 words와 현재 v 비교 
                        count += 1
                                
                if count == 1 :
                    q.append([v[0]+1,words[k][1]])
                    words[k][0] = 1
    
    return answer