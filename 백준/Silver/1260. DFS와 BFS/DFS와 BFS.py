from collections import deque
import sys

sys.setrecursionlimit(10**6)
input = sys.stdin.readline

N, M, V = map(int, input().split())

lst = [[] for _ in range(N + 1)]
visited = [0] * (N + 1)
for i in range(M):
    a, b = map(int, input().split())
    lst[a].append(b)
    lst[b].append(a)

for n in range(N + 1):
    lst[n].sort()

# dfs
rs_dfs = []


def dfs(v):
    for k in lst[v]:
        if not (visited[k]):
            visited[k] = 1
            rs_dfs.append(k)
            dfs(k)


rs_dfs.append(V)
visited[V] = 1
dfs(V)
print(*rs_dfs)

# bfs
rs_bfs = []
rs_bfs.append(V)


def bfs(k):
    visited = [0] * (N + 1)
    visited[k] = 1
    q = deque([k])
    while q:
        v = q.popleft()
        for k in lst[v]:
            if not (visited[k]):
                visited[k] = 1
                q.append(k)
                rs_bfs.append(k)


bfs(V)
print(*rs_bfs)