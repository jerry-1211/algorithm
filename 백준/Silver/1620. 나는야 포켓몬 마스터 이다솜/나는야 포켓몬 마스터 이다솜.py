N,M = map(int,input().split())

dict = {}


for i in range(N):
    string = input()
    dict[string] = i+1
    dict[str(i+1)] = string


for M in range(M):
    print(dict[input()])






