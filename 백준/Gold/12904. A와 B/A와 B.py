S = input()
T = input()

while(True):
    if len(T) == len(S) :
        break

    v = T[-1]
    T = T[:-1]

    if v == "B":
        T = T[::-1]

if(T == S) :
    print(1)
else:
    print(0)