arr = [] # Define array

# Taking user inputs
print("Enter your Array Here: ")
for v in range(7):
    arr.append(input("Enter number : "))

# Print user entered values
print("Your array is : ", arr, end = " ")

# Defining partition method
def partition(arr, low, high):
    i = low - 1
    pivot = arr[high]
    for j in range(low, high):
        if arr[j] <= pivot:
            i = i + 1
            arr[i], arr[j] = arr[j], arr[i]
    arr[i + 1], arr[high] = arr[high], arr[i + 1]
    return i+1

# Defining QuickSort method
def quickSort(arr, low, high):
    if low < high:
        i = partition(arr, low, high)
        quickSort(arr, low, i-1)
        quickSort(arr, i + 1, high)

# Call quickSort method
quickSort(arr, 0, len(arr)-1)

# Print Sorted array
print("\nYour sorted array is : ", arr, end = " ")

# output:
'''
Enter your Array Here: 
Enter number : 1
Enter number : 3
Enter number : 5
Enter number : 7
Enter number : 2
Enter number : 4
Enter number : 6
Your array is :  ['1', '3', '5', '7', '2', '4', '6'] 
Your sorted array is :  ['1', '2', '3', '4', '5', '6', '7']
'''
