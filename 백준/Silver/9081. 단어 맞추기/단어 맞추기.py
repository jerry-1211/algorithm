N = int(input())

def next_permutation(S):
    arr_s = list(S)
    i = len(arr_s) -2

    while(arr_s[i] >= arr_s[i+1]):
        i = i-1
        if i == -1 :
            print(S)
            return

    j = len(arr_s)-1
    while(arr_s[i] >= arr_s[j]):
        j -= 1

    arr_s[i], arr_s[j] = arr_s[j], arr_s[i]

    result = arr_s[:i+1] + arr_s[i + 1:][::-1]

    return print("".join(result))



for _ in range(N):
    S = input()
    next_permutation(S)
