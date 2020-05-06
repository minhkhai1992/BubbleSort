package bubbleSort;

public class ArrayBubble {

	private long[] k;
	private int elementNum = 0;
	
   public ArrayBubble(){
      k = new long[0];
      elementNum = 0;
   
   }
   
	/*
	 * Constructor method
	 * */
	public ArrayBubble(int max) {
		k = new long[max];
		elementNum = 0;
	}
	
	public void insert(long value) {
		k[elementNum] = value;
		elementNum++;
	}
	
	public void display() {
		for(int i=0; i < elementNum; i++) {
			System.out.print(k[i] + " ");
		}
		System.out.println("");
	}
	
	public void bubbleSort() {
		int out, in;
		
		for(out= elementNum - 1; out >1; out--) {		
			for(in = 0; in < out; in++) {
				if (k[in] > k[in+1]) {
					//swap function here
					swap(in, in+1);
				}
			}
		}	
	}
	
	public void swap(int a, int b) {
		long temp = k[a];
		k[a] = k[b];
		k[b] = temp;
		
	}
}
