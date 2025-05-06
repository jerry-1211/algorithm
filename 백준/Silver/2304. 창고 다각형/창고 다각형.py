n = int(input())
arr = [list(map(int,input().split(" "))) for _ in range(n)]
arr.sort()

mx_idx = mx =0
for i in range(len(arr)):
    if mx < arr[i][1]:
        mx_idx = i
        mx = arr[i][1]


result = 0
left = arr[0]
for i in range(1,mx_idx+1):
    if arr[i][1] >= left[1]:
        result += left[1] * (arr[i][0] - left[0])
        left = arr[i]


right = arr[-1]
for i in range(len(arr)-2, mx_idx-1, -1):
    if (arr[i][1] >= right[1]):
        result += right[1] * (- arr[i][0] + right[0])
        right = arr[i]

print(result+mx)


