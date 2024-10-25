import sys
input = sys.stdin.readline

T = int(input())

for _ in range(T):    
    lst = list(map(str,input().strip()))
    K = int(input())

    
        
    dict = {}

    for s in set(lst):
        dict[s] = []
    
    for i in range(len(lst)):
        dict[lst[i]].append(i)
    
    mx,mn = -1, len(lst)+1 

    for d in dict.values():
        if len(d) >= K :             

            for i in range(len(d)-K+1):
                mn = min(mn,d[i+K-1 ] - d[i] + 1)
                mx = max(mx,d[i+K-1 ] - d[i] + 1)
    

    if mn == -1 or mx == -1 : 
        print(-1)
    else : print(mn,mx)
    
    
    