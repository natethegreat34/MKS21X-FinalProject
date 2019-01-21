import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
public class ChessDriver{
  public static void main(String[] args) throws FileNotFoundException{

    Chessboard chess = new Chessboard();
    chess.loadGame("file3");
    System.out.println(chess);
    chess.loadGame("file3");
    System.out.println(chess);
    /*
    System.out.println(chess);
    chess.move(2,1,2,3);
    System.out.println(chess);
    chess.move(2,3,2,4);
    System.out.println(chess);
    chess.move(2,4,2,5);
    System.out.println(chess);
    chess.move(2,5,2,6);
    System.out.println(chess);
    chess.move(2,6,2,7);
    System.out.println(chess);


    /*
    chess.returnData(0,7);
    chess.move(0,7,0,5);
    chess.returnData(0,5);
    System.out.println(chess.getSquare(0,5).getPiece().getMoved2());
    chess.move(0,5,0,4);
    System.out.println(chess);
    System.out.println(chess.getSquare(0,4).getPiece().getMoved2());
    /*
    System.out.println(chess.printBlackMoves());
    System.out.println(chess.printWhiteMoves());
    chess.returnData(4,7);
    System.out.println(chess);
    chess.move(4,7,6,7);
    System.out.println(chess);
    System.out.println(chess.getSquare(6,7).getPiece().getMoveNumber());
    System.out.println(chess.getSquare(5,7).getPiece().getMoveNumber());
    /*
    chess.newGame("test2");
    System.out.println(chess);
    System.out.println(chess.move(3, 7, 2, 6));
    System.out.println(chess);
    chess.printAllData();
    */
    /*
    chess.newGame("save1");
    System.out.println(chess);
    System.out.println("White In Check: " + chess.checkOnWhiteKing());
    System.out.println("Black In Check: " + chess.checkOnBlackKing());
    System.out.println(chess.move(5, 6, 5, 5));
    System.out.println(chess);
    System.out.println("White In Check: " + chess.checkOnWhiteKing());
    System.out.println("Black In Check: " + chess.checkOnBlackKing());
    System.out.println(chess.move(4, 1, 4, 3));
    System.out.println(chess);
    System.out.println("White In Check: " + chess.checkOnWhiteKing());
    System.out.println("Black In Check: " + chess.checkOnBlackKing());
    System.out.println(chess.move(6, 6, 6, 4));
    System.out.println(chess);
    System.out.println("White In Check: " + chess.checkOnWhiteKing());
    System.out.println("Black In Check: " + chess.checkOnBlackKing());
    System.out.println(chess.move(3, 0, 7, 4));
    System.out.println(chess);
    System.out.println("White In Check: " + chess.checkOnWhiteKing());
    System.out.println("Black In Check: " + chess.checkOnBlackKing());
    chess.saveGame();
    chess.newGame("save2");
    System.out.println(chess);
    System.out.println("White In Check: " + chess.checkOnWhiteKing());
    System.out.println("Black In Check: " + chess.checkOnBlackKing());
    chess.loadGame("save1");
    System.out.println(chess);
    System.out.println("White In Check: " + chess.checkOnWhiteKing());
    System.out.println("Black In Check: " + chess.checkOnBlackKing());
    //chess.printAllData();
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
