public class RecurLL {
    Node head;
   
    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next=null;
           
        }
        public Node(int data,Node node) {
            this.data = data;
            this.next=null;
           
        }
    }


    


    public void insert(int ind, int val,Node node){
      if(ind==0){
        Node temp= new Node(val,node);
        node.next=head;
        head=node;
        return ;

      }
       insert(ind-1, val);



    }
public static void main(String[] args) {
    insert()
}


}
