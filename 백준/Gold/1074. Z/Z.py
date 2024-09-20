
N,r,c = map(int,input().split())

cnt = 0
def dfs(x,y,n):
    global cnt 
    if n == 1:
        if x == r and y == c:
            print(cnt)
        elif x == r and y+1 == c:
            print(cnt+1)            
        elif x+1 == r and y == c:
            print(cnt+2)            
        elif x+1 == r and y+1 == c:
            print(cnt+3)            
        return 
    gap = 2 ** (n-1)
    x_gap,y_gap = x+gap,y+gap
        
    if x<=r<x_gap and y<=c<y_gap:
        dfs(x,y,n-1)
    elif x<=r<x_gap and y_gap<=c:
        cnt += (gap**2)
        dfs(x,y_gap,n-1)
    elif x_gap<=r and y<=c<y_gap:
        cnt += (gap**2)*2
        dfs(x_gap,y,n-1)
    elif x_gap<=r and y_gap<=c:
        cnt += (gap**2)*3
        dfs(x_gap,y_gap,n-1)

dfs(0,0,N)

