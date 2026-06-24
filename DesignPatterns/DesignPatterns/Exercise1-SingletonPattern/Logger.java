package singleton;

public class Logger {
	private static Logger instance;
	private Logger(){
		System.out.println("object is created");
	}
	public static Logger getInstance() {
		if(instance == null) {
			instance = new Logger();
		}
		return instance;
	}

}
