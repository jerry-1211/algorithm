

N = int(input())
arr = []

for _ in range(N):
    arr.append(input())


# arr = sorted(arr)     # 먼저 알파벳순 정렬
arr = sorted(arr)   # 그 다음 길이순 정렬

count = 0
# print(arr)
for i in range(len(arr)-1):
    idx = len(arr[i])
    if arr[i+1][:idx] == arr[i]:
        # print(arr[i+1][:idx],arr[i])
        arr[i] = ""

print(N-arr.count(""))
