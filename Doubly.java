public class Doubly {
 
    Node head;


    class Node {
       int data;
       Node prev;      
       Node next;

     Node(int data){
       
        this.data = data;
        prev = null;
        next = null;
     }


    }
   

    public void insertAtBeginning(int data){
        
        Node newNode = new Node(data);
        
         if(head !=null){
               
          head.prev = newNode;
          
         }
          
              newNode.next = head;
              head = newNode;
    }
    


    public void insertAtLast(int data){
          
           Node newNode = new Node(data);
           
           if(head == null){
            head = newNode;
            return;
           }


              Node curr = head;

              while (curr.next !=null) {
                  
                 curr = curr.next;
              }

              curr.next = newNode;
              newNode.prev = curr;


    }

      public void deleteFirst(){

             if(head == null){
                return;
             }

             
                 head = head.next;
                 
                if(head!=null){


                    head.prev = null;
                }
             


      }     


      public void deleteLast(){

             if(head == null){
                return;
             }

             if(head.next == null){
                head = null;
             }
 
           Node temp = head;

           while (temp.next !=null) {
             

            temp = temp.next;
           }
         
           temp.prev.next = null;

      }




         public void print(){

             Node temp = head; 
               


             while (temp!=null) {
                  
                   System.out.print(temp.data + "->");
                temp = temp.next;
             }
             System.out.print("null");

         }
           


         public void printReverse(){

            Node temp = head;

            while (temp == null) {
                return;
                
            }


            while (temp.next != null) {
                 
                temp = temp.next;
            }
            

            while (temp!= null) {
                   
                System.out.print(temp.data + "<-");
                temp = temp.prev;
            }
            System.out.print("null");

         }
      

    public static void main(String[] args) {
        
          Doubly list = new Doubly();

          list.insertAtBeginning(1);
          list.insertAtLast(2);
          list.insertAtLast(3);
           list.deleteLast();
           list.print();

    }
}
