T = int(input())

for _ in range(T):
    N = int(input())
    arr = list(map(int,input().split()))

    dict = {}
    for s in set(arr):
        if arr.count(s) == 6:
            dict[s] = []

    new_arr = []
    for i in range(len(arr)):
        if arr[i] in dict.keys():
            new_arr.append(arr[i])

    for i in range(len(new_arr)):
        dict[new_arr[i]].append(i+1)

    winner = []

    for item in dict.items() :
        winner.append([item[0],sum(item[1][:4]), item[1][4]])

    winner.sort(key = lambda x :  (x[1],x[2]))

    print(winner[0][0])
