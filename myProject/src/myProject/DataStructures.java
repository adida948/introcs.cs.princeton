package myProject;

import java.util.LinkedList;

public class DataStructures {

	public static void main(String[] args) {
		int[] array = new int[10000000];
		
		long startTime = System.nanoTime();
		array[500000] = 100;
		System.out.println(System.nanoTime() - startTime);
		
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		for (int i = 0; i < 100000; i++) {
			linkedList.add(0);
		}
		
		startTime = System.nanoTime();
		linkedList.set(50000, 100);
		System.out.println(System.nanoTime() - startTime);
		
		startTime = System.nanoTime();
		for (int i = 0; i < linkedList.size(); i++) {
			Integer value = linkedList.get(i);
		}
		System.out.println(System.nanoTime() - startTime);

		startTime = System.nanoTime();
		for (Integer value : linkedList) {
			
		}
		System.out.println(System.nanoTime() - startTime);
		
		
		LinkedList<String> stack = new LinkedList<String>();
		stack.addLast("The Game");
		stack.addLast("The Game2");
		stack.addLast("The Game3");
		stack.addLast("The Game4");
		stack.addLast("The Game5");
		stack.addLast("The Game6");
		stack.removeLast(); // "The Game6"
		stack.removeLast(); // "The Game5"

	}

}
