x,y = list(map(list,input().split()))

x[0],x[2] = x[2], x[0]
y[0],y[2] = y[2], y[0]

print(max(int(''.join(x)),int(''.join(y))))