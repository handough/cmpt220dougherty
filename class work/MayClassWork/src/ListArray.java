
public class ListArray extends List {
	private int[] list = new int[20];
	private int numElements = 0;
	
	public ListArray(){
		
	}

	public void add(int elem){
		if(numElements == list.length){
			increaseCapacity();
		}
		list[numElements] = elem;
		
	}
	@Override
	public void add(int elem, int index) {
		if(numElements == list.length){
			increaseCapacity();
		}
		if(index > 0 && index <= numElements){
			//shift elements in array
			for(int i = numElements -1; i > index; i++){
				list[i +1] = list[i];
			}
			//insert new element
			list[index] = elem;
		}
	}
	
	private void increaseCapacity(){
		int[] temp = new int[list.length * 2];
		for(int i = 0; i < numElements; i++)
			temp[i] = list[i];
		list = temp;
	}
	@Override
	public void remove(int index) {
		if(index > 0 && index <= numElements){
			for(int i = index; i < numElements - 1; i++){
				list[i] = list[i +1];
			}
			numElements--;
		}	
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public void empty() {
		
	}

	@Override
	public int get(int index) {
		return 0;
	}

	@Override
	public void print() {
		
	}
}
