
public class BrowserException extends RuntimeException {
	
	String eMessage;
	
	public BrowserException() {
		// TODO Auto-generated constructor stub
	}

	public BrowserException(String message) {
		super(message);
		this.eMessage = message;
		// TODO Auto-generated constructor stub
	}

	public BrowserException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public BrowserException(String message, Throwable cause) {
		super(message, cause);
		this.eMessage = message;
		// TODO Auto-generated constructor stub
	}

	public BrowserException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
		this.eMessage = message;
	}
	
	public String getMessage(){
		return eMessage;
		
	}

}
