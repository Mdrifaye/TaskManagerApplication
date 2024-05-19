package workout;

import java.util.LinkedHashMap;
import java.util.Map;

import task.Task;

public class LinkedListExample {
	public static void main(String[] args) {
//		List<String> l = new LinkedList<String>();
//		l.add("Rifaye");
//		l.add("23");
//		l.add("Developer");
//		l.add("50000.0");
//
//		ListIterator<String> i = l.listIterator(l.size());
//		while (i.hasPrevious()) {
//			System.out.println(i.previous());
//		}
//		System.out.println(l.get(2));
		
		Map<Integer, Task> map = new LinkedHashMap<Integer, Task>();
		map.put(1, new Task("Task 1","Desc 1","low","Com"));
		map.put(2, new Task("Task 2","Desc 2","high","Com"));
		map.put(3, new Task("Task 3","Desc 3","low","Com"));
//		System.out.println(map.get(1).getPriority().equals("low"));
		for(Task task : map.values()) {
//			System.out.println(map.containsValue(task));
			System.out.println("low".equals(task.getPriority()));
//			System.out.println(task.getPriority().equals("low"));
		}
	}
}
