import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
        	System.out.println("Enter a number: ");
        	list.add(input.nextInt());
        }
        System.out.println("Sorted numbers: " + sort(list));
        System.out.println("Numbers: " + list);
        input.close();

    }
	public static void sort(ArrayList<Integer> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            int currentMin = list.get(i);
            int currentIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (currentMin > list.get(j)) {
                    currentMin = list.get(j);
                    currentIndex = j;
                }
            }

            if (currentIndex != i) {
                list.set(currentIndex, list.get(i));
                list.set(i, currentMin);
            }
        }
	}
}
