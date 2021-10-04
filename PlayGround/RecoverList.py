def recover_list(arr):
    arr.sort()
    for num in arr:
        if 2*num in arr:
            arr.remove(2*num)
    # dict_num = {}
    # arr.sort()
    # result = []
    # for num in arr:
    #     if num//2 in dict_num:
    #         result.append(num//2)
            
    return arr
    
print(recover_list([6,2,4,2,8,2,2,4,6,8,4,1,3,16,4,3])) 
#  [1, 2, 2, 2, 3, 3, 4, 8]           