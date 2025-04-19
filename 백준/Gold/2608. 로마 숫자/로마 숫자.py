str1 = input()
str2 = input()

special_number = ["IV","IX","XL","XC","CD","CM"]
number = {
    "I" : [0,1],
    "V" : [0,5],
    "X" : [0,10],
    "L" : [0,50],
    "C" : [0,100],
    "D" : [0,500],
    "M" : [0,1000],
    "IV" : [0,4],
    "IX" : [0,9],
    "XL" : [0,40],
    "XC" : [0,90],
    "CD" : [0,400],
    "CM" : [0,900]
}

roma = [[1,"I"],[4,"IV"],[5,"V"],[9,"IX"],[10,"X"],[40,"XL"],[50,"L"],[90,"XC"],[100,"C"],[400,"CD"],[500,"D"],[900,"CM"],[1000,"M"]]

for str in [str1, str2] :
    for s_n in special_number:
        if s_n in str:
            number[s_n][0] += 1
            str = str.replace(s_n,"")

    for s in str:
        number[s][0] += 1

    result = 0
    for k,v in number.items():
        result += v[0] * v[1]

print(result)

lst = []
for i in range(len(roma)-1,-1,-1):
    count = result // roma[i][0]
    result = result % roma[i][0]

    # print(result, count,roma[i][1])

    for k in range(count):
        # print(roma[i][1])
        lst.append(roma[i][1])

print("".join(lst))
