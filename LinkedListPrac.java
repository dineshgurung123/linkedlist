public class LinkedListPrac {

    Node head;

    class Node {

        int data;
        Node next;

        Node(int data) {

            this.data = data;
            next = null;

        }

    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;

        }

        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;
            return;
        }
        Node currNode = head;

        while (currNode.next != null) {

            currNode = currNode.next;

        }

        currNode.next = newNode;

    }

     public void deleteFirst(){

         if(head == null){

            System.out.println("Empty");
            return;
         }

     head = head.next;
     }

      public void deleteLast(){

          if(head == null){
            System.out.println("Empty");
            return;
          }
        
          if(head.next == null){
            head = null;
            return;
          }

          Node last = head.next;
          Node secondLast = head;


            while (last.next !=null) {
                
                  last = last.next;
                  secondLast = secondLast.next;

            }

            secondLast.next = null;
        
              

      }


      public void insertAtPosition(int pos, int data){
           
               Node  newNode = new Node(data); 

                 if(pos == 1){
                 newNode.next = head;
                 head = newNode;
                 return ;
               }
           

            int count = 1;
            Node previous = head;

            while(count < pos-1 && previous!=null){
                  previous = previous.next;

            }
                        if(previous == null){
                            System.out.println("out of bound");
                             return;
                        }
                 
                         newNode.next = previous.next;
                        previous.next = newNode;
                          
            }
      
  
 


    public void print() {


        if (head == null) {

            System.out.println("list is empty");
            return;
          }

        Node currentNode = head;

        while (currentNode != null) {

            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;

        }

    }

    public static void main(String[] args) {

        LinkedListPrac ll = new LinkedListPrac();
        ll.addFirst(4);
        ll.addFirst(9);
        ll.addFirst(8);
        ll.deleteLast();
        ll.insertAtPosition(2, 5);
        ll.print();
         
    }
}
