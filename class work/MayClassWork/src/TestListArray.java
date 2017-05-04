
public class TestListArray {
	public static void main(String[] args){
		ListArray list = new ListArray();
		
		list.add(3);
		list.add(10);
		list.add(50);
		list.add(45);
		list.add(12);
		list.add(5);
		list.add(2);
		
		list.print();
		
		list.add(52, 3);
		
		list.print();
		
		System.out.println(list.get(5));
		
		list.empty();
		
		System.out.println("Is the list empty: " + " Idk.");
	}
}
