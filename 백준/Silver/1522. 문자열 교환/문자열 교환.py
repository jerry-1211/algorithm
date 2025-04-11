import sys

str = input()

a_count = str.count('a')
str_count = len(str)

str += str 

mn = float('inf')
for i in range(str_count):
    tmp_str = str[i:i+a_count]
    if mn  > tmp_str.count('b'):
        mn = tmp_str.count('b')

print(mn)
    
    