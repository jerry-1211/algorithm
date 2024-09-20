
class Node():
    def __init__(self,item,left,right):
        self.item = item
        self.left = left
        self.right = right

tree = {}
# tree["A"] = Node("A","B","C")

N = int(input())
for _ in range(N):
    item,left,right = map(str,input().split())
    tree[item] = Node(item,left,right)


def preorder(node):
    print(node.item,end="")
    if node.left != ".":
        preorder(tree[node.left])
    if node.right != ".":
        preorder(tree[node.right])

def midorder(node):
    if node.left != ".":
        midorder(tree[node.left])
    print(node.item,end="")    
    if node.right != ".":
        midorder(tree[node.right])

def lastorder(node):
    if node.left != ".":
        lastorder(tree[node.left])
    if node.right != ".":
        lastorder(tree[node.right])
    print(node.item,end="")    

preorder(tree["A"])
print()
midorder(tree["A"])
print()
lastorder(tree["A"])
