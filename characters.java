import java.util.Scanner;
public class characters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String text = scanner.nextLine();
		int capitals = 0;
        int smallLetters = 0;
        int numbers = 0;
        int specialCharacters = 0;

        for (int i = 0; i < text.length(); i++) { 
            char character = text.charAt(i);
			if (Character.isUpperCase(character)) {
				capitals++;
			} else if (Character.isLowerCase(character)) {
				smallLetters++;
			} else if (Character.isDigit(character)) {
				numbers++;
			} else {
				specialCharacters++;
			}
		}

		System.out.println("Capital letters: " + capitals);
		System.out.println("Small letters: " + smallLetters);
		System.out.println("Numbers: " + numbers);
		System.out.println("Special characters: " + specialCharacters);
	}
}
