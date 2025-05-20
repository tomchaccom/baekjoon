import sys

input = sys.stdin.readline
size = int(input())
max_heap = [0] *( size +1)
heap_size = 0

def insert(num):
    global heap_size
    heap_size += 1
    max_heap[heap_size] = num
    index = heap_size

    while index > 1 and max_heap[index] > max_heap[index //2 ]:
        max_heap[index], max_heap[index // 2] =  max_heap[index //2], max_heap[index ]
        index = index // 2

def remove():
    global heap_size
    if heap_size == 0:
        print(0)
        return
    
    print(max_heap[1])

    max_heap[1] = max_heap[heap_size]
    heap_size -= 1
    index = 1

    while True:
        left = index * 2
        right = index * 2 + 1
        maximum = index

        if left <= heap_size and max_heap[left] > max_heap[maximum]:
            maximum = left
        if right <= heap_size and max_heap[right] > max_heap[maximum]:
            maximum = right

        if maximum != index:
            max_heap[index], max_heap[maximum] = max_heap[maximum], max_heap[index]
            index = maximum
        else:
            break

for _ in range(size):
    num = int(input())

    if num == 0:
        remove()
    else:
        insert(num)