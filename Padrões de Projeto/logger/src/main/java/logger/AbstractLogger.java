package logger;

public abstract class AbstractLogger implements ILogger
{
	
	private ILogMessageValidator messageValidator = null;
	private ILogMessageWriter messageWriter = null;
	//-----------------------------------
	
	public AbstractLogger(ILogMessageValidator msgValidator, ILogMessageWriter messageWriter) {
		
		this.messageValidator = msgValidator;
		this.messageWriter = messageWriter;
	}
	
	@Override
	public final void log(String logMessage) throws LogException {
		messageValidator.valitade(logMessage);
		messageWriter.write(logMessage);
	}
	
	
}
