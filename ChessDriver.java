import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ChessDriver{
  public static void main(String[] args) throws FileNotFoundException{
    Chessboard chess = new Chessboard();
    chess.fillBoard("file1.txt");
    System.out.println(chess);
    System.out.println(chess.move(1, 0, 1, 1));
    System.out.println(chess);
  }
}
