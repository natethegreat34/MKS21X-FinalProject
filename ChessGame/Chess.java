import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
public class Chess{
	public static void main(String[] args) {
		System.out.println("Enter Filename");
		System.out.println("(If The File Does Not Exist It Will Create a New File For You)");
		Scanner inptFileName = new Scanner(System.in);
		Chessboard chess =  new Chessboard();
		String filename = inptFileName.nextString();
		chess.loadGame(filename);
		System.out.println(chess);
	}
}
