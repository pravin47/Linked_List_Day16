public class MyStack {
	private final MyLinkedList myLinkedList;
	static int count = 0; 
	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}
	
	public void push(INode myNode) {
		myLinkedList.add(myNode);
		count = count +1;
	}
	
	public void printStack() {
		myLinkedList.printMyNodes();
	}
	
	public INode peak() {
		return myLinkedList.head;
	}
	
	public INode pop() {
		count = count -1;
		return myLinkedList.pop();
	}
	
	public void popTillEmpty() {
		while(count>0) {
			myLinkedList.pop();
			count = count -1;
		}
	}
}

