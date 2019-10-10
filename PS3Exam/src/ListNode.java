import java.util.Stack;

public class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val=x;
		
	}


	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		String num1="";
		String num2="";
		ListNode current= null;

		current= l1;
		while(current!=null) {
			int i= current.val;
			num1= Integer.toString(i).concat(num1);
			current=current.next;

		}
		current=l2;
		while(current!=null) {
			int i= current.val;
			num2= Integer.toString(i).concat(num2);
			current=current.next;

		}
		System.out.println(num1+ "+" + num2);
		int res= Integer.parseInt(num1)+ Integer.parseInt(num2);
		String resS= Integer.toString(res);
		System.out.println(resS);
		
		
		ListNode resL= new ListNode(Integer.parseInt(resS.substring(resS.length()-1)));
		System.out.println(resL.val);
		resS= resS.substring(0, resS.length()-1);
		System.out.println(resS);
		current=resL;
		while(!resS.equals("")) {
			
			current.next= new ListNode(Integer.parseInt(resS.substring(resS.length()-1)));
			resS= resS.substring(0, resS.length()-1);
			current=current.next;
		}
		
	
		





		return resL;
	}


}
