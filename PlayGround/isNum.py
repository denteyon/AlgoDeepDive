result = []
for i in range(100):
    ans = i*i + 17*i + 16
    print(i, ans)
    if ans % 100 == 0:
        result.append(i)
print(result)

# x + 16/ x + 1