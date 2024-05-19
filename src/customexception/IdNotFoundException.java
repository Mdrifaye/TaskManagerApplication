package customexception;

public class IdNotFoundException extends RuntimeException {

	public IdNotFoundException(String reason) {
		super(reason);
	}

}
