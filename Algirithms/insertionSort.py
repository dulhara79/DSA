'''
INSERTIONSORT(A)
1.    for j <- 2 to n
2.        do key <- A[j]
3.        insert A[j] into the sorted sequence A[1...j-1]
4.        i <- j-1
5.      while i > 0 and A[i] > key
6.            do A[i + 1] <- A[i]
7.                i <- i-1
8.        A[i + 1] <- key
'''

arr=[]
for v in range(9):
    number = int(input("Enter number: "))
    if( number > 10 and number < 20):
        arr.append(number)
    else:
        print("Invalid Input")

print("Unsorted array: ", arr)

def insertionSort(arr):
    n = len(arr)
    for i in range(1, n): #traverse length of the array
        key = arr[i]
        j = i - 1
        while j >= 0 and key < arr[j]:
            arr[j+1] = arr[j]
            j = j - 1
        arr[j + 1] = key

insertionSort(arr)

print("Sorted array: ", arr)
    
