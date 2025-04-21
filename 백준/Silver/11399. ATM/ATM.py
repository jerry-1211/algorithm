import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline


N = int(input())
lst = list(map(int,input().split()))
lst.sort()
w_lst = []

rs = 0
for i in range(N):
    rs += lst[i]
    w_lst.append(rs)

print(sum(w_lst))