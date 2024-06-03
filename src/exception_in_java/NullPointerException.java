package exception_in_java;

public class NullPointerException {
	
	public static void main(String[] args) {
		try {
			String str = null;
			int length = str.length();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
           System.out.println("hello");
	}

}
