def find_first_and_last(lst, target):
    if len(lst) == 0 or lst[0] > target or lst[-1] < target:
        return -1, -1
    first = find_first(lst, target)
    last = find_last(lst, target)
    return first, last

def find_first(lst, target):
    if lst[0] == target:
        return 0
    left, right = 0, len(lst) - 1
    while left <= right:
        mid = left + (right - left) // 2
        if lst[mid] == target and lst[mid - 1] < target:
            return mid
        elif lst[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return -1

def find_last(lst, target):
    if lst[-1] == target:
        return len(lst) - 1
    left, right = 0, len(lst) - 1
    while left <= right:
        mid = left + (right - left) // 2
        if lst[mid] == target and lst[mid + 1] > target:
            return mid
        elif lst[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return -1