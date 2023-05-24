
public class StringMethods {

	public static void main(String[] args) {
		String name = "TONY THEO";
		char charTest = 'H';

		// 1. Create and display a string in upper and lowercase
		System.out.println(name);

		System.out.println(name.toLowerCase());
		System.out.println(name);

		name = name.toLowerCase();
		System.out.println(name);

		System.out.println(name.toUpperCase());

		// 2. character upper and lowercase

		System.out.println(charTest);

		System.out.println(Character.toLowerCase(charTest));
		System.out.println(Character.toUpperCase(charTest));

		charTest = Character.toLowerCase(charTest);
		System.out.println(charTest);

		// 3. Determine what 'type' a character is
		charTest = '#';
		
		if (Character.isLetter(charTest)) {
			System.out.println(charTest + " is a letter");
		} else {
			System.out.println(charTest + " is not a letter");
		}
		
		if (Character.isDigit(charTest)) {
			System.out.println(charTest + " is a digit");
		} else {
			System.out.println(charTest + " is not a digit");
		}
		
		if (!Character.isLetterOrDigit(charTest)) {
			System.out.println(charTest + " is a special character");
		} else {
			System.out.println(charTest + " is not a special character");
		}
		
		
		//4. Remove excess blank lines
		name = "     Tony Theo     ";
		
		System.out.println(name + ".");
		System.out.println(name.trim() + ".");
		System.out.println(name + ".");
		
		name = name.trim();
		System.out.println(name + ".");

	}

}
