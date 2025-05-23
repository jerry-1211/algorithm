N = int(input())

def recursion(n):
    if n == 1 :
        return ["*"]

    starts = recursion(n//3)
    result = []

    for s in starts:
        result.append(s + s + s)


    for s in starts:
        result.append(s + " " * (n//3) + s)

    for s in starts:
        result.append(s + s + s)

    return result


result = recursion(N)
for r in result :
    print(r)


