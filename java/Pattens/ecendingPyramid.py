def printer1(n):
    for i in range(0, n):
        for j in range(0,n-i-1):
            print(" ",end="")
        for j in range(0,2*i+1):
            print("*",end="")
        for j in range(0,n-i-1):
            print(" ",end="")
        print('')
def printer2(n):
    for i in range(0,n):
        for j in range(0,i):
            print(" ",end='')
        for i in range(0, 2 * n - (2 * i + 1)):

            print("*",end='')
        for j in range(0,i):
            print(" ",end='')
        print("")  
def main(n):
     printer1(n)
     printer2(n)

main(n)
n=int(input())
