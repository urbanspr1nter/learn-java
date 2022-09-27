public class DataTypeDemo {
	public static void main(String[] args) {
		// width = 20 !WRONG!
		// int width = 20; !RIGHT!
		
		/*
			byte (8 bits) (char ASCII) -> [-128, 127]
			short (16 bits) [-32768, 32677]
			int (32 bits) [-2^31, (2^31 - 1)] -2 billion, 2 billion
			long (64 bits) [-2^63, (2^63 -1)] 
			
			float (32 bits)
			double (64 bits)
			
			char (8 bits) (char ASCII) -> [0, 255]
			string (array of char) -> char[]
		*/
		
		// typeName variableName = value;
		float width = 20.6f;
		float height = 30.9999999999f;
		
		int area = (int)width * (int)height;
			
		System.out.println("Area: " + area);
		
		
		char a = 'a'; // wrapped with SINGLE quotes
		System.out.println(a);
		
		String b = "bat"; // wrapped with double quotes
		System.out.println(b);
		
		char first = b.charAt(0);
		System.out.println(first);
		
		char second = b.charAt(1);
		System.out.println(second);
		
		char third = b.charAt(2);
		System.out.println(third);
		
		
		int batLength = b.length();
		System.out.println("Length of bat: " + batLength);
		
		
		String cat = "cat";
		String dog = "dog";
		
		boolean isSame = cat.equals(dog);
		System.out.println("Are cat and dog same? : " + isSame);
		
		dog = "cat";
		isSame = cat.equals(dog);
		System.out.println("Are cat and dog same? : " + isSame);

	}
}