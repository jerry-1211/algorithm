N = int(input())

arr =[[] for _ in range(101)]

arr[2].append("*****")
arr[2].append("*    ")
arr[2].append("* ***")
arr[2].append("* * *")
arr[2].append("* * *")
arr[2].append("*   *")
arr[2].append("*****")

arr[1].append("*")

for i in range(3,N+1):
    arr[i].append("*" * (len(arr[i-1]) + 2))
    arr[i].append("*" + " " * (len(arr[i-1]) + 1))

    for k in range(len(arr[i-1])):

        if(k == 0) :
            arr[i].append("* " + arr[i-1][k] + "**")
            continue

        arr[i].append("* " + arr[i - 1][k] +  " *" )

    arr[i].append("*" + " " * (len(arr[i - 1])) + "*")
    arr[i].append("*" * (len(arr[i - 1]) + 2))



for ar in arr[N]:
    print(ar.strip())

