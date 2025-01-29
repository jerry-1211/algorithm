N,K = map(int,input().split())
lst = list(map(int,input().split()))

cnt = 0
multitab = set()

for i in range(K):
  # 멀티탭이 꽂혀 있는 경우
  if lst[i] in multitab:
    continue

  # 멀티탬 공간이 남는 경우 
  if len(multitab) < N:
    multitab.add(lst[i])
    continue

  # 가장 나중에 사용될 기기 찾아 제거
  last_used = {}
  for device in multitab:
    if device in lst[i+1:]:
      last_used[device] = lst[i+1:].index(device)
    else: 
      last_used[device] = float('inf')
  
  remove_device = max(last_used,key=last_used.get)
  multitab.remove(remove_device)
  multitab.add(lst[i])
  cnt += 1
  
print(cnt)

