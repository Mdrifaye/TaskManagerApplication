package task;

import java.util.Scanner;

import customexception.IdNotFoundException;
import customexception.InvalidPriorityException;

public class TaskManagerDriver {
	static boolean loop = true;
	static Scanner sc = new Scanner(System.in);
	static TaskManager tm = new TaskManagerImpl();

	public static void main(String[] args) {
		do {
			System.out.println(
					"1. Add Task\n2. Edit Task\n3. Delete Task By Id\n4. Delete All Task\n5. View All Task\n6. Get task by id \n7. Filter task by priority\n8. Exit");
			System.out.print("enter your choice(1-8): ");
			int choice = sc.nextInt();
			switch (choice) {

			case 1:
				// Add task
				tm.addTask();
				System.out.println();
				break;

			case 2:
				// edit task
				try {
					System.out.print("Enter the id : ");
					tm.editTask(sc.nextInt());
				} catch (IdNotFoundException id) {
					System.err.println("\t\tId Not Found");
				}
				System.out.println();
				break;

			case 3:
				// Delete task by id
				try {
					System.out.print("Enter the id : ");
					tm.deleteTaskById(sc.nextInt());
				} catch (IdNotFoundException id) {
					System.err.println("\t\tId Not Found");
				}
				System.out.println();
				break;

			case 4:
				// delete all task
				tm.deleteAllTask();
				System.out.println();
				break;

			case 5:
				// View all task
				tm.viewAllTask();
				System.out.println();
				break;

			case 6:
				// get task by id
				try {
					System.out.print("Enter the id : ");
					tm.getTaskById(sc.nextInt());
				} catch (IdNotFoundException id) {
					// id.printStackTrace();
					System.err.println("\t\tId Not Found");
				}
				System.out.println();
				break;
			case 7:
				// filter task by priority
				try {
					System.out.print("Enter the priority to filter task(High/Medium/Low) : ");
					tm.filterTaskByPriority(sc.next());
				} catch (InvalidPriorityException prio) {
					System.err.println("\t\tPriority Not Found");
				}
				System.out.println();
				break;

			case 8:
				// exit
				loop = false;
				break;

			default:
				System.out.println("Invalid Choice. Please enter number from (1-6)");
			}

		} while (loop);
	}
}
