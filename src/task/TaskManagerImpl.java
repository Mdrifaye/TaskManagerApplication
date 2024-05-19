package task;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

import customexception.IdNotFoundException;
import customexception.InvalidPriorityException;

public class TaskManagerImpl implements TaskManager {

	static Scanner sc = new Scanner(System.in);
	static LinkedHashMap<Integer, Task> tasks = new LinkedHashMap<Integer, Task>();

	@Override
	public void addTask() {
		System.out.print("Enter task title : ");
		String title = sc.nextLine();
		System.out.print("Enter task description : ");
		String disc = sc.nextLine();
		System.out.print("Enter task priority (High/Medium/Low) : ");
		String priority = sc.nextLine();
		System.out.print("Enter task Status (Pending/In progress/Completed) : ");
		String status = sc.nextLine();

		Task t = new Task(title, disc, priority, status);
		tasks.put(t.getId(), t);

		System.out.println("\n\"Task Added Successfully\"");
	}

	@Override
	public void editTask(int id) {
		Set<Integer> keys = tasks.keySet();
		if (tasks.containsKey(id)) {
			for (Integer key : keys) {
				if (key == id) {
					System.out.print("Enter task title : ");
					tasks.get(id).setTitle(sc.nextLine());
					System.out.print("Enter task description : ");
					tasks.get(id).setDescription(sc.nextLine());
					System.out.print("Enter task priority (High/Medium/Low) : ");
					tasks.get(id).setPriority(sc.nextLine());
					System.out.print("Enter task Status (Pending/In progress/Completed) : ");
					tasks.get(id).setStatus(sc.nextLine());

					System.out.println("\n\"Task Edited Successfully\"");
				}
			}
		} else {
			throw new IdNotFoundException("Id Not found ");
		}
	}

	@Override
	public void deleteTaskById(int id) {
		if (tasks.containsKey(id)) {
			tasks.remove(id);
			System.out.println("\n\"Id " + id + " Deleted\"");
		} else {
			throw new IdNotFoundException("Id Not Found");
		}
	}

	@Override
	public void getTaskById(int id) {
		Set<Integer> key = tasks.keySet();
		if (tasks.containsKey(id)) {
			for (Integer ele : key) {
				if (ele == id) {
					System.out.println(tasks.get(id));
				}
			}
		} else {
			throw new IdNotFoundException("Id Not found ");
		}
	}

	@Override
	public void viewAllTask() {
		Set<Integer> key = tasks.keySet();
		for (Integer ele : key) {
			System.out.println(tasks.get(ele) + "\n");
		}
		System.out.println();
	}

	@Override
	public void filterTaskByPriority(String priority) {
		Set<Integer> key = tasks.keySet();
		boolean loop = false;
		for (Integer ele : key) {
			if (tasks.get(ele).getPriority().equals(priority)) {
				loop = true;
			}
		}
		if (loop) {
			for (Integer ele : key) {
				if (tasks.get(ele).getPriority().equals(priority)) {
					System.out.println(tasks.get(ele));
				}
			}
		} else {
			throw new InvalidPriorityException("Priority Not Found");
		}

	}

	@Override
	public void deleteAllTask() {
		System.out.println("\nMake sure you want to delete all task");
		System.out.println("Press 1 for Yes \nPress 0 for No");
		int confirm = sc.nextInt();
		switch (confirm) {
		case 1:
			// yes
			tasks.clear();
			System.out.println("\"All Task Deleted\"");
			break;
		case 0:
			// No
			System.out.println("\"Task Not Deleted\"");
			break;
		default:
			// Invalid confirmation
			System.err.println("Invalid Option");
			break;
		}
	}

}
