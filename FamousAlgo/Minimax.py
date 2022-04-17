import math

def minimax(root, depth, alpha=-math.inf, beta=math.inf, isMaximizingPlayer=True):
    if root.getChildren(): #depth == 0 or root.isLeaf()
        return root.value

    if isMaximizingPlayer:
        bestValue = -math.inf
        for child in root.getChildren():
            bestValue = max(bestValue, minimax(child, depth - 1, alpha, beta, False))
            alpha = max(alpha, bestValue)
            if beta <= alpha:
                break
        return bestValue
    else:
        bestValue = math.inf
        for child in root.getChildren():
            bestValue = min(bestValue, minimax(child, depth - 1, alpha, beta, True))
            beta = min(beta, bestValue)
            if beta <= alpha:
                break
        return bestValue
