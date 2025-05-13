N = int(input())
arr = [0] + [int(input()) for _ in range(N)]

def dfs(i):
    global value
    if arr[i] == value:
        return True

    if not(visit[i]) :
        visit[i] = 1
        return dfs(arr[i])

result = []
for i in range(1,N+1):
    visit = [0] * (N + 1)
    value = i
    if dfs(i):
        result.append(i)

print(len(result))
for r in result :
    print(r)



