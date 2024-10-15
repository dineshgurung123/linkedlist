
public class LinkedList2 {

   private int size;
     
   LinkedList2(){

    size = 0;
   }

  Node head;

  class Node {

    String data;
    Node next;

    Node(String data) {

      this.data = data;
      this.next = null;
      size++;

    }
  }

  // Add-first Add-last

  public void addFirst(String data) {

    Node newNode = new Node(data);

    if (head == null) {

      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;

  }

  // add last

  public void addLast(String data) {

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

  // print

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

   public void deleteFirst(){

     if(head == null){

      System.out.println("The list is empty");
      return;
     }
     size--;
     head = head.next;
   }

         //delete last


         public void deleteLast(){

                if(head == null){
                  System.out.println("The list is empty");
                }
               
                size--;
                if(head.next==null){
                  head = null;
                  return;
                }


                Node secondLast = head;
                Node lastNode = head.next;


                while (lastNode.next !=null) {
                  
                      lastNode = lastNode.next;
                      secondLast = secondLast.next;
                }
      
                secondLast.next = null;

         }


         public int size(){
          return size;
         }
 

  public static void main(String[] args) {

    LinkedList2 list = new LinkedList2();

    list.addFirst("Dinesh");
    list.addLast("Sachin");
    list.addFirst("Krysala");
    list.printList();
    list.deleteFirst();
    list.printList();
    list.deleteLast();
    list.printList();
    System.out.println(list.size());
    list.addFirst("krysala");
    list.printList();
    System.out.println(list.size());

  }

}