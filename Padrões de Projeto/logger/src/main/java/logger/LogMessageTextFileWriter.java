package logger;

public class LogMessageTextFileWriter implements ILogMessageWriter{

	@Override
	public void write(String logMessage) throws LogException {
		//for educational purposes only
		System.out.printf("\n'%s' was logged into fileLog",logMessage);
		
	}

}
