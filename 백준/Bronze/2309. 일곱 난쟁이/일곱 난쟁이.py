lst = []
for _ in range(9) :
    lst.append(int(input()))

lst.sort()
rs1,rs2 = 0,0
rm = sum(lst) - 100 

for i in range(8) : 
    for j in range(i+1,9):
        if rm == lst[i] + lst[j] :
            rs1,rs2 = i,j

for i in range(9) : 
    if i == rs1 or i == rs2 :
        continue
    print(lst[i])