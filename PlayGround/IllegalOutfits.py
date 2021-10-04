def findLegalOutfitnum(arr, illegal):
    illegalOutfits = []
    for outfit in illegal:
        illegalOutfits.append(set(outfit))

    def backtrack(arr, first = 0, curr = []):
        # if illegal
        for outfit in illegalOutfits:
            if outfit.issubset(curr):
                return
        # if the combination is done
        if len(curr) == k:  
            output.append(curr[:])
            return
        for i in range(first, n):
            # add nums[i] into the current combination
            curr.append(arr[i])
            # use next integers to complete the combination
            backtrack(arr, i + 1, curr)
            # backtrack
            curr.pop()

    output = []
    n = len(arr)
    for k in range(n + 1):
        backtrack(arr)
    # return len(output)-1
    return output

print(findLegalOutfitnum(arr=['a', 'b', 'c', 'd'], illegal=[['a','b'], ['b','c']]))