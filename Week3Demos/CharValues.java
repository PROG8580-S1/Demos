
public class CharValues {

	public static void main(String[] args) {
		int i = 'a';
		char c = 88;
		
		System.out.println(i);
		System.out.println(c);
		
		c++;
		
		System.out.println(c);

		if (c >= 'A' && c <= 'Z') {
			System.out.println(c + " is an uppercase letter.");
		} else if (c >= 'a' && c <= 'z') {
			System.out.println(c + " is a lowercase letter.");
		}else if (c >= '0' && c <= '9') {
			System.out.println(c + " is a number");
		}
		
		//have to convert an int to a char before assigning it.
		i = 88;
		c = (char)i;
		
		
		
	}

}
