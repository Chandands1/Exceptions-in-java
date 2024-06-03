package exception_in_java;

public class ArthmeticException {
	
	public static void main(String[] args) {
		try {
			int result = 5/0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hi");
	}

}
