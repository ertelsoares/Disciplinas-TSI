package logger;

public class SimpleLogMessageValidator implements ILogMessageValidator{
     
	final String invalidMessage = "Invalid Log Message";
	
	
	@Override
	public void valitade(String logMessage) throws LogException {
		
		if(logMessage == null)
			throw new LogException( invalidMessage + " ( Null )");
		
		if(logMessage.isBlank() || logMessage.isEmpty())
			throw new LogException( invalidMessage + " ( Empty )");
		
		if(logMessage.toUpperCase().contains("XPTO"))
			throw new LogException( invalidMessage + "(it contains 'XPTO')");
		
		
	}

	

	

}
