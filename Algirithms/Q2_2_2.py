# INSERTIONSORT
def INSERTIONSORT(A):
    n = len(A)
    for j in range (1, n):
        key = A[j]
        i = j-1
        while i >= 0 and A[i] > key:
            A[i + 1] = A[i]
            i = i-1
        A[i+1] = key

# BUBBLESORT
def BUBBLESORT(A):
    n = len(A)
    for i in range(n-1):
        for j in range (1, n-i):
            if A[j] < A[j-1]:
                A[j], A[j-1] = A[j-1], A[j]

# SELECTIONSORT
def SELECTIONSORT(A):
    n = len(A)
    for j in range (n-1):
        smallest = j
        for i in range (j, n):
            if A[i] < A[smallest]:
                smallest = i
        A[j], A[smallest] = A[smallest], A[j]

# QUICKSORT
def PARTITION(A, p, r):
    x = A[r]
    i = p-1
    for j in range (p, r):
        if A[j] <= x:
            i = i+1
            A[i], A[j] = A[j], A[i]
    A[i+1], A[r] = A[r], A[i+1]
    return i+1

def QUICKSORT(A, p, r):
    if p<r:
        q = PARTITION(A, p, r)
        QUICKSORT(A, p, q-1)
        QUICKSORT(A, q+1, r)

# Find median
def FINDMEDIAN(A):
    n = len(A)
    if n % 2 == 0:
        return (A[n//2-1] + A[n//2])/2
    else:
        n += 1
        return A[n//2-1]

# Find range
def FINDRANGE(A):
    return A[-1] - A[0]


# For debug
#A = [78.0, 20.0, 56.0, 69.0, 90.0, 20.0, 5.0, 45.0, 66.0]

# Initialising empty array
A = []

# Taking user inputs
for i in range(9):
    A.append(float(input("Enter marks: ")))

print("\nINSERTIONSORT Entered marks: ", A)
INSERTIONSORT(A)
print("\nINSERTIONSORT Sorted marks: ", A)

#A = [78.0, 20.0, 56.0, 69.0, 90.0, 20.0, 5.0, 45.0, 66.0]
print("\nBUBBLESORT Entered marks: ", A)
BUBBLESORT(A)
print("\nBUBBLESORT Sorted marks: ", A)

#A = [78.0, 20.0, 56.0, 69.0, 90.0, 20.0, 5.0, 45.0, 66.0]
print("\nSELECTIONSORT Entered marks: ", A)
SELECTIONSORT(A)
print("\nSELECTIONSORT Sorted marks: ", A)

#A = [78.0, 20.0, 56.0, 69.0, 90.0, 20.0, 5.0, 45.0, 66.0]
p = 0
r = len(A)-1
print("\nQUICKSORT Entered marks: ", A)
QUICKSORT(A, p, r)
print("\nQUICKSORT Sorted marks: ", A)

print("\nMedian value is: ", FINDMEDIAN(A))
print("\nArray range is: ", FINDRANGE(A))


