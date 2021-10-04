def visitPostOrderTwoStacks(root):
    if not root:
        return
    processing_stack = []
    result_stack = []
    processing_stack.append(root)

    while len(processing_stack) > 0:
        curr_node = processing_stack.pop()
        result_stack.append(curr_node)
        if curr_node.left:
            processing_stack.append(curr_node.left)
        if curr_node.right:
            processing_stack.append(curr_node.right)
    
    while len(result_stack) > 0:
        print(result_stack.pop())

def visitPostOrderOneStack(root):
    if not root:
        return
    stack = []
    current = root

    while len(stack) > 0 or current:
        if current:
            stack.append(current)
            current = current.left
        else:
            temp = stack[-1].right
            if not temp: 
                popped_node = stack.pop()
                print(popped_node)

                while len(stack) > 0 and popped_node == stack[-1].right: # no right to explore
                    popped_node = stack.pop()
                    print(popped_node)
            else:
                current = temp