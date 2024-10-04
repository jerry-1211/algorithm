T = int(input())

for _ in range(T):
    N = int(input())
    lst = [list(map(int,input().split())) for _ in range(N)]
    lst.sort()

    mn = lst[0][1]
    cnt = 1 
    for i in range(len(lst)-1) :
        if mn > lst[i+1][1] :
            mn = lst[i+1][1]
            cnt += 1

    print(cnt)

    