def findStationStart(cost, gas):
    if len(cost) != len(gas) or len(cost) == 0:
        return -1
    rem = [a-b for (a, b) in zip(gas, cost)]
    n = len(rem)
    candidate = 0
    remaining = 0
    prev_remaining = 0
    for i in n:
        remaining += rem[i]
        if remaining < 0:
            candidate = i + 1
            prev_remaining += remaining
            remaining = 0
    if candidate == n or remaining + prev_remaining < 0:
        return -1
    return candidate
