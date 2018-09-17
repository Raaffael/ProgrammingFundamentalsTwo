import java.util.StringTokenizer;

public class PigLatinator {

	public static void convertToPigLatin(StringTokenizer fullName) {
		while(fullName.hasMoreTokens()) {
			StringBuilder strng = new StringBuilder(fullName.nextToken());
			char firstC = strng.charAt(0);
			strng.deleteCharAt(0);
			strng.append(firstC);
			strng.append("AY");
			System.out.print(strng + " ");
		}
		
	}

}
