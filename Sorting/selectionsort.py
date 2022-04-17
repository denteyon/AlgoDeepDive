def selection_sort(arr):
    n = len(arr)

    for i in range(n):
        smallest_val_index = i

        for j in range(i + 1, n):
            if arr[smallest_val_index] > arr[j]:
                smallest_val_index = j
        arr[i], arr[smallest_val_index] = arr[smallest_val_index], arr[i]

random_list_of_nums = [12, 8, 3, 20, 11]
selection_sort(random_list_of_nums)
print(random_list_of_nums)