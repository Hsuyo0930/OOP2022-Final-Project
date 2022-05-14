
public class deliveryManException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	private String errMsg;
	
	public enum exceptionType {
		ImBusyNow
	}
	
	deliveryManException(exceptionType ex) {
		switch (ex) {
		case ImBusyNow:
			errMsg = "Delivery Man is busy now.";
			break;
		default:
			break;
		}
	}
	
	public String getErrorMessage() {
		return errMsg;
	}
}
