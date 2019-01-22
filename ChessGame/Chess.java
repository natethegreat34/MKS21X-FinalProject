import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Set;
public class Chess{
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	//------------------------------------------------------------------------------



  //==============================================================================
	private static boolean noBlackKing(String[][] data){
		for (int y = 0; y < data.length; y++){
      for (int x = 0; x < data[y].length; x++){
				if(data[y][x] != null){
					if(data[y][x].equals("k")){
						return false;
					}
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
				if(data[y][x] != null){
					if(data[y][x].equals("K")){
						return false;
					}
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
			ans = ANSI_BLACK + '\u265F' + "" + ANSI_RESET;
		}
		if(piece.equals("P")){
			ans = ANSI_WHITE + '\u2659' + "" + ANSI_RESET;
		}
		if(piece.equals("k")){
			ans = ANSI_BLACK + '\u265A' + "" + ANSI_RESET;
		}
		if(piece.equals("K")){
			ans = ANSI_WHITE + '\u2654' + "" + ANSI_RESET;
		}
		if(piece.equals("q")){
			ans = ANSI_BLACK + '\u265B' + "" + ANSI_RESET;
		}
		if(piece.equals("Q")){
			ans = ANSI_WHITE + '\u2655' + "" + ANSI_RESET;
		}
		if(piece.equals("r")){
			ans = ANSI_BLACK + '\u265C' + "" + ANSI_RESET;
		}
		if(piece.equals("R")){
			ans = ANSI_WHITE + '\u2656' + "" + ANSI_RESET;
		}
		if(piece.equals("b")){
			ans = ANSI_BLACK + '\u265D' + "" + ANSI_RESET;
		}
		if(piece.equals("B")){
			ans = ANSI_WHITE + '\u2657' + "" + ANSI_RESET;
		}
		if(piece.equals("n")){
			ans = ANSI_BLACK + '\u265E' + "" + ANSI_RESET;
		}
		if(piece.equals("N")){
			ans = ANSI_WHITE + '\u2658' + "" + ANSI_RESET;
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
		HashSet<String> modes = new HashSet<String>();
		modes.add("Blitz");
		modes.add("Pawn");
		System.out.println("Please Select A Mode");
		System.out.println("Blitz	/	Pawn");
		Scanner inptMode = new Scanner(System.in);
		while(!inptMode.hasNext("Blitz|Pawn")){
			System.out.println("Not a mode");
			inptMode.next();
		}
		String mode = inptMode.next();
		System.out.println("Enter Filename");
		System.out.println("(If The File Does Not Exist It Will Create a New File For You)");
		Scanner inptFileName = new Scanner(System.in);
		Chessboard chess =  new Chessboard(mode);
		String filename = inptFileName.nextLine();
		if(mode.equals("Blitz")){
			chess.loadGame(filename);
		}
		if(mode.equals("Pawn")){
			chess.loadGame(filename);
		}
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
				if(chess.getMode().equals("Blitz")){
					if(Chess.noWhiteKing(chess.getData())){
						System.out.println("BLACK WINS!!!");
						running = false;
					}
					if(Chess.noBlackKing(chess.getData())){
						System.out.println("WHITE WINS!!!");
						running = false;
					}
				}
				if (chess.getMode().equals("Pawn")){
					if(chess.noWhites()){
						System.out.println("BLACK WINS!!!");
						running = false;
					}
					if(chess.noBlacks()){
						System.out.println("WHITE WINS!!!");
						running = false;
					}
				}
				if(running){
					if (chess.getMode().equals("Pawn")){
						if(chess.noWhites()){
							System.out.println("BLACK WINS!!!");
							running = false;
						}
						if(chess.noBlacks()){
							System.out.println("WHITE WINS!!!");
							running = false;
						}
					}
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
										if(chess.getMode().equals("Blitz")){
											if(Chess.noWhiteKing(chess.getData())){
												System.out.println("BLACK WINS!!!");
												running = false;
											}
											if(Chess.noBlackKing(chess.getData())){
												System.out.println("WHITE WINS!!!");
												running = false;
											}
										}
										if (chess.getMode().equals("Pawn")){
											if(chess.noWhites()){
												System.out.println("BLACK WINS!!!");
												running = false;
											}
											if(chess.noBlacks()){
												System.out.println("WHITE WINS!!!");
												running = false;
											}
										}
										if(running){
											for(int c = 1; c < 9; c++){
												for(int r = 1; r < 9; r++){
													String inpt = Chess.convertIntoPiece(chess.getData()[c - 1][r - 1]);
													data[c][r] = inpt;
												}
											}
											System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
											System.out.println("Move Successful");
											chess.saveGame();
											turn = 1;
										}
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


			if(turn == 1){
				if(chess.getMode().equals("Blitz")){
					if(Chess.noWhiteKing(chess.getData())){
						System.out.println("BLACK WINS!!!");
						running = false;
					}
					if(Chess.noBlackKing(chess.getData())){
						System.out.println("WHITE WINS!!!");
						running = false;
					}
				}
				if (chess.getMode().equals("Pawn")){
					if(chess.noWhites()){
						System.out.println("BLACK WINS!!!");
						running = false;
					}
					if(chess.noBlacks()){
						System.out.println("WHITE WINS!!!");
						running = false;
					}
				}
				if(running){
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
										if(chess.getMode().equals("Blitz")){
											if(Chess.noWhiteKing(chess.getData())){
												System.out.println("BLACK WINS!!!");
												running = false;
											}
											if(Chess.noBlackKing(chess.getData())){
												System.out.println("WHITE WINS!!!");
												running = false;
											}
										}
										if (chess.getMode().equals("Pawn")){
											if(chess.noWhites()){
												System.out.println("BLACK WINS!!!");
												running = false;
											}
											if(chess.noBlacks()){
												System.out.println("WHITE WINS!!!");
												running = false;
											}
										}
										if(running){
											for(int c = 1; c < 9; c++){
												for(int r = 1; r < 9; r++){
													String inpt = Chess.convertIntoPiece(chess.getData()[c - 1][r - 1]);
													data[c][r] = inpt;
												}
											}
											System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
											System.out.println("Move Successful");
											chess.saveGame();
											turn = 0;
										}
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
}
