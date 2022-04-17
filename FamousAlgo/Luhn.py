def validateCreditCard(num):
    num = str(num)
    sum = 0
    for i in range(len(num) - 1, -1, -1):
        currentNum = int(num[i])
        if i % 2 == 0:
            sum += currentNum
        else:
            sum += currentNum * 2
            if currentNum >= 5:
                sum -= 9
    return sum % 10 == 0

print(validateCreditCard(4716059552951306))