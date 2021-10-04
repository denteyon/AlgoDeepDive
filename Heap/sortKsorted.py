from queue import PriorityQueue
 
 
# A utility function to print
# array elements
def print_array(arr: list):
    for elem in arr:
        print(elem, end=' ')
 
# Given an array of size n, where every
# element is k away from its target
# position, sorts the array in O(nLogk) time.
 
 
def sort_k(arr: list, n: int, k: int):
    """
    :param arr: input array
    :param n: length of the array
    :param k: max distance, which every
     element is away from its target position.
    :return: None
    """
    pq = PriorityQueue()

    for i in range(k + 1):
        pq.put((arr[i], i))

    index = 0
    for i in range(k + 1, n):
        arr[index], _ = pq.get()
        pq.put((arr[i], i))
        index += 1

    while pq.qsize() > 0:
        arr[index], _ = pq.get()
        index += 1
 
 
# Driver Code
k = 3
arr = [2, 6, 3, 12, 56, 8]
n = len(arr)
sort_k(arr, n, k)
 
print('Following is sorted array')
print(arr)