package logger;

public class LogMessageCsvFileWriter implements ILogMessageWriter {

	@Override
	public void write(String logMessage) throws LogException {
		//for educational purposes only
		System.out.printf("\n'%s' was logged into csvFilelog",logMessage);
		
	}

}
