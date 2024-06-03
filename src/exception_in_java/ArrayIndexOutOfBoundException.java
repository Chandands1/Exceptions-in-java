package exception_in_java;

public class ArrayIndexOutOfBoundException {
	
	public static void main(String[] args) {
		try {
			int [] arr = new int[3];
			
			int num = arr[5];
			System.out.println(num);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("hello");
	}
	

}
