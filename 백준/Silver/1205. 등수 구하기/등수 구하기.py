N, score, P = map(int,input().split())

if N == 0:
    print(1)
else:
    arr = list(map(int,input().split()))

    if N == P and arr[N-1] >= score:
        print(-1)
    else:
        rank = 1
        for i in range(len(arr)):
            if arr[i] > score:
                rank += 1
            else:
                break

        print(rank)


