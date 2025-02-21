from collections import deque

def solution(n, wires):
    answer = float('INF')
    
    for i in range(n-1):
        tmp_wires = wires[:]
        tmp_wires.pop(i)
        
        lst = [[] for _ in range(n+1)]
        visit = [-1] * (n+1)

        for l in tmp_wires:
            lst[l[0]].append(l[1])
            lst[l[1]].append(l[0])            

        visit[1] = 1
        q = deque([1])
        cnt = 1 
        
        while  q:
            v = q.popleft()
            for k in lst[v]:
                if visit[k] == -1 :
                    visit[k] = 1
                    q.append(k)
                    cnt += 1
                    
            
        answer = min(answer,abs(cnt-(n-cnt)))
        
        
        
    return answer