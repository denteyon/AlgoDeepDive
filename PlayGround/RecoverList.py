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
from collections import Counter
def recover_list_linear(arr):
    num_dict = {}
    for num in arr:
        num_dict[num] = num_dict.get(num, 0) + 1
    result = []
    print(num_dict)

    for num in arr:
        if num in num_dict and 2*num in num_dict:
            result.append(num)
            if num_dict[num] > 1:
                num_dict[num] = num_dict[num] - 1
            else:
                del num_dict[num]
            if num_dict[2*num] > 1:
                num_dict[2*num] = num_dict[2*num] - 1
            else:
                del num_dict[2*num]
    return result

    
print(recover_list_linear([6,2,4,2,8,2,2,4,6,8,4,1,3,16,4,3])) 
#  [1., 2., 2., 2., 3, 3, 4., 8.]
#  [2, 4., 4., 4., 6, 6, 8., 16.]      