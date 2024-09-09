
N = int(input())
graph = [list(map(int,input().split())) for _ in range(N)]
rs =[]

def solution(x,y,N): 
    f_color = graph[x][y]
    for i in range(x,x+N):
        for j in range(y,y+N):
            if graph[i][j] != f_color:
                solution(x,y,N//2)
                solution(x,y+N//2,N//2)
                solution(x+N//2,y,N//2)
                solution(x+N//2,y+N//2,N//2)
                return 
    rs.append(f_color)

solution(0,0,N)
print(rs.count(0))
print(rs.count(1))
