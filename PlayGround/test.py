from queue import PriorityQueue

q = PriorityQueue()

arr = [(1,1),(2,3),(3,5)]

for i in arr:
    q.put(i)

print(list(zip(*q.queue))[1])