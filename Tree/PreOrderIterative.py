def visitPreOrder(root):
    if not root:
        return
    stack = []
    stack.append(root)

    while len(stack) > 0:
        popped_node = stack.pop()
        print(popped_node)
        if popped_node.right:
            stack.append(popped_node.right)
        if popped_node.left:
            stack.append(popped_node.left)