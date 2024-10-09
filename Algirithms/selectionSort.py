arr = []
for v in range(5):
    arr.append(int(input("Enter number: ")))

print("Unsorted array: ", arr)

def selection_sort(arr):
    n = len(arr)
    for j in range(0, n-1):
        smallest = j
        for i in range (j + 1, n):
            if arr[i] < arr[smallest]:
                smallest = i
            arr[j],arr[smallest] = arr[smallest], arr[j]

selection_sort(arr)
print("Sorted array: ", arr)
