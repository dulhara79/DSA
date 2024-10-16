'''
BUBBLESORT(A)
    1. for i = 1 to A.length - 1
    2.    for j = A.length downto i + 1
    3.        if A[j] < A[j - 1]
    4.            exchange A[j] with A[j - 1]
'''

arr = []
#for v in range(5):
#    arr.append(int(input("Enter number: ")))

print("Unsorted array: ", arr)

def bubbleSort(arr):
    n = len(arr)
    for i in range(n - 1):
        for j in range(1, n - i):
            if arr[j] < arr[j - 1]:
                arr[j], arr[j - 1] = arr[j - 1], arr[j]

def BUBBLESORT(arr):
    n = len(arr)
    for i in range(n-1):
        for j in range (n-1, i, -1):
            if arr[j] < arr[j-1]:
                arr[j], arr[j-1] = arr[j-1], arr[j]


bubbleSort(arr)
print("Sorted by using bubbleSort function: \n", arr)

BUBBLESORT(arr)
print("\nSorted by using BUBBLESORT function: \n", arr)

