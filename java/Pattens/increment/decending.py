n=int(input())
def seeding(n: int) -> None:
    for i in range(1,n+1):
        for j in range(1,n+2-i):
            print(j,end="")
        print("")       
    # Write your solution here.
    pass

seeding(n)    