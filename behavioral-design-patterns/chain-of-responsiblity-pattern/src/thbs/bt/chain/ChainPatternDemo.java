package thbs.bt.chain;

public class ChainPatternDemo {
	 private static AbstractLogger getChainOfLoggers(){

	      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
	      AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
	      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

	      errorLogger.setNextLogger(fileLogger);
	      fileLogger.setNextLogger(consoleLogger);

	      return errorLogger;	
	   }
	 public static void main(String[] args) {
	      AbstractLogger loggerChain = getChainOfLoggers();

	      loggerChain.logMessage(AbstractLogger.INFO, 
	         "This is an information.");

	      loggerChain.logMessage(AbstractLogger.DEBUG, 
	         "This is an debug level information.");

	      loggerChain.logMessage(AbstractLogger.ERROR, 
	         "This is an error information.");
	   }

}


// the chain of responsibility pattern creates a chain of receiver objects for a request. 
//In this pattern, normally each receiver contains reference to another receiver. If one object cannot handle the request then it passes the same to the next receiver and so on.