def main(n):
    # Print the top part
    for i in range(1, n):
        print("*" * i)
    
    # Print the middle row
    print("*" * n)
    
    # Print the bottom part
    for i in range(n-1, 0, -1):
        print("*" * i)

n = int(input("Enter a number: "))
main(n)
