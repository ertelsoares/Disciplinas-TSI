package logger;

public class DatabaseLogger extends AbstractLogger
{

	public DatabaseLogger() {
		super(new SimpleLogMessageValidator(),
				new LogMessageNoSqlDatabaseWriter());
		
	}

	
	
	
}
