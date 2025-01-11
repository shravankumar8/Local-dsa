

def printer(n):
    for i in range(1,n+1):
        if i%2==0:
            row=''.join(['1' if j%2==0 else '0' for j in range(i)])
        else:
            row = ''.join(['0' if j % 2 == 0 else '1' for j in range(i)])
        print(row)      
n=int(input())
printer(n)