test_count = 0
while(True):
    prt = list(input())

    if '-' in prt:
        break

    test_count += 1
    count = 0
    safety_prt = []

    for i in range(len(prt)):
        if not(safety_prt) and prt[i] == '}':
            count += 1
            safety_prt = ['{']
            continue

        if prt[i] == '{' :
            safety_prt.append('{')
        elif prt[i] == '}' :
            safety_prt.pop()

    result = len(safety_prt)//2 + count
    print(f"{test_count}. {result}")

