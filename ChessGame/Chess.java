import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
public class Chess{
	//------------------------------------------------------------------------------



  //==============================================================================
	public static String convertIntoPiece(String piece){
		String ans = "_";
		if (piece == null){
			return ans;
		}
		if(piece.equals("p")){
			ans = '\u265F' + "";
		}
		if(piece.equals("P")){
			ans = '\u2659' + "";
		}
		if(piece.equals("k")){
			ans = '\u265A' + "";
		}
		if(piece.equals("K")){
			ans = '\u2654' + "";
		}
		if(piece.equals("q")){
			ans = '\u265B' + "";
		}
		if(piece.equals("Q")){
			ans = '\u2655' + "";
		}
		if(piece.equals("r")){
			ans = '\u265C' + "";
		}
		if(piece.equals("R")){
			ans = '\u2656' + "";
		}
		if(piece.equals("b")){
			ans = '\u265D' + "";
		}
		if(piece.equals("B")){
			ans = '\u2657' + "";
		}
		if(piece.equals("n")){
			ans = '\u265E' + "";
		}
		if(piece.equals("N")){
			ans = '\u2658' + "";
		}
		return ans;
	}
	//------------------------------------------------------------------------------



  //==============================================================================



	//------------------------------------------------------------------------------



  //==============================================================================
	public static void printOutBoard(String[][] data){
		for(int y = 0; y < 9; y++){
			for(int i = 0; i < 3; i++){
				System.out.print("\t");
			}
			for(int x = 0; x < 9; x++){
				System.out.print(data[y][x] + " ");
			}
			System.out.println(" ");
		}
	}
	//------------------------------------------------------------------------------



  //==============================================================================

	public static void main(String[] args) {
		System.out.println("Enter Filename");
		System.out.println("(If The File Does Not Exist It Will Create a New File For You)");
		Scanner inptFileName = new Scanner(System.in);
		Chessboard chess =  new Chessboard();
		String filename = inptFileName.nextLine();
		chess.loadGame(filename);
		int turn = 0;
		boolean running = true;
		String[][] data = new String[9][9];
		data[0][1] = "0";
		data[0][2] = "1";
		data[0][3] = "2";
		data[0][4] = "3";
		data[0][5] = "4";
		data[0][6] = "5";
		data[0][7] = "6";
		data[0][8] = "7";
		data[1][0] = "0";
		data[2][0] = "1";
		data[3][0] = "2";
		data[4][0] = "3";
		data[5][0] = "4";
		data[6][0] = "5";
		data[7][0] = "6";
		data[8][0] = "7";

		for(int c = 1; c < 9; c++){
			for(int r = 1; r < 9; r++){
				String inpt = Chess.convertIntoPiece(chess.getData()[c - 1][r - 1]);
				data[c][r] = inpt;
			}
		}


		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		while(running){
			int xCor = 0;
			int yCor = 0;
			int x = 0;
			int y = 0;
			if (turn == 0){
				System.out.println("White's Turn");
				System.out.println("Type 'quit' after a move if you want to stop");
				System.out.println("(It will auto save after each move)");
				System.out.println("White King in Check:" + chess.checkOnWhiteKing());
				System.out.println("Black King in Check:" + chess.checkOnBlackKing());
				Chess.printOutBoard(data);
				System.out.println("Give x Coordinate of Piece You Want To Move");
				System.out.println("0 -> 7");
				Scanner inpt1 = new Scanner(System.in);
				if (inpt1.hasNext("exit")){
					running = false;
				}
				else{
					xCor = inpt1.nextInt();
				}
				System.out.println("Give y Coordinate of Piece You Want To Move");
				System.out.println("0");
				System.out.println("|");
				System.out.println("V");
				System.out.println("7");
				Scanner inpt2 = new Scanner(System.in);
				if (inpt2.hasNext("exit")){
					running = false;
				}
				else{
					yCor = inpt2.nextInt();
				}
				System.out.println("Give x Coordinate of Where You Want To Move");
				System.out.println("0 -> 7");
				Scanner inpt3 = new Scanner(System.in);
				if (inpt3.hasNext("exit")){
					running = false;
				}
				else{
					x = inpt3.nextInt();
				}
				System.out.println("Give y Coordinate of Where You Want To Move");
				System.out.println("Give y Coordinate of Piece You Want To Move");
				System.out.println("0");
				System.out.println("|");
				System.out.println("V");
				System.out.println("7");
				Scanner inpt4 = new Scanner(System.in);
				if (inpt4.hasNext("exit")){
					running = false;
				}
				else{
					y = inpt4.nextInt();
				}

				if(chess.move(xCor,yCor,x,y)){
					for(int c = 1; c < 9; c++){
						for(int r = 1; r < 9; r++){
							String inpt = Chess.convertIntoPiece(chess.getData()[c - 1][r - 1]);
							data[c][r] = inpt;
						}
					}
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("Move Successfull");
					chess.saveGame();
					if(chess.checkOnWhiteKing()){
						System.out.println("BLACK WINS!!!");
						running = false;
					}
					if(chess.checkOnBlackKing()){
						System.out.println("WHITE WINS!!!");
						running = false;
					}
					turn = 1;
				}
				else{
					System.out.println("Make Sure Movement is Possible");
				}
			}


			if(turn == 1){
				System.out.println("Black's Turn");
				System.out.println("Type 'quit' after a move if you want to stop");
				System.out.println("(It will auto save after each move)");
				System.out.println("White King in Check:" + chess.checkOnWhiteKing());
				System.out.println("Black King in Check:" + chess.checkOnBlackKing());
				Chess.printOutBoard(data);
				System.out.println("Give x Coordinate of Piece You Want To Move");
				System.out.println("0 -> 7");
				Scanner inpt1 = new Scanner(System.in);
				if (!(inpt1.hasNext("exit"))){
					Scanner sc = new Scanner(inpt1.nextLine());
					if (sc.hasNextInt()){
						xCor = sc.nextInt();
					}
				}
				else{
					running = false;
				}
				System.out.println("Give y Coordinate of Piece You Want To Move");
				System.out.println("0");
				System.out.println("|");
				System.out.println("V");
				System.out.println("7");
				Scanner inpt2 = new Scanner(System.in);
				if (!(inpt2.hasNext("exit"))){
					Scanner sc = new Scanner(inpt2.nextLine());
					if (sc.hasNextInt()){
						yCor = sc.nextInt();
					}
				}
				else{
					running = false;
				}
				System.out.println("Give x Coordinate of Where You Want To Move");
				Scanner inpt3 = new Scanner(System.in);
				if (!(inpt3.hasNext("exit"))){
					Scanner sc = new Scanner(inpt3.nextLine());
					if (sc.hasNextInt()){
						x = sc.nextInt();
					}
				}
				else{
					running = false;
				}
				System.out.println("Give y Coordinate of Where You Want To Move");
				Scanner inpt4 = new Scanner(System.in);
				if (!(inpt4.hasNext("exit"))){
					Scanner sc = new Scanner(inpt4.nextLine());
					if (sc.hasNextInt()){
						y = sc.nextInt();
					}
				}
				else{
					running = false;
				}

				if(chess.move(xCor,yCor,x,y)){
					for(int c = 1; c < 9; c++){
						for(int r = 1; r < 9; r++){
							String inpt = Chess.convertIntoPiece(chess.getData()[c- 1][r - 1]);
							data[c][r] = inpt;
						}
					}
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("Move Successfull");
					chess.saveGame();
					if(chess.checkOnWhiteKing()){
						System.out.println("BLACK WINS!!!");
						running = false;
					}
					if(chess.checkOnBlackKing()){
						System.out.println("WHITE WINS!!!");
						running = false;
					}
					turn = 0;
				}
				else{
					System.out.println("Make Sure Movement is Possible");
				}
			}

		}
	}
}
