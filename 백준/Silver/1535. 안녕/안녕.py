N = int(input())

L = list(map(int,input().split()))
J = list(map(int,input().split()))

result = 0
def dfs(n,H,answer):
    global result
    
    result = max(result, answer)
    if n >= N:
        return

    dfs(n+1, H, answer)

    if H-L[n] > 0:
        dfs(n+1, H-L[n], answer+J[n])




dfs(0,100,0)

print(result)

