import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
public class Chess{
	public static char convertIntoPiece(String piece){
		char ans = ' ';
		if (piece == null){
			return ans;
		}
		if(piece.equals("p")){
			ans = '\u265F';
		}
		if(piece.equals("P")){
			ans = '\u2659';
		}
		if(piece.equals("k")){
			ans = '\u265A';
		}
		if(piece.equals("K")){
			ans = '\u2654';
		}
		if(piece.equals("q")){
			ans = '\u265B';
		}
		if(piece.equals("Q")){
			ans = '\u2655';
		}
		if(piece.equals("r")){
			ans = '\u265C';
		}
		if(piece.equals("R")){
			ans = '\u2656';
		}
		if(piece.equals("b")){
			ans = '\u265D';
		}
		if(piece.equals("B")){
			ans = '\u2657';
		}
		if(piece.equals("n")){
			ans = '\u265E';
		}
		if(piece.equals("N")){
			ans = '\u2658';
		}
		return ans;
	}

	public static void printOutBoard(char[][] data){
		for(int y = 0; y < 8; y++){
			String line = "";
			for(int x = 0; x < 8; x++){
				line += data[y][x] + " ";
			}
			System.out.println(line);
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter Filename");
		System.out.println("(If The File Does Not Exist It Will Create a New File For You)");
		Scanner inptFileName = new Scanner(System.in);
		Chessboard chess =  new Chessboard();
		String filename = inptFileName.nextLine();
		chess.loadGame(filename);
		int turn = 0;
		boolean running = true;
		String[][] board = chess.getData();
		char[][] data = new char[8][8];
		for(int y = 0; y < 8; y++){
			for(int x = 0; x < 8; x++){
				char inpt = Chess.convertIntoPiece(board[y][x]);
				data[y][x] = inpt;
			}
		}
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		while(running){
			if (turn == 0){
				System.out.println("White's Turn");
			}
			if(turn == 1){
				System.out.println("Black's Turn");
			}
			Chess.printOutBoard(data);
		}
	}
}
