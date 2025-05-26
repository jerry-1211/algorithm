N, score, P = map(int,input().split())

if N == 0:
    print(1)
else:
    arr = list(map(int,input().split()))

    if N == P and arr[N-1] >= score:
        print(-1)
    else:
        rank = N + 1  # 기본값: 모든 점수보다 낮다고 가정
        for i in range(len(arr)):
            if arr[i] <= score:
                rank = i + 1
                break
        print(rank)