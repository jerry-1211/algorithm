import sys
from collections import deque

input = sys.stdin.readline

# 방향 로테이션
def wheel_rotate(graph,i,dir):
    graph[i].rotate(dir)
    return 


# 방향 로테이션 스택에 넣어주기
def stack_rotate(graph,n,dir):
    stack = [(n,dir)]
    
    rdir = -dir
    for i in range(n,0,-1):
        if graph[i][6] != graph[i-1][2]:
            stack.append([i-1,rdir])
            rdir = -rdir
            continue
        break

    rdir = -dir
    for i in range(n,3):
        if graph[i][2] != graph[i+1][6]:
            stack.append([i+1,rdir])
            rdir = -rdir
            continue
        break

    for i,dir in stack:
        wheel_rotate(graph,i,dir)

    return 

def main():
    graph = [deque(list(map(int,list(input().strip())))) for _ in range(4)]
    K = int(input())


    for _ in range(K):
        n,dir = map(int,input().split())  
        stack_rotate(graph,n-1,dir)


    rs = 0 
    for k in range(4):
        rs += graph[k][0] * (2**k)
    print(rs)
    
if __name__ == "__main__":
    main()