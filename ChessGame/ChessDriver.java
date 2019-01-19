import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ChessDriver{
  public static void main(String[] args) throws FileNotFoundException{
    Chessboard chess = new Chessboard();
    chess.loadGame(file1);
    System.out.println(chess);
    chess.printAllData();
  }
}
