	package task;
	
	public interface TaskManager {
		void addTask();
	
		void editTask(int id);
	
		void deleteTaskById(int id);
		
		void deleteAllTask();
	
		void getTaskById(int id);
	
		void viewAllTask();
	
		void filterTaskByPriority(String priority);
	}
