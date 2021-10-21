def binarysearchable(arr):

    left = float("-inf")
    right = max(arr)
    count = 0

    for num in arr:
        if num >= left and num <= right:
            count += 1
        left = max(left, num)
        right = min(right, num)

    return count

print(binarysearchable([1, 3, 2]))
print(binarysearchable([3, 2, 1, 10, 23, 22, 21]))
print(binarysearchable([1, 5, 7, 11, 12, 18]))