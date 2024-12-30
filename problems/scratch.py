#! /usr/bin/python3.11
def print1():
    var1=1
    var2=True
    var3=10.2345
    var4=10.3j
    print(type(var4))
    print(type(var3))
def print2():
    a=100
    print("The type of variable having value", a, " is ", type(a))
def kpop(name):
    print(name)  
def myFunction(*kids):
    print("The Youngest child is "+kids[0])      
def function2(child3,child2,child1):
    print("The youngest child is "+child3)
def function3(**kid):
    print("his last name is "+kid["lname"])
def my_functio4(country="norway"):

    print("The Youngest child is"+ country)
def my_functioon5(food):
    for x in food:
        print(x,"\n") 
def function6(x):


    return x*5    
def myFunctuon7(x,/):



    print(x)   
def myfunction8():
    T1=1,"Ravi",75.50, True
    print (T1, type(T1))
def functioon9():
    a=21
    b=23
    c=0
    print("a is {} b: {} c : {}".format(a,b,c))
def function10():
    var=5
    print(var>3 and var<10)
    print(var>3 or var<10)
    print(not (var>3 or var<10))
def function11():

        a=10;
        b=20
        list=[10,20,2,34,45,6,7,8]
        print("a:",a,"b:",b,"list:",list)
        if(a in list):
            print("a is present in the given list")
        else:
            print("a is not present in the given list")    
        if(b in list):
            print("b is present in the given list")
        else:
            print("b is not present in the given list")    
        if(b/a in list):
            print("b/a is present  in the given list",b/a)
        else:
            print("b/a is not present in the given list")            
def function12():
    a=[1,2,3,4,5]
    b=[1,2,3,4,5]
    c=a
    print(a is c)
    print(a is b)
    print(a is not c )
    print(a is not b)
def function13():
    print(4**3)
    print(22/7)
def function14():
    name = raw_input("Eneter your name - ")
    city = raw_input("Enter city name - ")
    print(name) 
def function15():

    a=43
    b=bin(a)
    print ("Integer:",a, "Binary equivalent:",b)       
def function16():
    for i in range(1,10):
        print("hii")
def functioon17(n):
    match n:
        case 0: return "Monday"
        case 1: return "Tuesday"
        case 2: return "Wednesday"
        case 3: return "Thursday"
        case 4: return "Friday"
        case 5: return "Saturday"
        case 6: return "Sunday"
def function18(n):
    match n:
        case "admin" |"manager " :return "full acces"
        case "Guest":return "limited access"
        case _: return "unknown access"
def function19():
    numbers=(3445,5,67,6,5,4,3,2,2,2)
    total=0
    for num in numbers:
        total+=num
    print(total)  
def function20():
    for num in range(5):
        print(num,end='')
    print("")
    for num in range(10,20):
        print(num,end='')
    print("")
    for num in range(1,10,2):
        print(num,end='')
def function21():
    numbers = {10:"Ten", 20:"Twenty", 30:"Thirty",40:"Forty"}
    for x in numbers:
        print(x ,":",numbers[x])
def funcyion22():
    numbers = {10:"Ten", 20:"Twenty", 30:"Thirty",40:"Forty"}
    for x in numbers.items():
        print(x)
def functuon23():
    for count in range(6):
        print (count)    
    else:
        print ("for loop over. Now in else block")
    print ("End of for loop")
def functyion23():
    for i in ["T","P"]:
        print(i)
    else:
        print("for loop over. Now in else block")    
def function24():
    count=0
    while count<5:
        count+=1
        print("The iteration. {}".format(count))
    print("the end oof the loop")    
def function25():
    var=1
    while var==1:
        num=int(input("Enter a number bro :"))
        print("you Entered :",num)
    print("good bye")    
def function26():
    for letter in "Python":
        if letter=='h':
            continue
        print("the current letter is ",letter) 
    print("good bye")        
def function27():
    name = input(prompt="Enter your name ")
    print(name,"world",sep="____")

def functionArrays():
    car=["Ford","angular","vue","BMW"]
    # prints the array 0th value 

    # modify the value in the array sep
    car[0]="Toyota"
    # print the length of the array 
    # print(len(car))
    # print(car[0])
    # looping through array 
    
    # for i in car:
    #     print(i)
    # insert something at the end of an array 
    # car.append("Honda")
    # car.append("Yamaha")
    # car.pop()
    # car.remove("Honda")
    # k=car.copy()
    # k.pop()
    # k.pop()
    # k.pop()
    # print(k)
    # print(car)
    car.sort()
    print(car)
def main():
    functionArrays()

main()    