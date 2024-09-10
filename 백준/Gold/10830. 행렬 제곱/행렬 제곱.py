import sys

N, B = map(int, sys.stdin.readline().split())  # N*N행렬 입력 , B만큼 제곱
A = [list(map(int, sys.stdin.readline().split())) for _ in range(N)]  # 행렬 받기


# NxN 행렬 곱셈 함수
def multiplication(n, a, b):
    result = [[0] * n for _ in range(n)]
    for row in range(n):
        for column in range(n):
            for i in range(n):
                result[row][column] += a[row][i] * b[i][column]
            result[row][column] %= 1000
    return result


def cal(n, b, a):
    # 1 제곱
    if b == 1:
        return a
    # 2 제곱
    elif b == 2:
        return multiplication(n, a, a)
    else:
        temp = cal(n, b // 2, a)
        # b가 짝수일 경우
        if b % 2 == 0:
            return multiplication(n, temp, temp)
        # b가 홀수일 경우
        else:
            return multiplication(n, multiplication(n, temp, temp), a)


result = cal(N, B, A)

for c in result:
    for num in c:
        print(num % 1000, end=' ')
    print()