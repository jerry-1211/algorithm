import sys

tree = {}
count = 0

for name in sys.stdin:
    name = name.rstrip()
    if name == '':
        continue  # 혹시 공백 입력 방지
    tree[name] = tree.get(name, 0) + 1
    count += 1

for k in sorted(tree):
    print(f"{k} {tree[k] / count * 100:.4f}")