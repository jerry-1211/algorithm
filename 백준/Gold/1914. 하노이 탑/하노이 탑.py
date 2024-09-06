
N =  int(input())

"""
from_pos,to_pos,aux_pos"들은 단순하게 어디로든 보내주는 문이라 생각하기
"""
if N <= 20 :
    lst = []
    def hanoi(n,from_pos,to_pos,aux_pos):
        if n == 1 :
            print(from_pos,to_pos)
            return 
        
        hanoi(n-1,from_pos,aux_pos,to_pos) # 보조축으로 다 보내준다는 마인드 
        print(from_pos,to_pos) # 이제 편하게 목적지까지 보내줌 
        hanoi(n-1,aux_pos,to_pos,from_pos) # 보조축을 시작으로 다시 끝으로 보내주기

    print(2**N-1)
    hanoi(N,1,3,2)

else:
    print(2**N-1)