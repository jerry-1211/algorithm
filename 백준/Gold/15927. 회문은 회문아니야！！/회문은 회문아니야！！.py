def is_palindrom(arr):
    if arr == arr[::-1]:
        return True
    return False


S = input()

if len(set(S)) == 1:
    print(-1)
else:
    if is_palindrom(S):
        print(len(S)-1)
    else:
        print(len(S))