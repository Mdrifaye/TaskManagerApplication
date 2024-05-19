package customexception;

public class InvalidPriorityException extends RuntimeException {

	public InvalidPriorityException(String reason) {
		super(reason);
	}
}
