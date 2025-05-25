from itertools import combinations

N = int(input())

# 감소하는 수를 모두 생성
decreasing_numbers = []

# 1자리부터 10자리까지 (0~9 모든 숫자 사용)
for length in range(1, 11):
    # 0~9 중에서 length개를 선택하는 모든 조합
    for combo in combinations(range(10), length):
        # 선택된 숫자들을 내림차순으로 정렬하여 수 만들기
        num = int(''.join(map(str, sorted(combo, reverse=True))))
        decreasing_numbers.append(num)

# 오름차순으로 정렬
decreasing_numbers.sort()

# N번째 감소하는 수 출력 (N은 0부터 시작)
if N >= len(decreasing_numbers):
    print(-1)
else:
    print(decreasing_numbers[N])