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
		chess.loadGame(filename);
		int turn = 0;
		boolean running = true;
		String[][] data = new String[9][9];
		data[0][0] = " ";
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
				System.out.println("Type 'exit' anytime if you want to stop");
				System.out.println("(It will auto save after each move)");
				System.out.println("White King in Check:" + chess.checkOnWhiteKing());
				System.out.println("Black King in Check:" + chess.checkOnBlackKing());
				System.out.println(Chess.toString(data));
				System.out.println("Give x Coordinate of Piece You Want To Move");
				System.out.println("0 -> 7");
				Scanner inpt1 = new Scanner(System.in);
				if(inpt1.nextLine().equals("exit")){
					running = false;
				}
				else{
					if(inpt1.hasNextInt()){
						xCor = inpt1.nextInt();
					}
					System.out.println("Give y Coordinate of Piece You Want To Move");
					System.out.println("0");
					System.out.println("|");
					System.out.println("V");
					System.out.println("7");
					Scanner inpt2 = new Scanner(System.in);
					if(inpt2.nextLine().equals("exit")){
						running = false;
					}
					else{
						if(inpt2.hasNextInt()){
							xCor = inpt2.nextInt();
						}
						System.out.println("Give x Coordinate of Where You Want To Move");
						System.out.println("0 -> 7");
						Scanner inpt3 = new Scanner(System.in);
						if(inpt3.nextLine().equals("exit")){
							running = false;
						}
						else{
							if(inpt3.hasNextInt()){
								xCor = inpt3.nextInt();
							}
							System.out.println("Give y Coordinate of Piece You Want To Move");
							System.out.println("0");
							System.out.println("|");
							System.out.println("V");
							System.out.println("7");
							Scanner inpt4 = new Scanner(System.in);
							if(inpt4.nextLine().equals("exit")){
								running = false;
							}
							else{
								if(inpt4.hasNextInt()){
									xCor = inpt4.nextInt();
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
									System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
									chess.move(xCor,yCor,x,y);
									System.out.println("Move Failed");
								}
							}
						}
					}
				}
			}


			if(turn == 1){
				System.out.println("Blacks's Turn");
				System.out.println("Type 'exit' anytime if you want to stop");
				System.out.println("(It will auto save after each move)");
				System.out.println("White King in Check:" + chess.checkOnWhiteKing());
				System.out.println("Black King in Check:" + chess.checkOnBlackKing());
				System.out.println(Chess.toString(data));
				System.out.println("Give x Coordinate of Piece You Want To Move");
				System.out.println("0 -> 7");
				Scanner inpt1 = new Scanner(System.in);
				if(inpt1.nextLine().equals("exit")){
					running = false;
				}
				else{
					if(inpt1.hasNextInt()){
						xCor = inpt1.nextInt();
					}
					System.out.println("Give y Coordinate of Piece You Want To Move");
					System.out.println("0");
					System.out.println("|");
					System.out.println("V");
					System.out.println("7");
					Scanner inpt2 = new Scanner(System.in);
					if(inpt2.nextLine().equals("exit")){
						running = false;
					}
					else{
						if(inpt2.hasNextInt()){
							xCor = inpt2.nextInt();
						}
						System.out.println("Give x Coordinate of Where You Want To Move");
						System.out.println("0 -> 7");
						Scanner inpt3 = new Scanner(System.in);
						if(inpt3.nextLine().equals("exit")){
							running = false;
						}
						else{
							if(inpt3.hasNextInt()){
								xCor = inpt3.nextInt();
							}
							System.out.println("Give y Coordinate of Piece You Want To Move");
							System.out.println("0");
							System.out.println("|");
							System.out.println("V");
							System.out.println("7");
							Scanner inpt4 = new Scanner(System.in);
							if(inpt4.nextLine().equals("exit")){
								running = false;
							}
							else{
								if(inpt4.hasNextInt()){
									xCor = inpt4.nextInt();
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
									turn = 0;
								}
								else{
									System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
									chess.move(xCor,yCor,x,y);
									System.out.println("Move Failed");
								}
							}
						}
					}
				}
			}
		}
	}
}
