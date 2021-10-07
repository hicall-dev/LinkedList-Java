public class ListNode{
  //float value
  //ListNode next

  //primitif

  private float value;
	private ListNode next;
	
  public ListNode(){
		this.value = 0;
		this.next = null;
	}
	
	public ListNode(float newValue){
		this.value = newValue;
		this.next = null;
	}
	
	public float getValue(){
		return this.value;
	}
	
	public void setValue(float newValue){
		this.value = newValue;
	}
	
	public ListNode getNext(){
		return this.next;
	}
	
	public void setNext(ListNode newNext){
		this.next = newNext;
	}

  @Override
  public String toString(){
    return ("" + this.value);
  }
	
}