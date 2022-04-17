def rangeCount(arr):
    episode_ranges = arr.split(', ')
    count = 0

    for episode_range in episode_ranges:
        episodes = episode_range.split('-')
        if len(episodes) > 1:
            start, end = episodes
            count += int(end) - int(start) + 1
        else:
            count += 1
    return count

print(rangeCount('54-60, 98-99, 102, 131-143, 196-206, 220-226, 279-283, 291-292, 303, 317-319, 326-336, 382-384, 406-407, 426-429, 457-458, 492, 542, 575-578, 590, 626-628, 747-750, 780-782, 895-896, 907'))
