import java.util.Scanner;
import java.io.*;

public class a2main {
	
	static File file = new File("WorldSeriesWinners.txt");

	public static void main(String[] args) throws IOException {
		
		Scanner keyboard = new Scanner(System.in);
		Scanner inputFile = new Scanner(file);
		String[] teams = new String[104];
		int totalWins = 0;
		System.out.println("Enter a team name:");
		String selectedTeam = keyboard.nextLine();
		for(int i= 0; i<104; i++) {
			teams[i] = inputFile.nextLine();
			if(teams[i].equals(selectedTeam)) {
				totalWins++;
			}
		}
		if(totalWins==1)
			System.out.println("The " + selectedTeam + " have won the World Series 1 time!");
		else
			System.out.println("The " + selectedTeam + " have won the World Series " + totalWins + " times!");
		inputFile.close();
		keyboard.close();
	}

}
