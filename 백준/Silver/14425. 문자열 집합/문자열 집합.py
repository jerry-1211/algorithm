
N, M = map(int,input().split())

N_arr = []
M_arr = []

for _ in range(N):
    N_arr.append(input())

for _ in range(M):
    M_arr.append(input())

count = 0
for m in M_arr:
    if m in N_arr:
        count += 1


print(count)
