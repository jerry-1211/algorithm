def is_palindrome(S,l,r):
    while (l < r):
        if S[l] == S[r]:
            l += 1
            r -= 1
            continue
        else:
            return False
    return True

N = int(input())

for _ in range(N):
    S = input()
    start, end = -1, len(S)
    count = 0

    while(True):
        if start >= end or count >1 :
            break

        start += 1
        end -= 1

        if S[start] == S[end]:
            continue

        count += 1

        if S[start+1] != S[end] and S[start] != S[end-1]:
            count = 2
            break

        if S[start] == S[end-1] and is_palindrome(S,start,end-1):
            break
        elif S[start+1] == S[end] and is_palindrome(S,start+1,end):
            break
        else:
            count = 2
            break

    print(count)