lass Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
       ListNode temp=head;
       ListNode temp2=head.next;
       while(temp2!=null){
            if( temp2.next==null && temp.val==temp2.val ){
               temp.next=null;
            //    System.out.print("hi"+temp.val);
               return head;
           }
           else if(temp.val==temp2.val && temp2.next!=null){
               temp2=temp2.next;
           }
           else{
               temp.next=temp2;
               temp=temp2;
               temp2=temp2.next;
           }
          
       }
       return head;
    }
}
