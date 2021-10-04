def getMax(upRight):
    if not upRight:
        return 0
    minRow = float("inf")
    minCol = float("inf")

    for string in upRight:
        currentRow, currentCol = string.split(" ")
        minRow = min(minRow, int(currentRow))
        minCol = min(minCol, int(currentCol))
    return minRow * minCol

print(getMax(["2 4", "3 3", "4 2"]))