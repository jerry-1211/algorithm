N = int(input())
arr = []

for _ in range(N):
    arr.append(input())


dict = {}

for ar in arr:
    L = len(ar)
    for l in range(L):
        if dict.get(ar[l]):
            dict[ar[l]] += 10**(L-l)
        else:
            dict[ar[l]] = 10 ** (L-l)

lst = sorted(dict.items(), key=lambda x:x[1],reverse=True)

V = 9
new_dict = {}
for i in range(len(lst)):
    new_dict[lst[i][0]] = V
    V -= 1


result = 0
for i in range(N):
    s = ""
    for k in arr[i]:
        s += str(new_dict[k])
    result += int(s)

print(result)




