
public class swapPairs {
	
public ListNode swapPairs(ListNode head) {
	if(head.next==null) return head;
	ListNode ret= head.next;
	
	ListNode aCurrent=null;
	ListNode current=head;
	
	while(current!=null) {
		if(current.next==null) return ret;
		ListNode temp= current.next;
		if(temp!=null) {
			current.next=temp.next;
			temp.next= current;
		}
		
	
		if(aCurrent!=null&& current!=null) {
		aCurrent.next=temp;
	
		}
		aCurrent=current;
		current= current.next;
		                          
		
		
		
	}
	
	
	
	
	return ret;
        
    }


}
