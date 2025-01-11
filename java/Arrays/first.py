def firstFun():

    arr=[1,2,3,4,5,6,7,8,9,10,11,12]
    print(arr[0])
    print(arr)
    arr.append(234)
    print(arr)
    arr.pop()
    print(arr)

from array import array
def secondFun():
    # here i defines the type 
    arr=array('i',[1,2,3,4,55,6])
    print(arr[0])
    arr.append(76)
    arr.pop()
    arr.pop()
    arr.pop()
    print(arr)

def numpyFun():
    import numpy as np 
    arr=np.array([1,2,3,4,5,6])
    print(arr)
    arr=arr*2
    print(arr)
    matrix=np.array([[1,2,3],[4,5,6]])
    print(matrix)

def main():
    numpyFun()


main()    