package ArrayListEx_2;

import java.util.ArrayList;
import java.util.HashSet;

public class AddToArrayList {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(100);hs.add(200);hs.add(300);
		
		ArrayList<Integer> al = new ArrayList<Integer>(hs);
		
		System.out.println(al);
	}
}
