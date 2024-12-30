n=int(input("Enter a stream of Numbers :"))

# k=list(str(n))
# print("The digits are",len(k))
cnt=0
while(n>0):
    n=n//10
    cnt = cnt + 1;


print("the cout is ", cnt)