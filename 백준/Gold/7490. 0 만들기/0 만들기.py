import sys

K = int(input())
def reculsive(n,expression):
    if n == N+1 :         
        if not(eval(expression.replace(" ",""))):
            print(expression)
        return 
    
    reculsive(n+1,expression + " " + str(n))
    reculsive(n+1,expression + "+" + str(n))
    reculsive(n+1,expression + "-" + str(n))
    
    
for _ in range(K):
    N = int(input())
    reculsive(2,"1")
    print()