public class MiddleList {
   private int size ;
        
        MiddleList(){
            size = 0;
        }

      Node head;
 

    class Node {

        int data;
        Node next;

        Node(int data) {

            this.data = data;
            size ++;


        }

    }

          public void AddData(int data){
             
            Node newNode = new Node(data);
               if(head == null){
                head = newNode;
                return;
               }

               Node currNode = head;

               while (currNode.next!=null) {
                
                 currNode = currNode.next;
               }
               
                currNode.next = newNode;
          }


          public void printList() {

            if (head == null) {
        
              System.out.println("list is empty");
              return;
            }
        
            Node currNode = head;
        
            while (currNode != null) {
        
              System.out.print(currNode.data + "->");
        
              currNode = currNode.next;
            }
        
            System.out.println("NUll");
        
          }




          public void FindMiddle(){

               int mid = size/2;
               int count = 1;

                      Node prev = head;
                        
                      if (mid %2 == 0) {
                        while (count< mid) {
                          prev = prev.next;
                          count++;
                          
                     }
                     System.out.println(prev.data);
                     return;
                      }
                
               while (count< mid+1) {
                    prev = prev.next;
                    count++;
               }
               System.out.println(prev.data);
          }



    public static void main(String[] args) {


 MiddleList list = new MiddleList();
    list.AddData(4);
     list.AddData(5);
     list.AddData(9);
     list.AddData(3);
  
     list.printList();
      list.FindMiddle();
    }
}
