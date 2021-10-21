def getNextPermutation(arr):
    n = len(arr)
    i = n - 2

    while (i >= 0 and arr[i] >= arr[i + 1]):
        i -= 1

    if i >= 0:

        j = n - 1

        while (j >= 0 and arr[j] <= arr[i]):
            j -= 1

        arr[i], arr[j] = arr[j], arr[i]

    left = i + 1
    right = n - 1

    while left < right:
        arr[left], arr[right] = arr[left], arr[right]
        left += 1
        right -= 1

    return arr
