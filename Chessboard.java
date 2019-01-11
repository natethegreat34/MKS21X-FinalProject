import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Chessboard{
  private Square[][] data;
  public Chessboard(){
    data = new Square[8][8];
    for (int y = 0; y < data.length; y++){
      for (int x = 0; x < data[y].length; x++){
        Square empty = new Square (x,y);
        data[y][x] = empty;
      }
    }
  }
  public void fillBoard(String filename) throws FileNotFoundException{
    File f = new File(filename);
    Scanner in = new Scanner(f);
    for (int y = 0; y < data.length; y++){
      for (int x = 0; x < data[y].length; x++){
        //read the next letter from the file
        String piece = in.next();
        //if it is a black Pawn
        if (piece.equals("bp")){
          Square slot = new Square(x, y);
          Pawn pawn = new Pawn(x, y, "black", 0);
          slot.setPiece(pawn);
          data[y][x] = slot;
        }
        //if it is a black Bishop
        if (piece.equals("bb")){
          Square slot = new Square(x, y);
          Bishop bishop = new Bishop(x, y, "black");
          slot.setPiece(bishop);
          data[y][x] = slot;
        }
        //if it is a black Knight
        if (piece.equals("bn")){
          Square slot = new Square(x, y);
          Knight knight = new Knight(x, y, "black");
          slot.setPiece(knight);
          data[y][x] = slot;
        }
        //if it is a black Rook
        if (piece.equals("br")){
          Square slot = new Square(x, y);
          Rook rook = new Rook(x, y, "black");
          slot.setPiece(rook);
          data[y][x] = slot;
        }
        //if it is a black Queen
        if (piece.equals("bq")){
          Square slot = new Square(x, y);
          Queen queen = new Queen(x, y, "black");
          slot.setPiece(queen);
          data[y][x] = slot;
        }
        //if it is a black King
        if (piece.equals("bk")){
          Square slot = new Square(x, y);
          King king = new King(x, y, "black");
          limitPiece(king);
          slot.setPiece(king);
          data[y][x] = slot;
        }
        //if it is a white pawn
        if (piece.equals("wp")){
          Square slot = new Square(x, y);
          Pawn pawn = new Pawn(x, y, "white", 1);
          slot.setPiece(pawn);
          data[y][x] = slot;
        }
        //if it is a white Bishop
        if (piece.equals("wb")){
          Square slot = new Square(x, y);
          Bishop bishop = new Bishop(x, y, "white");
          slot.setPiece(bishop);
          data[y][x] = slot;
        }
        //if it is a white Knight
        if (piece.equals("wn")){
          Square slot = new Square(x, y);
          Knight knight = new Knight(x, y, "white");
          slot.setPiece(knight);
          data[y][x] = slot;
        }
        //if it is a white Rook
        if (piece.equals("wr")){
          Square slot = new Square(x, y);
          Rook rook = new Rook(x, y, "white");
          slot.setPiece(rook);
          data[y][x] = slot;
        }
        //if it is a white Queen
        if (piece.equals("wq")){
          Square slot = new Square(x, y);
          Queen queen = new Queen(x, y, "white");
          slot.setPiece(queen);
          data[y][x] = slot;
        }
        //if it is a white King
        if (piece.equals("wk")){
          Square slot = new Square(x, y);
          King king = new King(x, y, "white");
          slot.setPiece(king);
          data[y][x] = slot;
        }
      }
    }
  }

  //limits the possible moves of all pieces based on situation
  public void limitPiece(Piece inpt){
    String[][] ans = inpt.getData();
    int xCor = inpt.getX();
    int yCor = inpt.getY();
    // v
    boolean delete = false;
    for (int i = 0; yCor+ i < 8; i ++){
      if(!delete){
        if (ans[yCor + i][xCor] != null){
          if (!(data[yCor + i][xCor].isEmpty())){
            if (data[yCor + i][xCor].getPiece().getColor().equals(inpt.getColor())){
              ans[yCor + i][xCor] = null;
              delete = true;
            }
            else{
              ans[yCor + i][xCor] = "x";
              delete = true;
            }
          }
        }
      }
      else{
        ans[yCor + i][xCor] = null;
      }
    }
    delete = false;
    // ^
    for (int i = 0; yCor - i >= 0; i ++){
      if(!delete){
        if (ans[yCor - i][xCor] != null){
          if (!(data[yCor - i][xCor].isEmpty())){
            if (data[yCor - i][xCor].getPiece().getColor().equals(inpt.getColor())){
              ans[yCor - i][xCor] = null;
              delete = true;
            }
            else{
              ans[yCor - i][xCor] = "x";
              delete = true;
            }
          }
        }
      }
      else{
        ans[yCor - i][xCor] = null;
      }
    }
    delete = false;
    // <
    for (int i = 0; xCor - i >= 0; i ++){
      if(!delete){
        if (ans[yCor][xCor - i] != null){
          if (!(data[yCor][xCor - i].isEmpty())){
            if (data[yCor][xCor - i].getPiece().getColor().equals(inpt.getColor())){
              ans[yCor][xCor - i] = null;
              delete = true;
            }
            else{
              ans[yCor][xCor - i] = "x";
              delete = true;
            }
          }
        }
      }
      else{
        ans[yCor][xCor - i] = null;
      }
    }
    delete = false;
    // >
    for (int i = 0; xCor + i < 8; i ++){
      if(!delete){
        if (ans[yCor][xCor + i] != null){
          if (!(data[yCor][xCor + i].isEmpty())){
            if (data[yCor][xCor + i].getPiece().getColor().equals(inpt.getColor())){
              ans[yCor][xCor + i] = null;
              delete = true;
            }
            else{
              ans[yCor][xCor + i] = "x";
              delete = true;
            }
          }
        }
      }
      else{
        ans[yCor][xCor + i] = null;
      }
    }
    delete = false;
    for (int i = 0; xCor + i < 8 && yCor- i >= 0; i ++){
      if(!delete){
        if (ans[yCor - i][xCor + i] != null){
          if (!(data[yCor - i][xCor + i].isEmpty())){
            if (data[yCor - i][xCor + i].getPiece().getColor().equals(inpt.getColor())){
              ans[yCor - i][xCor + i] = null;
              delete = true;
            }
            else{
              ans[yCor - i][xCor + i] = "x";
              delete = true;
            }
          }
        }
      }
      else{
        ans[yCor - i][xCor + i] = null;
      }
    }
    delete = false;
    // <\
    for (int i = 0; xCor- i >= 0 && yCor- i >= 0; i ++){
      if(!delete){
        if (ans[yCor][xCor - i] != null){
          if (!(data[yCor - i][xCor - i].isEmpty())){
            if (data[yCor - i][xCor - i].getPiece().getColor().equals(inpt.getColor())){
              ans[yCor - i][xCor - i] = null;
              delete = true;
            }
            else{
              ans[yCor - i][xCor - i] = "x";
              delete = true;
            }
          }
        }
      }
      else{
        ans[yCor - i][xCor - i] = null;
      }
    }
    delete = false;
    // >\
    for (int i = 0; xCor+ i < 8 && yCor+ i < 8; i ++){
      if(!delete){
        if (ans[yCor + i][xCor + i] != null){
          if (!(data[yCor + i][xCor + i].isEmpty())){
            if (data[yCor + i][xCor + i].getPiece().getColor().equals(inpt.getColor())){
              ans[yCor + i][xCor + i] = null;
              delete = true;
            }
            else{
              ans[yCor + i][xCor + i] = "x";
              delete = true;
            }
          }
        }
      }
      else{
        ans[yCor + i][xCor + i] = null;
      }
    }
    delete = false;
    // </
    for (int i = 0; xCor- i >= 0 && yCor+ i < 8; i ++){
      if(!delete){
        if (ans[yCor + i][xCor - i] != null){
          if (!(data[yCor + i][xCor - i].isEmpty())){
            if (data[yCor + i][xCor - i].getPiece().getColor().equals(inpt.getColor())){
              ans[yCor + i][xCor - i] = null;
              delete = true;
            }
            else{
              ans[yCor + i][xCor - i] = "x";
              delete = true;
            }
          }
        }
      }
      else{
        ans[yCor + i][xCor - i] = null;
      }
    }
    delete = false;
    inpt.setData(ans);
  }

  public Square getSquare(int x, int y){
    return data[y][x];
  }

  public boolean move(int xCor, int yCor, int x, int y){
    Piece inpt = getSquare(xCor, yCor).getPiece();
    String[][] possibleMoves = inpt.getData();
    if (possibleMoves[y][x]!=null){
      if (possibleMoves[y][x].equals("o")){
        data[inpt.getY()][inpt.getX()].removePiece();
        data[y][x].setPiece(inpt);
        return true;
      }
    }
    return false;
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
    for (int y = 0; y < data.length; y++){
      String line = "";
      for (int x = 0; x < data[y].length; x++){
        if(data[y][x].isEmpty()){
          line += "_ ";
        }
        else{
          line += data[y][x].getPiece().getType() + " ";
        }
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
