
import sys

sys.setrecursionlimit(100000) 

N,B = map(int,sys.stdin.readline().split())

A = [list(map(int,sys.stdin.readline().split())) for _ in range(N)]

def mul_matrix(mat1,mat2):
    tmp = [[0] * N for _ in range(N)]
    for i in range(N):
        for j in range(N):
            for k in range(N):
                tmp[i][j] += mat1[i][k] * mat2[k][j]
            tmp[i][j] %= 1000
    return tmp

def cal(n,a,b) : 
    if b == 1 :
        return a 
    elif b ==2 :
        return mul_matrix(a,a)
    else:
        temp = cal(n,a,b//2)
        if b % 2 == 0 :
            return mul_matrix(temp,temp)
        else:
            return mul_matrix(mul_matrix(temp,temp),a)
    return

lst = cal(N,A,B)

for i in range(N):
    for j in range(N):
        print(lst[i][j]%1000,end=' ')
    print()
    
