def dfs(i,arr,flag):
    for k in arr[i]:
        if flag[k] == 0:
            flag[k] = 1
            dfs(k,arr,flag)
    
def solution(n, computers):
    arr = [[] for _ in range(n)]
    flag = [0] * (n)
    answers = 0 

    for i in range(n):
        for j in range(n):
            if i != j and computers[i][j] == 1 :
                arr[i].append(j)

    
    for i in range(n):
        if flag[i] == 0 :
            flag[i] = 1 
            dfs(i,arr,flag)
            answers += 1
            
    
    
    return answers      