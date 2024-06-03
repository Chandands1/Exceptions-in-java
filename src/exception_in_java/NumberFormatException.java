package exception_in_java;

public class NumberFormatException {
	
	public static void main(String[] args) {
		try {
			String str = "abc";
			
			int num = Integer.parseInt(str);
		} catch (java.lang.NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("hi");
		
	}

}
