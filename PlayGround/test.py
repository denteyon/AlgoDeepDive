from queue import PriorityQueue

q = PriorityQueue()

arr = [(1,1),(2,3),(3,5)]

for i in arr:
    q.put(i)

# print(list(zip(*q.queue))[1])



# print("test\n"*100000)

import time
import resource

time_start = time.perf_counter()
print("tests\n"*1000)
time_elapsed = (time.perf_counter() - time_start)
memory_usage = resource.getrusage(resource.RUSAGE_SELF).ru_maxrss
print(time_elapsed, memory_usage)