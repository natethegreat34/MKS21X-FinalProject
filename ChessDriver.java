import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
public class ChessDriver{
  public static void main(String[] args) throws FileNotFoundException{
    Chessboard chess = new Chessboard();
    chess.newGame();
    System.out.println(chess);
    System.out.println(chess.move(5, 6, 5, 5));
    System.out.println(chess);
    System.out.println(chess.move(4, 1, 4, 3));
    System.out.println(chess);
    System.out.println(chess.move(6, 6, 6, 4));
    System.out.println(chess);
    System.out.println(chess.move(3, 0, 7, 4));
    System.out.println(chess);
    System.out.println("In Check: " + chess.checkOnWhiteKing());
    chess.saveGame();
    /*
    chess.fill();
    System.out.println(chess);
    chess.move(4, 6, 4, 4);
    System.out.println(chess);
    */
    /*
    chess.fillBoard("file1.txt");
    System.out.println(chess);
    System.out.println("Should Return True: " + chess.checkOnWhiteKing());
    System.out.println(chess.move(3,0,4,0));
    System.out.println(chess);
    System.out.println("Should Return False: " + chess.checkOnWhiteKing());
    /*
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
    */
    /*
    chess.fillBoard("file2.txt");
    System.out.println(chess);
    System.out.println(chess.move(3,0,4,2));
    System.out.println(chess);
    System.out.println(chess.move(4,2,5,0));
    System.out.println(chess);
    */
  }
}
