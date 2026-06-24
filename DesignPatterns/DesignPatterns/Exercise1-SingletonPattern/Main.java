package singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log1 = Logger.getInstance();
		Logger log2 = Logger.getInstance()
;
		System.out.println(log1==log2);
		}

}
