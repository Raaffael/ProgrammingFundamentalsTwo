import java.util.Scanner;
import java.util.StringTokenizer;

public class a5main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence to be translated into Pig Latin:");
		StringTokenizer fullName = new StringTokenizer(scan.nextLine().toUpperCase());
		PigLatinator.convertToPigLatin(fullName);
		scan.close();
	}

}
