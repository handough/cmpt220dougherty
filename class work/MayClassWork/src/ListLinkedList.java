public class ListLinkedList extends List {
	private Node list;
	private int numElements;
	@Override
	public void add(int elem) {
		Node newNode = new Node();
		newNode.content = elem;
		if (list == null){
			list = newNode;
		}
	}
	@Override
	public void add(int elem, int index) {
		Node currentNode = list;
		Node newNode = new Node();
		if(index > 0 && index <= numElements){
			for(int i = 0; i < index; i++){
				currentNode = currentNode.next;
				currentNode.next = newNode;
			}
			newNode.content = elem;
			newNode.content = elem;
			
			
			if(index == 0){
				newNode.next = list;
				list = newNode;
			}
		}
	}
	@Override
	public void remove(int index) {
	}

	@Override
	public boolean isEmpty() {
		return numElements == 0;
	}

	@Override
	public void empty() {
		numElements = 0;
		list = null;
	}

	@Override
	public int get(int index) {
		Node currentElement = list;
		for(int i = 0; i <= index; i++){
		}
		return currentElement.content;
	}

	@Override
	public void print() {
	}
}
class Node{
	int content;
	Node next;
}
