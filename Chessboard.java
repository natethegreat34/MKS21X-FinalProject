import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Chessboard{
  private Square[][] data;
  public Chessboard(String filename) throws FileNotFoundException{
    data = new Square[8][8];
    File f = new File(filename);
    Scanner in = new Scanner(f);
    for (int x = 0; x < data.length; x++){
      for (int y = 0; y < data[x].length; y++){
        //read the next letter from the file
        String piece = in.next();
        //if it is a black Pawn
        if (piece.equals("bp")){
          Square slot = new Square();
          Pawn pawn = new Pawn(x, y, "black");
          slot.setPiece(pawn);
          data[x][y] = slot;
        }
        /*
        //if it is a black Bishop
        if (piece.equals("bb")){
          Square slot = new Square();
          Piece bishop = new Bishop(x, y, "black");
          slot.setPiece(bishop);
          data[x][y] = slot;
        }
        //if it is a black Knight
        if (piece.equals("bn")){
          Square slot = new Square();
          Piece knight = new Knight(x, y, "black");
          slot.setPiece(knight);
          data[x][y] = slot;
        }
        //if it is a black Rook
        if (piece.equals("br")){
          Square slot = new Square();
          Piece rook = new Rook(x, y, "black");
          slot.setPiece(rook);
          data[x][y] = slot;
        }
        //if it is a black Queen
        if (piece.equals("bq")){
          Square slot = new Square();
          Piece queen = new Queen(x, y, "black");
          slot.setPiece(queen);
          data[x][y] = slot;
        }
        //if it is a black King
        if (piece.equals("bk")){
          Square slot = new Square();
          Piece king = new King(x, y, "black");
          slot.setPiece(king);
          data[x][y] = slot;
        }
        */
        //if it is a white pawn
        if (piece.equals("wp")){
          Square slot = new Square();
          Piece pawn = new Pawn(x, y, "white");
          slot.setPiece(pawn);
          data[x][y] = slot;
        }
        /*
        //if it is a white Bishop
        if (piece.equals("wb")){
          Square slot = new Square();
          Piece bishop = new Bishop(x, y, "white");
          slot.setPiece(bishop);
          data[x][y] = slot;
        }
        //if it is a white Knight
        if (piece.equals("wn")){
          Square slot = new Square();
          Piece knight = new Knight(x, y, "white");
          slot.setPiece(knight);
          data[x][y] = slot;
        }
        //if it is a white Rook
        if (piece.equals("wr")){
          Square slot = new Square();
          Piece rook = new Rook(x, y, "white");
          slot.setPiece(rook);
          data[x][y] = slot;
        }
        //if it is a white Queen
        if (piece.equals("wq")){
          Square slot = new Square();
          Piece queen = new Queen(x, y, "white");
          slot.setPiece(queen);
          data[x][y] = slot;
        }
        //if it is a white King
        if (piece.equals("wk")){
          Square slot = new Square();
          Piece king = new King(x, y, "white");
          slot.setPiece(king);
          data[x][y] = slot;
        }
        */
      }
    }
  }
  /*
  public String[][] possibleMoves(int x, int y, String[][] moveList){
    String[][] ans = new String[8][8];
    int greatestX = 0;
    int greatestY = 0;
    for (int x1 = x; x < moveList.length; x++){
      for (int y1 = y; y < moveList[x].length; y++){
        if (moveList[x][y].equals("o")){

        }
      }
    }
    return ans;
  }
  // public boolean canMove(Piece noob, int x, int y){
  //   for (int x = 0; x < possibleMoves.length; x++){
  //     if (x == x1){
  //       if (possiblemoves[x][1] == y1){
  //         if (data[x1][y1].isEmpty() ||
  //       }
  //     }
  //   }
  // }
  public boolean move(int x1, int y1, int x2, int y2){
    Piece movePiece = data[x1][y1].getPiece();
    String[][] allMoves = movePiece.getMoveList();
    String[][] possibleMovesList = possibleMoves(x1, y1, allMoves);
    if(possibleMovesList[x2][y2].equals("o")){
      data[x1][y1].removePiece();
    }
  }
*/
  public String toString(){
    String ans = "";
    for (int x = 0; x < data.length; x++){
      String line = "";
      for (int y = 0; y < data[x].length; y++){
        line += data[x][y].getPiece().getType() + " ";
      }
      line += "\n";
      ans += line;
    }
    return ans;
  }

//for the possibleMoves method, it will use the loops from the classes and just perform them all and then check the first instances of
//blocking pieces and pieces to be taken

//Pawn
//y + 1
// y+1, x+1

  //Knight
  //x + 2, y + 1
  //x - 2, y + 1
  //x + 1, y + 2
  //x - 1, y + 2
  //x + 2, y - 1
  //x - 2, y - 1
  //x + 1, y - 2
  //x - 1, y - 2
  //Bishop
  //for going / x - y = z; (x+-i)-(y+-i) = z
  // for going \ x + y = z; (x+-i)+(y+-i) = z
  //Rook
  //8 > x+i
  //0<=x-i
  //8 > y+i
  //0<=y-i

  //make string Chessboard as save and then read it through

}
