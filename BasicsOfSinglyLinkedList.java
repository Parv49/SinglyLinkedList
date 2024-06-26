package SinglyLinkedList;

public class BasicsOfSinglyLinkedList {
    
    private ListNode head;
    
    public static class ListNode{
       private int data;
       private ListNode next;
       
       public ListNode(int data){
        this.data=data;
        this.next=null;
       }
    }
    
    
    public static void main(String[]args){
        BasicsOfSinglyLinkedList sll = new BasicsOfSinglyLinkedList();
        sll.head=new ListNode(10); 
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(8);
        ListNode forth=new ListNode(11);
        
        sll.head.next=second;
        second.next=third;
        third.next=forth;
    }
}
