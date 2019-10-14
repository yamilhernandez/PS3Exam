import java.util.PriorityQueue;

public class mergeKList {
	 public ListNode mergeKLists(ListNode[] lists) {
		 
		 PriorityQueue<Integer> minHeap= new PriorityQueue<Integer>();
		
		 for (ListNode node : lists) {
			 while(node!=null) {
				 minHeap.add(node.val);
				 node=node.next;
			 }
			
		}
		 ListNode dummy= new ListNode(-1);
		 ListNode head=dummy;
		 while(!minHeap.isEmpty()) {
			 head.next= new ListNode(minHeap.remove());
			 head=head.next;
			 
		 }
		 
		 
		return dummy.next;
	        
	    }

}
