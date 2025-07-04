N = int(input())
arr = list(map(int,input().split(" ")))

def dict_fruit_count(dict):
    count = 0
    for key in dict:
        if dict[key] > 0:
            count += 1
    return count

def dict_total_count(dict):
    count = 0
    for key in dict:
        count += dict[key]
    return count


dict = {}
for i in range(1,10):
    dict[i] = 0

start = 0
end = 1

dict[arr[0]] += 1
mx = 0

while(True):

    mx = max(mx,dict_total_count(dict))

    if end > len(arr)-1 :
        break

    if(dict_fruit_count(dict) <= 2):
        dict[arr[end]] += 1
        end += 1

    if (dict_fruit_count(dict) > 2):
        dict[arr[start]] -= 1
        start += 1


print(mx)




