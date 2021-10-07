public class LinkedList{
  //atribut ListNode head;

  //primitif
  //implementasikan append

	public ListNode head;
	
	public LinkedList(){
		this.head = null;
	}
	
	public LinkedList(ListNode newHead){
		this.head = newHead;
	}
	
	public ListNode getHead(){
		return this.head;
	}
	
	public void setHead(ListNode newHead){
		this.head = newHead;
	}
	
	public void Print(){
		ListNode x = head;
		while (x!=null){
			System.out.print(x.getValue()+" ");
			x = x.getNext();
		}
	}

  @Override
	public String toString(){
		ListNode x = head;
		String print = "";
		while (x!=null){
			print += x.getValue() + " ";
			x = x.getNext();
		}
		return print;
	}
  
	public void Append(float value){
		ListNode Node = new ListNode(value);
		
		if ( this.head == null ){
			this.head = Node;
		} else {
			ListNode x = this.head;
			while (x.getNext()!=null){
				x = x.getNext();
			}
			x.setNext(Node);
		}
	}
	
	public ListNode insertFirst(float value){
		ListNode Node = new ListNode(value);
		Node.setNext(this.head);
		this.head = Node;
		return Node;
	}
	
	public ListNode getNode(int index){
		ListNode Node = this.head;
		int x = 0;
		while (x!=index){
			Node = Node.getNext();
			x++;
		}
		return Node;
	}
	
	public ListNode insertAfter(ListNode prevNode,float value){
		ListNode Node = new ListNode(value);
		Node.setNext(prevNode.getNext());
		prevNode.setNext(Node);
		return Node;
	}
	
	public ListNode delFirst(){ 
		ListNode Node = new ListNode();
		Node = this.head;
		this.head = Node.getNext();
		Node.setNext(null);
		return Node;
	}
	
	public ListNode delAfter(ListNode prevNode){
		ListNode Node = new ListNode();
		Node = prevNode.getNext();
		prevNode.setNext(Node.getNext());
		Node.setNext(null);
		return Node;
	}
	
	public ListNode delLast(){
		ListNode Node;
		ListNode x;
		if (isOneEl()){
			Node = delFirst();
		} else {
			x = head;
			while (x.getNext().getNext()!=null){
				x = x.getNext();				
			}
			Node = x.getNext();
			x.setNext(null);
		}
		return Node;
	}
	
	private boolean isOneEl(){
		return this.head.getNext() == null;
	}
}