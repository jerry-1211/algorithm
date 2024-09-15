x1,y1=0,0
x,y,x2,y2 = list(map(int,input().split()))

x_min = min(x-x1,x2-x)
y_min = min(y-y1,y2-y)

print(min(x_min,y_min))
