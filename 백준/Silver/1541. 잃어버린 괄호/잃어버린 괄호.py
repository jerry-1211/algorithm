import sys
input = sys.stdin.readline

S = input().split('-')

lst = []
for i in range(len(S)):
    lst.append(sum(list(map(int,S[i].split("+")))))

rs = lst[0]

for ls in lst[1:]:
    rs -= ls
print(rs)