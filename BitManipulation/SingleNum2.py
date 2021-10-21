def singleNumber(nums):
    seenOnce, seenTwice = 0, 0

    for num in nums:
        # first appearence: 
        # add num to seen_once 
        # don't add to seen_twice because of presence in seen_once

        # second appearance: 
        # remove num from seen_once 
        # add num to seen_twice

        # third appearance: 
        # don't add to seen_once because of presence in seen_twice
        # remove num from seen_twice
        seenOnce = ~seenTwice & (seenOnce ^ num)
        seenTwice = ~seenOnce & (seenTwice ^ num)
    

    return seenOnce

print(singleNumber([1, 2, 3, 1, 2, 1, 2]))