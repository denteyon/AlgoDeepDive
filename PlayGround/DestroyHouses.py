def destroy(houses, queries):
    houses.sort()
    house_list = []
    start_house = houses[0]
    for i in range(len(houses)-1):
        if houses[i] + 1 != houses[i+1]:
            house_list.append([start_house, houses[i]])
            start_house = houses[i+1]
    house_list.append([start_house, houses[-1]])

    result = []

    print(house_list)

    for query in queries:
        for i in range(len(house_list)):
            if query <= house_list[i][1]:
                if house_list[i][0] == house_list[i][1]:
                    del house_list[i]
                else:
                    if query == house_list[i][0]:
                        house_list[i] = [query + 1, house_list[i][1]]
                    elif query == house_list[i][1]:
                        house_list[i] = [house_list[i][0], query - 1]
                    else:
                        house_list.insert(i+1, [query + 1, house_list[i][1]])
                        house_list[i] = [house_list[i][0], query - 1]
                print(house_list)
                result.append(len(house_list))
                break
    return result
    
print(destroy([1, 2, 3], [2, 1, 3]))