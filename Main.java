public class Main {
	public static void main(String[] args){
	    LinkedList x = new LinkedList();
		
        // PRINT toString METHOD
        System.out.println(x);

		// APPEND
		x.Append(2);
		x.Append(3);
		x.Append(12);
		x.Append(1);
		System.out.println(x);
		
		// INSERT FIRST
		x.insertFirst(1);
		System.out.println(x);
		
		// INSERT AFTER INDEX
		x.insertAfter(x.getNode(1), 15);
		System.out.println(x);
		
		// DELETE FIRST
		x.delFirst();
		System.out.println(x);
		
		// DELETE AFTER INDEX
		x.delAfter(x.getNode(2));
		System.out.println(x);
		
		// DELETE LAST
		x.delLast();
		System.out.println(x);

	}
}
