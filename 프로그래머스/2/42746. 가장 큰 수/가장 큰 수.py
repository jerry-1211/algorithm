def solution(numbers):
    # 숫자를 문자열로 변환
    numbers = list(map(str, numbers))

    # 핵심: 문자열 두 개를 붙여서 비교하는 정렬 기준 사용
    numbers.sort(key=lambda x: x * 3, reverse=True)

    # 정렬된 리스트를 이어붙여 반환 (단, 000처럼 되지 않도록)
    return str(int("".join(numbers)))
