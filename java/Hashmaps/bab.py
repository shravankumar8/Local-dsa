# seems like hashtables are nothiing much like but just objects in python 
# they are used to strore a bunch of key value pairs 
# uses an hashfunction to compute an index or a hashcode into an array of buckets or slots 
def func1():

    hash_table={"name":"alice",'age':34}
    print(hash_table['name'])
    hash_table['name']='bob'
    hash_table['name1']='12345bob'
    print(hash_table['name'])

class Node:
    def __init__(self,key,value):
        self.key=key
        self.value=value
        self.next=None
class HashTable:
    def __init__(self,capacity):
        self.size=0
        self.table=[None]*capacity
def main(): 
    func1()    

main()    