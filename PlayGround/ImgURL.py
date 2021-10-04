import re

def sizeOKbro(imageURLs, maxSize):
    size = 1000000
    if maxSize != None:
        temp = re.compile("([0-9]+)([a-zA-Z]+)")
        res = temp.match(maxSize).groups()
        num = res[0]
        unit = res[1].upper()
        if unit == 'KB':
            size = int(num) * 1000
        elif unit == 'MB':
            size = int(num) * 1000000
        elif unit == 'GB':
            size == int(num) * 1000000000
    result = []
    for url in imageURLs:
        if int(url[1]) > size:
            result.append([url[0], 'FALSE'])
        else:
            result.append([url[0], 'TRUE'])
    return result

print(sizeOKbro([['a', 32000000], ['b', 19000000]], '20MB'))
