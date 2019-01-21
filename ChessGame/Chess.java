import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
public class Chess{
	//------------------------------------------------------------------------------



  //==============================================================================
	private static boolean noBlackKing(String[][] data){
		for (int y = 0; y < data.length; y++){
      for (int x = 0; x < data[y].length; x++){
				if(data[y][x].equals("k")){
					return false;
				}
			}
		}
		return true;
	}
	//------------------------------------------------------------------------------



  //==============================================================================
	private static boolean noWhiteKing(String[][] data){
		for (int y = 0; y < data.length; y++){
      for (int x = 0; x < data[y].length; x++){
				if(data[y][x].equals("K")){
					return false;
				}
			}
		}
		return true;
	}
	//------------------------------------------------------------------------------



  //==============================================================================
	private static String convertIntoPiece(String piece){
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
	public static String toString(String[][] data){
		String ans = "";
    for (int y = 0; y < data.length; y++){
      String line = "";
      for (int x = 0; x < data[y].length; x++){
        line += data[y][x] + " ";
      }
      line += "\n";
      ans += line;
    }
    return ans;
	}
	//------------------------------------------------------------------------------



  //==============================================================================

	public static void main(String[] args) {
		System.out.println("Enter Filename");
		System.out.println("(If The File Does Not Exist It Will Create a New File For You)");
		Scanner inptFileName = new Scanner(System.in);
		Chessboard chess =  new Chessboard();
		String filename = inptFileName.nextLine();
		String mode = "Blitz";
		chess.loadGame(filename);
		int turn = 0;
		boolean running = true;
		String[][] data = new String[10][10];
		data[0][0] = " ";
		data[0][1] = "a";
		data[0][2] = "b";
		data[0][3] = "c";
		data[0][4] = "d";
		data[0][5] = "e";
		data[0][6] = "f";
		data[0][7] = "g";
		data[0][8] = "h";
		data[1][0] = "8";
		data[2][0] = "7";
		data[3][0] = "6";
		data[4][0] = "5";
		data[5][0] = "4";
		data[6][0] = "3";
		data[7][0] = "2";
		data[8][0] = "1";
		data[9][0] = " ";
		data[0][9] = " ";
		data[9][1] = "a";
		data[9][2] = "b";
		data[9][3] = "c";
		data[9][4] = "d";
		data[9][5] = "e";
		data[9][6] = "f";
		data[9][7] = "g";
		data[9][8] = "h";
		data[1][9] = "8";
		data[2][9] = "7";
		data[3][9] = "6";
		data[4][9] = "5";
		data[5][9] = "4";
		data[6][9] = "3";
		data[7][9] = "2";
		data[8][9] = "1";
		data[9][9] = " ";

		for(int c = 1; c < 9; c++){
			for(int r = 1; r < 9; r++){
				String inpt = Chess.convertIntoPiece(chess.getData()[c - 1][r - 1]);
				data[c][r] = inpt;
			}
		}


		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		while(running){
			String letters = "abcdefgh";
			int xCor = 0;
			int yCor = 0;
			int x = 0;
			int y = 0;
			if (turn == 0){
				System.out.println("White's Turn");
				System.out.println("Type 'exit' anytime if you want to stop");
				System.out.println("(It will auto save after each move)");
				System.out.println("White King in Check:" + chess.checkOnWhiteKing());
				System.out.println("Black King in Check:" + chess.checkOnBlackKing());
				System.out.println(Chess.toString(data));
				System.out.println("Give x Coordinate of Piece You Want To Move");
				System.out.println("a -> h");
				Scanner inpt1 = new Scanner(System.in);
				if(inpt1.hasNext("[abcdefgh]")){
					String letter = inpt1.next();
					int num = -1;
					boolean found = false;
					for(int i = 0; !found && i < 8; i++){
						if(letters.substring(i,i+1).equals(letter)) {
							num = i;
							found = true;
						}
					}
					xCor = num;
					System.out.println("Give y Coordinate of Piece You Want To Move");
					System.out.println("8");
					System.out.println("^");
					System.out.println("|");
					System.out.println("1");
					Scanner inpt2 = new Scanner(System.in);
					if(inpt2.hasNextInt()){
						yCor = 8 - inpt2.nextInt();
						System.out.println("Give x Coordinate of Where You Want To Move");
						System.out.println("a -> h");
						Scanner inpt3 = new Scanner(System.in);
						if(inpt3.hasNext("[abcdefgh]")){
							String letter1 = inpt3.next();
							int num1 = -1;
							boolean found1 = false;
							for(int i = 0; !found1 && i < 8; i++){
								if(letters.substring(i, i+1).equals(letter1)){
									num1 = i;
									found1 = true;
								}
							}
							x = num1;
							System.out.println("Give y Coordinate of Piece You Want To Move");
							System.out.println("8");
							System.out.println("^");
							System.out.println("|");
							System.out.println("1");
							Scanner inpt4 = new Scanner(System.in);
							if(inpt4.hasNextInt()){
								y = 8 - inpt4.nextInt();
								if(chess.move(xCor,yCor,x,y)){
									if(mode.equals("Blitz")){
										if(Chess.noWhiteKing(chess.getData())){
											System.out.println("BLACK WINS!!!");
											running = false;
										}
										if(Chess.noBlackKing(chess.getData())){
											System.out.println("WHITE WINS!!!");
											running = false;
										}
									}
									for(int c = 1; c < 9; c++){
										for(int r = 1; r < 9; r++){
											String inpt = Chess.convertIntoPiece(chess.getData()[c - 1][r - 1]);
											data[c][r] = inpt;
										}
									}
									System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
									System.out.println("Move Successfull");
									chess.saveGame();
									turn = 1;
								}
								else{
									System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
									chess.move(xCor,yCor,x,y);
									System.out.println("Move Failed");
								}
							}
							else{
								if(inpt4.hasNext("exit")){
									running = false;
								}
							}
						}
						else{
							if(inpt3.hasNext("exit")){
								running = false;
							}
						}
					}
					else{
						if(inpt2.hasNext("exit")){
							running = false;
						}
					}
				}
				else{
					if(inpt1.hasNext("exit")){
						running = false;
					}
				}
			}


			if(turn == 1){
				System.out.println("Black's Turn");
				System.out.println("Type 'exit' anytime if you want to stop");
				System.out.println("(It will auto save after each move)");
				System.out.println("White King in Check:" + chess.checkOnWhiteKing());
				System.out.println("Black King in Check:" + chess.checkOnBlackKing());
				System.out.println(Chess.toString(data));
				System.out.println("Give x Coordinate of Piece You Want To Move");
				System.out.println("a -> h");
				Scanner inpt1 = new Scanner(System.in);
				if(inpt1.hasNext("[abcdefgh]")){
					String letter = inpt1.next();
					int num = -1;
					boolean found = false;
					for(int i = 0; !found && i < 8; i++){
						if(letters.substring(i, i+1).equals(letter)){
							num = i;
							found = true;
						}
					}
					xCor = num;
					System.out.println("Give y Coordinate of Piece You Want To Move");
					System.out.println("8");
					System.out.println("^");
					System.out.println("|");
					System.out.println("1");
					Scanner inpt2 = new Scanner(System.in);
					if(inpt2.hasNextInt()){
						yCor = 8 - inpt2.nextInt();
						System.out.println("Give x Coordinate of Where You Want To Move");
						System.out.println("a -> h");
						Scanner inpt3 = new Scanner(System.in);
						if(inpt3.hasNext("[abcdefgh]")){
							String letter1 = inpt3.next();
							int num1 = -1;
							boolean found1 = false;
							for(int i = 0; !found1 && i < 8; i++){
								if(letters.substring(i, i+1).equals(letter1)){
									num1 = i;
									found1 = true;
								}
							}
							x = num1;
							System.out.println("Give y Coordinate of Piece You Want To Move");
							System.out.println("8");
							System.out.println("^");
							System.out.println("|");
							System.out.println("1");
							Scanner inpt4 = new Scanner(System.in);
							if(inpt4.hasNextInt()){
								y = 8 - inpt4.nextInt();
								if(chess.move(xCor,yCor,x,y)){
									if(mode.equals("Blitz")){
										if(Chess.noWhiteKing(chess.getData())){
											System.out.println("BLACK WINS!!!");
											running = false;
										}
										if(Chess.noBlackKing(chess.getData())){
											System.out.println("WHITE WINS!!!");
											running = false;
										}
									}
									for(int c = 1; c < 9; c++){
										for(int r = 1; r < 9; r++){
											String inpt = Chess.convertIntoPiece(chess.getData()[c - 1][r - 1]);
											data[c][r] = inpt;
										}
									}
									System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
									System.out.println("Move Successfull");
									chess.saveGame();

									turn = 0;
								}
								else{
									System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
									chess.move(xCor,yCor,x,y);
									System.out.println("Move Failed");
								}
							}
							else{
								if(inpt4.hasNext("exit")){
									running = false;
								}
							}
						}
						else{
							if(inpt3.hasNext("exit")){
								running = false;
							}
						}
					}
					else{
						if(inpt2.hasNext("exit")){
							running = false;
						}
					}
				}
				else{
					if(inpt1.hasNext("exit")){
						running = false;
					}
				}
			}
		}
	}
}
