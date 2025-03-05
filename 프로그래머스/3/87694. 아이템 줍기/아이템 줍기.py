from collections import deque
def solution(rectangle, characterX, characterY, itemX, itemY):
    
    # 좌표 생성 (110,110)
    SIZE = 110
    axis =  [[-1] * SIZE for _ in range(SIZE)]
    
    # 좌표 2배씩 확장
    for i in range(len(rectangle)):
        rectangle[i]  = list(map(lambda x : x*2 ,rectangle[i]))
        
    characterX, characterY, itemX, itemY = 2*characterX, 2*characterY, 2*itemX, 2*itemY 
    
    # rectangle 전부 1로 채우기
    for k in range(len(rectangle)):
        x1,y1,x2,y2 = rectangle[k]
        for i in range(x1,x2+1):
            for j in range(y1,y2+1):
                axis[i][j] = 1
        
    # rectangle 테두리 제외하고 내부 0으로 채우기
    for k in range(len(rectangle)):
        x1,y1,x2,y2 = rectangle[k]
        for i in range(x1+1,x2):
            for j in range(y1+1,y2):
                axis[i][j] = 0
    
    dx,dy = [0,-1,0,1], [1,0,-1,0]
    q = deque([[characterX, characterY]])
    
    while q :
        x,y = q.popleft()
        if (x,y) == (itemX, itemY):
            answer = (axis[x][y]-1) // 2
            return answer
        
        for k in range(4):
            nx, ny = x + dx[k], y + dy[k]
            if 1 < nx < SIZE and 1 < ny < SIZE :
                if axis[nx][ny] == 1:
                    axis[nx][ny] = axis[x][y] + 1  
                    q.append([nx,ny])
                    
    return answer