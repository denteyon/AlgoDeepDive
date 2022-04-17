def bubble_sort(arr):
    n = len(arr)
    # 1 to second to last in reverse
    for i in range(n-1, 1, -1):
        for j in range(i):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

def bubble_sort_modified(arr):
    n = len(arr)
    i = n - 1
    while i > 0:
        last_bubbled_index = 0
        for j in range(i):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                last_bubbled_index = j
        i = last_bubbled_index

random_list_of_nums = [9, 1, 15, 28, 6]
bubble_sort_modified(random_list_of_nums)
print(random_list_of_nums)