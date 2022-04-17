def findMinimumEffort(matrix):
    if not matrix or len(matrix) == 0:
        return 0
    n = len(matrix)
    queue = []
    start = (0, 0, 0)
    end = (n-1, n-1)
    queue.append(start)
    visited = set()

    directions = [(0, 1), (1, 0), (0, -1), (-1, 0)]

    while len(queue) > 0:
        x, y, effort = queue.pop()
        for direction in directions:
            dx, dy = direction
            new_x, new_y = x + dx, y + dy
            if new_x >= 0 and new_x < n and new_y >= 0 and new_y < n and (new_x, new_y) not in visited:
                visited.add((new_x, new_y))
                if (matrix[new_x], matrix[new_y]) == end:
                    return True
                queue.append((new_x, new_y))
    return False
