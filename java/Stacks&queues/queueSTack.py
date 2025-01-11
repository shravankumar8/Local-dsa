from queue import LifoQueue
stack =LifoQueue(maxsize=4)

stack.put('s')
stack.put('s')
stack.put('s')
stack.put('s')

print('\nElements popped from the stack')
print(stack.get())
print(stack.get())
print(stack.get())

print(stack)
print("full  ",stack.full())
print("size",stack.qsize())