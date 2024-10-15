def INSERTIONSORT(A):
    n = len(A)
    for j in range(1, n):
        key = A[j]
        i = j - 1
        while i >= 0 and A[i] > key:
            A[i + 1], A[i] = A[i], A[i + 1]
            i = i - 1
        A[i + 1 ] = key

def FINDRANGE(arr):
    rangeV = arr[-1] - arr[0]
    return { "range": rangeV }

def FINDMEDIAN(arr):
    n = len(arr)
    possition = n // 2
    possition = possition - 1
    if(n % 2 == 0):
        median = arr[possition] + arr[possition + 1] / 2
    else:
        median = arr[possition]
    return median

def FINDQUARTILES(arr):
    n = len(arr)
    mid = n // 2
    if n % 2 == 0:
        lower_half = arr[:mid]
        upper_half = arr[mid:]
    else:
        lower_half = arr[:mid]
        upper_half = arr[mid + 1:]
    
    Q1 = FINDMEDIAN(lower_half)
    Q2 = FINDMEDIAN(arr)
    Q3 = FINDMEDIAN(upper_half)
    return {"Q1": Q1, "Q2": Q2, "Q3":Q3}

def FINDAVERAGEANDSUM(arr):
    total_sum = sum(arr)
    average = total_sum / len(arr)
    return { "average": average, "sum": total_sum }   

arr = []
for i in range(5):
    arr.append(int(input("Enter value: ")))

print("Unsorted: ", arr)
INSERTIONSORT(arr)
r = FINDRANGE(arr)
m = FINDMEDIAN(arr)
q = FINDQUARTILES(arr)
a = FINDAVERAGEANDSUM(arr)

print("Sorted: ", arr)
print(r, m, q, a)
