N = int(input())

cnt = 0 

def dfs(i):
    global cnt 
    if i == N :
        cnt += 1
        return 
    
    for j in range(N):
        if f_visited[j]==0 and r_visited[i+j]==0 and l_visited[i-j]==0:
            f_visited[j] = r_visited[i+j] = l_visited[i-j] = 1
            dfs(i+1)
            f_visited[j] = r_visited[i+j] = l_visited[i-j] = 0

f_visited,r_visited,l_visited = [[0] * (N*2) for _ in range(3)]


dfs(0)

print(cnt)




