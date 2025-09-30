import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListInteger {
	public static void main(String[] args) {
		
		ArrayList<Integer> arrangeNumbers = new ArrayList<>(Arrays.asList(1,2,3,6,5,4,7,9,8,0));
																          
		System.out.println("======================================");
		arrangeNumbers.remove(3);
		arrangeNumbers.add(3,4);
		System.out.println(arrangeNumbers);

		System.out.println("======================================");
		arrangeNumbers.remove(5);
		arrangeNumbers.add(5,6);
		System.out.println(arrangeNumbers);

		System.out.println("======================================");
		arrangeNumbers.remove(7);
		arrangeNumbers.add(7,8);
		System.out.println(arrangeNumbers);

		System.out.println("======================================");
		arrangeNumbers.remove(8);
		arrangeNumbers.add(8,9);
		System.out.println(arrangeNumbers);
		System.out.println("======================================");


	}
}