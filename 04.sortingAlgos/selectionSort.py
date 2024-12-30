
def sortingAlgo(arr):
    n=len(arr)
    min_index=0
    for i in range(n-1):
        for j in range(i+1, n):
            if arr[j]<arr[min_index]:
                min_index=j
        arr[i],arr[min_index]=arr[min_index],arr[i]
    return arr    
arr = [64, 25, 12, 22, 11]
dfdfdf=sortingAlgo(arr)
print(dfdfdf)

