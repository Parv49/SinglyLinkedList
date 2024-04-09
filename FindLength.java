package SinglyLinkedList;

public class FindLength {
    
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
        FindLength sll = new FindLength();
        sll.head=new ListNode(10); 
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(8);
        ListNode forth=new ListNode(11);
        
        sll.head.next=second;
        second.next=third;
        third.next=forth;
        
        System.out.println(sll.length());
    }
    
    public int length(){
        if(head==null){
            return 0;
        }
        int count=0;
        ListNode current = head;
        while(current != null){
            count++;
            current=current.next;
        }
        return count;
    }
}
