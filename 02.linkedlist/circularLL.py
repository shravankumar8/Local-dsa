class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
class circularLL:
    def __init__(self):
        self.head = None
        # initialize an empty circular ll
# add a node at the end 
    def append(self,data):
        newNode=Node(data)
        if not self.head:
            self.head=newNode
        else:
            current=self.head
            while current.next != self.head:
                current=current.next

            current.next=newNode
            newNode.next=self.head
    def traverse(self):
        if not self.head:
            print("The circular list is empty ")
            return 
        current-self.head
        while(true):
            print(current.data, end=" -> ")
            current=current.next  
            if current.next == self.head:
                break;


circularList=circularLL()
circularList.append(1)
circularList.append(3)
circularList.append(4)
circularList.append(654)
circularList.append(32)
circularList.append(76)
circularList.traverse()
