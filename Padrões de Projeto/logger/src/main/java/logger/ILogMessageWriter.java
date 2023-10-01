package logger;

public interface ILogMessageWriter {

	void write(String logMessage) throws LogException ;
}
