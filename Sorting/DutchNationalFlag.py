def partitionSort(arr):
    if not arr:
        return arr
    n = len(arr)
    pivot = 1
    start, index, end = 0, 0, n - 1

    while index < end:
        if arr[index] < pivot:
            arr[start], arr[index] = arr[index], arr[start]
            start += 1
            index += 1
        elif arr[index] > pivot:
            arr[end], arr[index] = arr[index], arr[end]
            end -= 1
        else:
            index += 1
    return arr

print(partitionSort([1, -1, 0, 3, 0, 2, 1]))