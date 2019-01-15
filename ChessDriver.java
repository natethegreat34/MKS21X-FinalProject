import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ChessDriver{
  public static void main(String[] args) throws FileNotFoundException{
    Chessboard chess = new Chessboard();
    chess.fill();
    System.out.println(chess);
    chess.printAllData();
    System.out.println(chess.move(0, 6, 0, 4));
    chess.printAllData();
    System.out.println(chess);
    System.out.println(chess.move(0, 4, 0, 2));
    chess.printAllData();
    System.out.println(chess);
  }
}
