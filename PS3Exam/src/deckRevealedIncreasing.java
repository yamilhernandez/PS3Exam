import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class deckRevealedIncreasing {
	public int[] deckRevealedIncreasing(int[] deck) {
		int n = deck.length;
		Arrays.sort(deck);
		Queue<Integer> q= new LinkedList<>();
		
		for (int i = n-1; i >= 0; --i) {
			if(q.size()>0) q.add(q.poll());
			q.add(deck[i]);
		}
		int[] array= new int[n];
		for (int i = n-1; i >= 0;--i) {
			array[i]= q.poll();
		}
		return array;
		

	}
	   

}
