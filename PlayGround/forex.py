import enum
from queue import PriorityQueue

class Transaction(enum.Enum):
    buy = 0
    sell = 1

def processForex(transactions):
    buyHeap = PriorityQueue()
    sellHeap = PriorityQueue()
    for transaction in transactions:
        tranType, price = transaction

        if tranType == Transaction.buy:
            if sellHeap.qsize > 0:
                if sellHeap[0][1] < price:
                    sellHeap.get()
            else:
                buyHeap.put((price, price))
                print(zip(*buyHeap)[1])
        else:
            if buyHeap.qsize > 0:
                if buyHeap[0][1] > price:
                    buyHeap.get()
            else:
                sellHeap.put((-price, price))
                print(zip(*sellHeap)[1])
    
processForex([])