# *****
# *****
# *****
# *****
# *****


# for the puter loop focus on the number of lines and for the inner loop focus on the columns 
# def printter(n):
#     for i in range(0,n):
#          print('*',end=" ")
# def maini(n):
#     for i in range(0, n):
#         print("")
#         printter(n)
        
# maini(5)

# Pattern-1: Rectangular Star Pattern


# 342

# 2
# Problem Statement: Given an integer N, print the following pattern.


# Examples:

# Example 1:
# Input: N = 3
# Output: 
# * * *
# * * *
# * * *


# Example 2:
# Input: N = 6
# Output:
# * * * * * *
# * * * * * *
# * * * * * *
# * * * * * *
# * * * * * *
# * * * * * *
# Solution
# Disclaimer: Don't jump directly to the solution, try it out yourself first.

# Problem Link

# Approach: 
# There are 4 general rules for solving a pattern-based question: 

# We always use nested loops for printing the patterns. For the outer loop, we count the number of lines/rows and loop for them.
# Next, for the inner loop, we focus on the number of columns and somehow connect them to the rows by forming a logic such that for each row we get the required number of columns to be printed.
# We print the ‘*’ inside the inner loop.
# Observe symmetry in the pattern or check if a pattern is a combination of two or more similar patterns.
# In this particular problem, we run the outer loop for N times since we have N rows to be printed, the inner loop also runs for N times as we have to print N stars in each row. This way we get a rectangular star pattern (square) with an equal number of rows and columns.
n=int(input())
for i in range(0,n):
    for j in range(1,n+1):
         print('*' * i)

    print('')    