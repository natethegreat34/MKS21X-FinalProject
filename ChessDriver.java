import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ChessDriver{
  public static void main(String[] args) throws FileNotFoundException{
    Chessboard chess = new Chessboard("file1.txt");
    System.out.println(chess);
  }
}
