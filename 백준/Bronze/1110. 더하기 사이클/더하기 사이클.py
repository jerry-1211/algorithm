num = int(input())
rs = num 
cnt = 0 

while True :

    cnt += 1 

    # 입력받은 num 값이 두자리
    if num >=10 :
        hap = int(str(num)[0]) + int(str(num)[1])

        # 합이 2자리인 경우 
        if hap >=10:
            num = int(str(num)[1] + str(hap)[1])
        # 합이 1자리인 경우 
        else:
            num = int(str(num)[1] + str(hap))
            
    
    # 입력받은 num 값이 한자리
    else :  
        num = int(str(num) + str(num))


    if num == rs :
        break 
print(cnt)