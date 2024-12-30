def BubbleSort(arr):
    n=len(arr)
    print(n)
    for i in range(n-1):
       for j in range(n-1):
            if arr[j]>arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

    return arr               

arr=[1,23,4,56,78,234,56,7,8,98]    
print(BubbleSort(arr))