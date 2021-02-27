
public class SortedLinkedList  {
	public INode head;
	public INode tail;
	
	public SortedLinkedList(){
		this.head = null;
	}
	
	public <K extends Comparable<K>> void sortedInsert (INode newNode) {
		INode current = this.head;
		INode previous = null;
		while(current != null && (((Comparable<K>) newNode.getKey()).compareTo( (K) current.getKey())>0 )) {
			previous = current;
			current = current.getNext();
		}
		if(previous == null) {
			this.head = newNode;
		}else {
			previous.setNext(newNode);
		}
		newNode.setNext(current);
	}
	
	public void adjustTail() {
        INode tempNode=this.head;
        while(!(tempNode==null)) {
            this.tail=tempNode;
            tempNode=tempNode.getNext();
        }
    }
	
	public void printMyNodes() {
		StringBuffer myNodes = new StringBuffer("My Nodes: ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNodes.append(tempNode.getKey());
			if (!tempNode.getNext().equals(null))
				myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
}



