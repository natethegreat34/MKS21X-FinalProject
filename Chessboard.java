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
        if (piece.equals("p")){
          Square slot = new Square(x, y);
          Pawn pawn = new Pawn(x, y, "black", 0);
          limitPiece(pawn);
          slot.setPiece(pawn);
          data[y][x] = slot;
        }
        //if it is a black Bishop
        if (piece.equals("b")){
          Square slot = new Square(x, y);
          Bishop bishop = new Bishop(x, y, "black");
          limitPiece(bishop);
          slot.setPiece(bishop);
          data[y][x] = slot;
        }
        //if it is a black Knight
        if (piece.equals("n")){
          Square slot = new Square(x, y);
          Knight knight = new Knight(x, y, "black");
          limitPiece(knight);
          slot.setPiece(knight);
          data[y][x] = slot;
        }
        //if it is a black Rook
        if (piece.equals("r")){
          Square slot = new Square(x, y);
          Rook rook = new Rook(x, y, "black");
          limitPiece(rook);
          slot.setPiece(rook);
          data[y][x] = slot;
        }
        //if it is a black Queen
        if (piece.equals("q")){
          Square slot = new Square(x, y);
          Queen queen = new Queen(x, y, "black");
          limitPiece(queen);
          slot.setPiece(queen);
          data[y][x] = slot;
        }
        //if it is a black King
        if (piece.equals("k")){
          Square slot = new Square(x, y);
          King king = new King(x, y, "black");
          limitPiece(king);
          slot.setPiece(king);
          data[y][x] = slot;
        }
        //if it is a white pawn
        if (piece.equals("P")){
          Square slot = new Square(x, y);
          Pawn pawn = new Pawn(x, y, "white", 1);
          limitPiece(pawn);
          slot.setPiece(pawn);
          data[y][x] = slot;
        }
        //if it is a white Bishop
        if (piece.equals("B")){
          Square slot = new Square(x, y);
          Bishop bishop = new Bishop(x, y, "white");
          limitPiece(bishop);
          slot.setPiece(bishop);
          data[y][x] = slot;
        }
        //if it is a white Knight
        if (piece.equals("N")){
          Square slot = new Square(x, y);
          Knight knight = new Knight(x, y, "white");
          limitPiece(knight);
          slot.setPiece(knight);
          data[y][x] = slot;
        }
        //if it is a white Rook
        if (piece.equals("R")){
          Square slot = new Square(x, y);
          Rook rook = new Rook(x, y, "white");
          limitPiece(rook);
          slot.setPiece(rook);
          data[y][x] = slot;
        }
        //if it is a white Queen
        if (piece.equals("Q")){
          Square slot = new Square(x, y);
          Queen queen = new Queen(x, y, "white");
          limitPiece(queen);
          slot.setPiece(queen);
          data[y][x] = slot;
        }
        //if it is a white King
        if (piece.equals("K")){
          Square slot = new Square(x, y);
          King king = new King(x, y, "white");
          limitPiece(king);
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
    for (int i = 1; yCor + i < 8; i ++){
      if(!delete){
        if (ans[yCor + i][xCor]!= null){
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
    for (int i = 1; yCor - i >= 0; i ++){
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
    for (int i = 1; xCor - i >= 0; i ++){
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
    for (int i = 1; xCor + i < 8; i ++){
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
    for (int i = 1; xCor + i < 8 && yCor- i >= 0; i ++){
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
    for (int i = 1; xCor- i >= 0 && yCor- i >= 0; i ++){
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
    for (int i = 1; xCor+ i < 8 && yCor+ i < 8; i ++){
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
    for (int i = 1; xCor- i >= 0 && yCor+ i < 8; i ++){
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
    //System.out.println(Piece.movesString(data[yCor][xCor].getPiece().getData()));
    if (possibleMoves[y][x]!=null){
      if (possibleMoves[y][x].equals("o")){
        data[inpt.getY()][inpt.getX()].removePiece();
        data[y][x].setPiece(inpt);
        data[y][x].getPiece().updateData();
        limitPiece(data[y][x].getPiece());
        //System.out.println(Piece.movesString(data[y][x].getPiece().getData()));
        return true;
      }
    }
    return false;
  }

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
