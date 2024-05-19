package customexception;

public class InvalidChoiseException extends RuntimeException {

	public InvalidChoiseException(String reason) {
		super(reason);
	}

}
