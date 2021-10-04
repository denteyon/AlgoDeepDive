def searchRange(nums, target):
    first, last = -1, -1
    
    if not nums or len(nums) == 0:
        return [-1. -1]
    
    n = len(nums)
    
    left, right = 0, n - 1
    
    while left <= right:
        mid = left + (right - left) // 2
        if nums[mid] >= target:
            right = mid - 1
        else:
            left = mid + 1
    
    if right != n - 1 and nums[right + 1] == target:
        first = right + 1
    else:
        return [-1, -1]
    
    left, right = 0, n - 1
    
    while left <= right:
        mid = left + (right - left) // 2
        if nums[mid] > target:
            right = mid - 1
        else:
            left = mid + 1
            
    if left != 0 and nums[left - 1] == target:
        last = left - 1
    else:
        return [-1, -1]
    
    return [first, last]

print(searchRange([], 1))