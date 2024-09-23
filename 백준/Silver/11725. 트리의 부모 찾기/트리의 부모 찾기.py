import sys
sys.setrecursionlimit(10**6)

N = int(sys.stdin.readline())
node = [[] for _ in range(N + 1)]
parents = [0] * (N + 1)
parents[1] = 1

for i in range(1, N + 1):
    node[i] = []

for _ in range(N - 1):
    a, b = map(int, sys.stdin.readline().split())
    node[a].append(b)
    node[b].append(a)

def dfs(n):
    for i in node[n]:
        if parents[i] == 0:
            parents[i] = n
            dfs(i)

dfs(1)

for i in range(2, N + 1):
    print(parents[i])
