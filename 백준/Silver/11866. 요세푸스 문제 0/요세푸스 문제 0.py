N,K = map(int,input().split())
lst = [i for i in range(1,N+1)]

idx = K-1
rs = []

while True :

    if lst :
        if idx >= len(lst):
            idx %= len(lst)

    else :
        break

    rs.append(lst[idx])
    lst.remove(lst[idx])
    idx += K-1

    
print('<',end="")
print(*rs,sep=", ",end="")
print('>',end="")