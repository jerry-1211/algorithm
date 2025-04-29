
N = int(input())
arr = [input() for _ in range(N)]

L = len(arr[0])
result = 0

for i in range(N-1):
    for j in range(i+1, N):
        mapping = {}
        success = True
        for k in range(L):
            a, b = arr[i][k], arr[j][k]
            if a in mapping:
                if mapping[a] != b:
                    success = False
                    break
            else:
                mapping[a] = b
        if success:
            # 역방향도 따로 검사해야 함
            reverse_mapping = {}
            for k in range(L):
                a, b = arr[j][k], arr[i][k]
                if a in reverse_mapping:
                    if reverse_mapping[a] != b:
                        success = False
                        break
                else:
                    reverse_mapping[a] = b
        if success:
            result += 1

print(result)