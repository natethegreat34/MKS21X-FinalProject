import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ChessDriver{
  public static void main(String[] args) throws FileNotFoundException{
    Chessboard chess = new Chessboard();
    /*
    chess.fill();
    System.out.println(chess);
    chess.move(4, 6, 4, 4);
    System.out.println(chess);
    */
    chess.fillBoard("file1.txt");
    System.out.println(chess);
    System.out.println(chess.move(1, 0, 1, 1));
    System.out.println(chess);
    System.out.println(chess.move(1, 1, 2, 3));
    System.out.println(chess);
    System.out.println(chess.move(1, 1, 1, 2));
    System.out.println(chess);
    System.out.println(chess.move(3, 0, 2, 1));
    System.out.println(chess);
    System.out.println(chess.move(2, 1, 1, 2));
    System.out.println(chess);
    System.out.println(chess.move(1, 2, 1, 3));
    System.out.println(chess);
  }
}
