from collections import deque 
def solution(begin, target, words):
    answer = 0
    NOT_VISIT = 0 
    
    if target not in words:
        return 0 
    
    visit_words = [[NOT_VISIT,words[i]] for i in range(len(words))]
    q = deque([[NOT_VISIT,begin]])
    
    while q:
        current_depth, current_word = q.popleft()
        if current_word == target:
            return current_depth
        
        for k in range(len(visit_words)):
            if visit_words[k][0] == 0:  # 방문하지 않는 경우 
                count = 0 
                for i in range(len(visit_words[k][1])):
                    if visit_words[k][1][i] != current_word[i]: # 방문하지 않은 words와 현재 v 비교 
                        count += 1
                                
                if count == 1 :
                    q.append([current_depth+1,visit_words[k][1]])
                    visit_words[k][0] = 1 
    
    return answer