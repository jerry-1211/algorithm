import sys
from collections import deque
input = sys.stdin.readline

N = int(input())
graph = [list(map(int,input().split())) for _ in range(N)]
start_team = []
link_team = []
mn = 10e10

def reculsive(n,start):
    global mn 
    if n == N//2 :
        link_team = []
        for i in range(N):
            if i not in start_team:
                link_team.append(i)
        sum = team_sub(start_team,link_team)    
        mn = min(mn,sum)
        return

    for i in range(start,N):
        start_team.append(i)
        reculsive(n+1,i+1)
        start_team.pop()

def team_sub(start_team,link_team):
    sum_start_team = 0 
    sum_link_team = 0 

    for i in start_team:
        for j in start_team :
            if i!=j:
                sum_start_team += graph[i][j]

    for i in link_team:
        for j in link_team :
            if i!=j:
                sum_link_team += graph[i][j]
    
    
    
    return abs(sum_start_team -sum_link_team)

    

reculsive(0,0)
print(mn)

