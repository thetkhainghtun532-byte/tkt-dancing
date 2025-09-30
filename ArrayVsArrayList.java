import java.util.Arrays;
import java.util.ArrayList;

public class ArrayVsArrayList {
	public static void main(String[] args) {
		
		//String[] friends = new String[4];
		String[] friendsArray = {"mgmg", "agag", "eiei", "ngng"};

		ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("mgmg", "agag", "eiei", "ngng"));

		//get values using index;
		System.out.println(friendsArray[0]);
		System.out.println(friendsArrayList.get(0));

		//get lengths;
		System.out.println(friendsArray.length);
		System.out.println(friendsArrayList.size());

		//add next index(element) with ArrayList, you cannot do this with Array;
		friendsArrayList.add("maymay");
		System.out.println(friendsArrayList.get(4));

		//set an element or change values;
		friendsArray[1] = "aye2";
		System.out.println(friendsArray[1]);
		friendsArrayList.set(1,"aye2");
		System.out.println(friendsArrayList.get(1));

		//remove values, you cannot do this with Array;
		friendsArrayList.remove(0);
		System.out.println(friendsArrayList.get(0));

		//print Array and ArrayList;
		System.out.println(friendsArray);
		System.out.println(friendsArrayList);


	}
}