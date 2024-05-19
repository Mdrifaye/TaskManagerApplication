package task;

public class Task {
	int id;
	private String title;
	private String description;
	private String priority;
	private String status;
	static int tid = 0;
	
	public Task() {
		
	}

	public Task(String title, String description, String priority, String status) {
		super();
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.status = status;
		this.id = ++tid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", description=" + description + ", priority=" + priority
				+ ", status=" + status + "]";
	}

}
