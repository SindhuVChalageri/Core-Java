package Example_1;

import java.util.LinkedList;

public class LinkedLiet {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		
		l.add("Rama");
		l.add("Laxmana");
		l.addFirst("Ramayana");
		l.addLast("Ravana");
		
		
		System.out.println(l);
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
	
		l.removeFirst();
		l.removeLast();
		
		System.out.println(l);
		
		l.add(0, "Ramayana");
		l.add(3, "Ravana");
		
		System.out.println(l);
		
		l.remove("Ravana");
		System.out.println(l);
	
		l.remove(2);
		System.out.println(l);
	}

	

	@Override
	public String toString() {
		return "LinkedLiet []";
	}
}
