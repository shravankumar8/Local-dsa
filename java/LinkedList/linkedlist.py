class Node:
    def __init__(self, data):
        self.data = data
        self.next=None

class LinkedList:
    def __init__(self):
        self.head = None        
    def insertAtBegin(self,data):
        newNode=Node(data)
        if self.head is None:
            self.head=newNode        
            return
        else:
            newNode.next=self.head    
            self.head=newNode
    def insertAtindex(self,index,data):
        if (index==0):
            self.insertAtBegin(data)
        position=0
        currentNode=self.head
        while(currentNode.next!=None and position+1 != index):
            position=position+1
            currentNode=currentNode.next    
        if currentNode !=None:
            newNode=Node(data)
            newNode.next=currentNode.next
            currentNode.next=newNode
        else:
            print("index not present")    
    def insertAtEnd(self,data):
        newNode=Node(data)
        if self.head ==None:
            self.head=newNode
            return
        
        currentNode=self.head
        while(currentNode.next):
            currentNode=currentNode.next
        currentNode.next=newNode        
    def updateNode(self, data, index):
        currentNode=self.head
        position=0
        if position==index:
            currentNode.data=data
            return
        while(currentNode.next!=None and position+1 != index):
            position=position+1
            currentNode=currentNode.next
        if currentNode.next==None:
            currentNode.data=data
        else:
            print("index not present")    
    def remove_first_node(self):
        if self.head is None:
            print("List is empty")
            return
        else:
            self.head=self.head.next
    def remove_last_node(self):
        if self.head is None:
            print("List is empty")
            return            
        else:
            currentNode=self.head
            while(currentNode.next is not None and currentNode.next.next !=None):
                currentNode=currentNode.next
            currentNode.next=None
    def remove_at_index(self, index):
        if self.head is None:
            print("List is empty")
            return
        currentNode=self.head
        position=0
        while (currentNode.next is not None and position < index - 1 ):
            position += 1
            currentNode = currentNode.next
        if currentNode is None or currentNode.next is None:
            print("The given index is out of range")
            return
        else : 
            currentNode.next=currentNode.next.next
    def remove_node(self, data):
        currentNode = self.head
       
        while currentNode.next is not None and currentNode.next.data != data:
            currentNode = currentNode.next
        if currentNode.next is None:
            return
        else:
            currentNode.next = currentNode.next.next             
    def display(self):
        currentNode=self.head
        while (currentNode):
            print(currentNode.data)
            currentNode=currentNode.next            
    def size(self):
        size=0
        if (self.head):
            currentNode=self.head
            while(currentNode):
                size+=1
                currentNode=currentNode.next
            return size
        else :
            return 0

llist = LinkedList()
llist.insertAtEnd("shravan")
llist.insertAtEnd("shravan1")
llist.insertAtEnd("shravan2")
llist.insertAtEnd("shravan3")
llist.insertAtEnd("shravan4")
llist.insertAtEnd("shravan5")
llist.insertAtEnd("shravan6")
llist.insertAtEnd("shravan7")
llist.insertAtEnd("shravan8")
print(llist.display())
print(llist.remove_node("shravan8"))
print(llist.display())

