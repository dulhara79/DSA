def recursive(num):
    if num == 1:
        return num
    else:
        return num + recursive(num - 1)

num = int(input("Enter number: "))

while num != -1:
    print("Output: ", recursive(num))
    num = int(input("Enter number: "))

if num == -1:
    print("Output: Finished")
