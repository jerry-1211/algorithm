import sys
from itertools import combinations
# from collections import deque
# sys.setrecursionlimit(100000) 
input = sys.stdin.readline

N,S = map(int,input().split())
lst = list(map(int,input().split()))
cnt = 0

for i in range(1,N+1):
    for c in combinations(lst,i):
        if S == sum(c):
            cnt += 1

print(cnt)