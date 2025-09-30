import java.util.Arrays;
import java.util.ArrayList;


public class ArVaArList {
	public static void main(String[] args) {
		
		int[] numbersArray = {1,2,3,4};

		ArrayList<Integer> numbersArrayList = new ArrayList<>(Arrays.asList(1,2,3,4));

		//get values using index;
		System.out.println(numbersArray[2]);
		System.out.println(numbersArrayList.get(2));

		//get length;
		System.out.println(numbersArray.length);
		System.out.println(numbersArrayList.size());

		//add an index or element, cannot with array;                          ***
		numbersArrayList.add(4,5);
		System.out.println(numbersArrayList.get(4));

		//set values or change;
		numbersArray[3] = 9;
		System.out.println(numbersArray[3]);
		numbersArrayList.set(3,9);
		System.out.println(numbersArrayList.get(3));

		//remove index or elementk, cannot with array;
		numbersArrayList.remove(3);
		System.out.println(numbersArrayList.get(3));

		System.out.println(numbersArray);
		System.out.println(numbersArrayList);


	}
}