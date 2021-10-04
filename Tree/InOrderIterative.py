def visitInOrder(root):
    if not root:
        return
    stack = []
    while True:
        if root:
            stack.append(root)
            root = root.left
        else:
            if len(stack) == 0:
                break
            popped_node = stack.pop()
            print(popped_node)
            root = popped_node.right

def MorrisTraversal(root):
    if not root:
        return
    current = root

    while current:
        if not current.left:
            print(current)
            current = current.right
        else:
            predecessor = current.left

            while predecessor.right and predecessor.right != current:
                predecessor = predecessor.right

            if not predecessor.right:
                predecessor.right = current
                current = current.left
            else:
                predecessor.right = None
                print(current)
                current = current.right