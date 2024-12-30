def insertonSort(arr):
    for i in range(1, len(arr)):
        key=arr[i]
        j=i-1
        while j>=0 and arr[j]>key:
            arr[j+1]=arr[j]
            j -= 1
        arr[j+1]=key    
    return arr
data=[1,2,3,456,7,8,8,65,4]
print(insertonSort(data))