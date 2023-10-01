package logger;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DatabaseLoggerTest
{
	@Test
	void ShouldNotThrow()
	{
		ILogger logger = (ILogger) new DatabaseLogger();
   	   	
   	String logMessage = "Login a first message";
   	
   	assertDoesNotThrow(()->logger.log(logMessage));
	}
	
	@Test
	void ShouldThrow()
	{
		ILogger logger = new FileLogger();
   	
		final String nullMessage= null;   	
   	assertThrows(LogException.class, ()->logger.log(nullMessage));
   	
   	final String blanckMessage= null;   	
   	assertThrows(LogException.class, ()->logger.log(blanckMessage));
	}
}
