import sys

input = sys.stdin.readline

size = int(input())
min_heap = [0] * (size + 1)  # index 1부터 사용
heap_size = 0  # 현재 힙에 들어간 원소 개수

def insert(num):
    global heap_size
    heap_size += 1
    min_heap[heap_size] = num
    index = heap_size

    # 부모와 비교하면서 위로 올라가는 과정 (sift-up)
    while index > 1 and min_heap[index] < min_heap[index // 2]:
        min_heap[index], min_heap[index // 2] = min_heap[index // 2], min_heap[index]
        index = index // 2

def remove():
    global heap_size
    if heap_size == 0:
        print(0)
        return
    
    # 루트 출력
    print(min_heap[1])
    
    # 마지막 원소를 루트로 이동
    min_heap[1] = min_heap[heap_size]
    heap_size -= 1
    index = 1

    # 자식과 비교하며 아래로 내려가는 과정 (sift-down)
    while True:
        left = 2 * index
        right = 2 * index + 1
        smallest = index

        # 왼쪽 자식이 존재하고 더 작으면
        if left <= heap_size and min_heap[left] < min_heap[smallest]:
            smallest = left
        # 오른쪽 자식이 존재하고 더 작으면
        if right <= heap_size and min_heap[right] < min_heap[smallest]:
            smallest = right

        # 자식 중 작은 값이 부모보다 작으면 swap
        if smallest != index:
            min_heap[index], min_heap[smallest] = min_heap[smallest], min_heap[index]
            index = smallest
        else:
            break

# 메인 입력 루프
for _ in range(size):
    num = int(input())
    if num == 0:
        remove()
    else:
        insert(num)
