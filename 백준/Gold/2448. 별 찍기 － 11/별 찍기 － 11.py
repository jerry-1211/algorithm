N = int(input())

arr = ["  *  "," * * ","*****"]

def recursion(n):
    if n == 3 :
        return arr

    starts = recursion(n//2)
    result = []

    for s in starts:
        result.append(" " * (n//2) + s + " " * (n//2))

    for i in range(len(starts)):
        result.append(starts[i] + " "  +  starts[i] )

    return result

result = recursion(N)

for r in result:
    print(r)





