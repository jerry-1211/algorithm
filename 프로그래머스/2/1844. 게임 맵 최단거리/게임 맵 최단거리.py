from collections import deque

def solution(maps):
        
    di,dj = [0,-1,0,1], [1,0,-1,0]
    n, m = len(maps), len(maps[0])
    
    if n == 1 and m == 1:
        return 1
    
    
    q = deque([[0,0]])
    
    while q : 
        i,j = q.popleft()

        for k in range(4):
            ni,nj = i + di[k], j + dj[k]
            
            if 0 <= ni < n and 0 <= nj < m :
                if maps[ni][nj] == 1 :
                    q.append([ni,nj])
                    maps[ni][nj] = maps[i][j] + 1
    
    answer = maps[n-1][m-1]
    if answer == 1 : 
        return -1
    else: 
        return answer

    
    
    
    