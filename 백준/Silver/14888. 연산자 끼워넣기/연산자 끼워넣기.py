import sys

sys.setrecursionlimit(100000) 
input = sys.stdin.readline

N = int(input())
lst = list(map(int,input().split()))

add,sub,mul,div = map(int,input().split())

mx = -sys.maxsize
mn = sys.maxsize

def dfs(n,rs,add,sub,mul,div):
    global mn
    global mx

    if n == N:
        mn = min(rs,mn)
        mx = max(rs,mx)
        return 
    
    if add > 0 : dfs(n+1,rs+lst[n],add-1,sub,mul,div)
    if sub > 0 : dfs(n+1,rs-lst[n],add,sub-1,mul,div)
    if mul > 0 : dfs(n+1,rs*lst[n],add,sub,mul-1,div)
    if div > 0 : dfs(n+1,int(rs/lst[n]),add,sub,mul,div-1)

dfs(1,lst[0],add,sub,mul,div)

print(mx)
print(mn)


