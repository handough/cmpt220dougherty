import java.util.ArrayList;
import java.util.Scanner;
public class RemoveDuplicates {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
        	System.out.println("Enter a number: ");
        	list.add(input.nextInt());
        }
        removeDuplicate(list);
        System.out.println("No duplicates list: " + list);
        input.close();
	}
	public static void removeDuplicate(ArrayList<Integer> list) {

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

            if (!temp.contains(list.get(i))) {
                temp.add(list.get(i));
            }
        }
        list.clear();
        list.addAll(temp);
    }
}
