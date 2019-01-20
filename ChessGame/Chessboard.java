import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;

public class Chessboard{
  private Square[][] data;
  private File file;
  private King kingW;
  private King kingB;
  private String[][] allBlackMoves;
  private String[][] allWhiteMoves;
  public Chessboard(){
    data = new Square[8][8];
    for (int y = 0; y < data.length; y++){
      for (int x = 0; x < data[y].length; x++){
        Square empty = new Square (x,y);
        data[y][x] = empty;
      }
    }
  }
  //------------------------------------------------------------------------------



  //==============================================================================
  public String printBlackMoves(){
    String ans = "";
    for (int y = 0; y < 8; y++){
      String line = "";
      for (int x = 0; x < 8; x++){
        if(allBlackMoves[y][x] == null){
          line += "_ ";
        }
        else{
          line += allBlackMoves[y][x] + " ";
        }
      }
      line += "\n";
      ans += line;
    }
    return ans;
  }
  //------------------------------------------------------------------------------



  //==============================================================================
  public String printWhiteMoves(){
    String ans = "";
    for (int y = 0; y < 8; y++){
      String line = "";
      for (int x = 0; x < 8; x++){
        if(allWhiteMoves[y][x] == null){
          line += "_ ";
        }
        else{
          line += allWhiteMoves[y][x] + " ";
        }
      }
      line += "\n";
      ans += line;
    }
    return ans;
  }
  //------------------------------------------------------------------------------



  //==============================================================================
  public void clear(){
    for (int y = 0; y < data.length; y++){
      for (int x = 0; x < data[y].length; x++){
        Square empty = new Square (x,y);
        data[y][x] = empty;
      }
    }
  }
  //------------------------------------------------------------------------------



  //==============================================================================
  public void loadGame(String filename){
    try{
      file = new File("../SaveFiles/"+filename+".txt");
      Scanner in = new Scanner(file);
      clear();
      for (int y = 0; y < data.length; y++){
        for (int x = 0; x < data[y].length; x++){
          //read the next letter from the file
          String piece = in.next();
          //if it is a black Pawn
          if (piece.equals("p")){
            Square slot = new Square(x, y);
            Pawn pawn = new Pawn(x, y, "black", 0);
            slot.setPiece(pawn);
            data[y][x] = slot;
          }
          //if it is a black Bishop
          if (piece.equals("b")){
            Square slot = new Square(x, y);
            Bishop bishop = new Bishop(x, y, "black");
            slot.setPiece(bishop);
            data[y][x] = slot;
          }
          //if it is a black Knight
          if (piece.equals("n")){
            Square slot = new Square(x, y);
            Knight knight = new Knight(x, y, "black");
            slot.setPiece(knight);
            data[y][x] = slot;
          }
          //if it is a black Rook
          if (piece.equals("r")){
            Square slot = new Square(x, y);
            Rook rook = new Rook(x, y, "black");
            slot.setPiece(rook);
            data[y][x] = slot;
          }
          //if it is a black Queen
          if (piece.equals("q")){
            Square slot = new Square(x, y);
            Queen queen = new Queen(x, y, "black");
            slot.setPiece(queen);
            data[y][x] = slot;
          }
          //if it is a black King
          if (piece.equals("k")){
            Square slot = new Square(x, y);
            King king = new King(x, y, "black");
            kingB = king;
            slot.setPiece(king);
            data[y][x] = slot;
          }
          //if it is a white piece
          if (piece.equals("P")){
            Square slot = new Square(x, y);
            Pawn pawn = new Pawn(x, y, "white", 1);
            slot.setPiece(pawn);
            data[y][x] = slot;
          }
          //if it is a white Bishop
          if (piece.equals("B")){
            Square slot = new Square(x, y);
            Bishop bishop = new Bishop(x, y, "white");
            slot.setPiece(bishop);
            data[y][x] = slot;
          }
          //if it is a white Knight
          if (piece.equals("N")){
            Square slot = new Square(x, y);
            Knight knight = new Knight(x, y, "white");
            slot.setPiece(knight);
            data[y][x] = slot;
          }
          //if it is a white Rook
          if (piece.equals("R")){
            Square slot = new Square(x, y);
            Rook rook = new Rook(x, y, "white");
            slot.setPiece(rook);
            data[y][x] = slot;
          }
          //if it is a white Queen
          if (piece.equals("Q")){
            Square slot = new Square(x, y);
            Queen queen = new Queen(x, y, "white");
            slot.setPiece(queen);
            data[y][x] = slot;
          }
          //if it is a white King
          if (piece.equals("K")){
            Square slot = new Square(x, y);
            King king = new King(x, y, "white");
            kingW = king;
            slot.setPiece(king);
            data[y][x] = slot;
          }
        }
      }
      updateAllPieces();
      limitAllPieces();
      allBlacksMoves();
      allWhitesMoves();
    } catch(FileNotFoundException e){
      newGame(filename);
    }
  }

  //------------------------------------------------------------------------------



  //==============================================================================
  private void copyFromTo (String[][] from, String[][] to){
    for (int y = 0; y < 8; y++){
      for (int x = 0;  x < 8; x++){
        if (from[y][x] != null){
          if (to[y][x] == null){
            to[y][x] = from [y][x];
          }
        }
      }
    }
  }

  //------------------------------------------------------------------------------



  //==============================================================================

  private void allBlacksMoves(){
    allBlackMoves = new String[8][8];
    for (int y = 0; y < data.length; y++){
      for (int x = 0;  x < data[y].length; x++){
        if(data[y][x].getPiece() != null){
          if(data[y][x].getPiece().getColor().equals("black")){
            copyFromTo(data[y][x].getPiece().getData(), allBlackMoves);
          }
        }
      }
    }
  }

  //------------------------------------------------------------------------------



  //==============================================================================

  private void allWhitesMoves(){
    allWhiteMoves = new String[8][8];
    for (int y = 0; y < data.length; y++){
      for (int x = 0;  x < data[y].length; x++){
        if(data[y][x].getPiece() != null){
          if(data[y][x].getPiece().getColor().equals("white")){
            copyFromTo(data[y][x].getPiece().getData(), allWhiteMoves);
          }
        }
      }
    }
  }

  //------------------------------------------------------------------------------



  //==============================================================================

  private boolean whiteKingMovingIntoCheck(int x, int y){
    if (allBlackMoves[y][x].equals("o")){
      return true;
    }
    return false;
  }

  //------------------------------------------------------------------------------



  //==============================================================================

  private boolean blackKingMovingIntoCheck(int x, int y){
    if (allWhiteMoves[y][x].equals("o")){
      return true;
    }
    return false;
  }

  //------------------------------------------------------------------------------



  //==============================================================================

  public boolean canCastleWhite(String side){
    int y = kingW.getY();
    int x = kingW.getX();
    side.toLowerCase();
    if(side.equals("queen")){
      if(kingW.getMoveNumber() == 0){
        System.out.println("Passed 1");
        if(data[y][x - 4].getPiece() != null){
          System.out.println("Passed 2");
          if(data[y][x - 4].getPiece().getType().equals("R")){
            System.out.println("Passed 3");
            if(data[y][x - 4].getPiece().getMoveNumber() == 0){
              System.out.println("Passed 4");
              if(data[y][x - 1].getPiece() == null && data[y][x - 2] == null && data[y][x - 3] == null){
                System.out.println("Passed 5");
                if(!checkOnWhiteKing()){
                  System.out.println("Passed 6");
                  if(allBlackMoves[y][x-1] == null && allBlackMoves[y][x-2] == null && allBlackMoves[y][x-3] == null){
                    System.out.println("Passed 7");
                    return true;
                  }
                }
              }
            }
          }
        }
      }
    }
    if(side.equals("king")){
      if(kingW.getMoveNumber() == 0){
        System.out.println("Passed 1");
        if(data[y][x + 3].getPiece() != null){
          System.out.println("Passed 2");
          if(data[y][x + 3].getPiece().getType().equals("R")){
            System.out.println("Passed 3");
            if(data[y][x + 3].getPiece().getMoveNumber() == 0){
              System.out.println("Passed 4");
              if(data[y][x + 1].getPiece() == null){
                if(data[y][x + 2] == null){
                  System.out.println("Passed 5");
                  if(!checkOnWhiteKing()){
                    System.out.println("Passed 6");
                    if(allBlackMoves[y][x+1] == null && allBlackMoves[y][x+2] == null){
                      System.out.println("Passed 7");
                      return true;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return false;
  }

  public boolean canCastleBlack(String side){
    int y = kingB.getY();
    int x = kingB.getX();
    side.toLowerCase();
    if(side.equals("queen")){
      if(kingB.getMoveNumber() == 0){
        if(data[y][x - 4].getPiece() != null){
          if(data[y][x - 4].getPiece().getType().equals("r")){
            if(data[y][x - 4].getPiece().getMoveNumber() == 0){
              if(data[y][x - 1].getPiece() == null && data[y][x - 2] == null && data[y][x - 3] == null){
                if(!checkOnWhiteKing()){
                  if(allWhiteMoves[y][x-1] == null && allWhiteMoves[y][x-2] == null && allWhiteMoves[y][x-3] == null){
                    return true;
                  }
                }
              }
            }
          }
        }
      }
    }
    if(side.equals("king")){
      if(kingB.getMoveNumber() == 0){
        if(data[y][x + 3].getPiece() != null){
          if(data[y][x + 3].getPiece().getType().equals("r")){
            if(data[y][x + 3].getPiece().getMoveNumber() == 0){
              if(data[y][x + 1].getPiece() == null && data[y][x + 2] == null){
                if(!checkOnWhiteKing()){
                  if(allWhiteMoves[y][x+1] == null && allWhiteMoves[y][x+2] == null){
                    return true;
                  }
                }
              }
            }
          }
        }
      }
    }
    return false;
  }

  public boolean castle(Piece king, String side){
    if(side.equals("king")){
      Piece rook = data[king.getY()][king.getX() + 3].getPiece();
      king.increaseMoveNumber();
      rook.increaseMoveNumber();
      data[king.getY()][king.getX()].removePiece();
      data[king.getY()][king.getX()+2].setPiece(king);
      data[rook.getY()][rook.getX()].removePiece();
      data[rook.getY()][rook.getX()-2].setPiece(rook);
      return true;
    }
    if(side.equals("queen")){
      Piece rook = data[king.getY()][king.getX() - 4].getPiece();
      king.increaseMoveNumber();
      rook.increaseMoveNumber();
      data[king.getY()][king.getX()].removePiece();
      data[king.getY()][king.getX()-2].setPiece(king);
      data[rook.getY()][rook.getX()].removePiece();
      data[rook.getY()][rook.getX()+3].setPiece(rook);
      return true;
    }
    return false;
  }
  //------------------------------------------------------------------------------


  //==============================================================================
  public boolean checkOnBlackKing() {
    //possible moves of the piece
    //loops through data and finds an x, which signifies a take, from each piece's data
    //if that piece on data is a king then it is in check
    for(int y = 0; y < data.length; y++){
      for(int x = 0; x < data[y].length; x++){
        if(!(data[y][x].isEmpty())){
          //System.out.println("Passed isEmpty()");
          Piece inpt = data[y][x].getPiece();
          String[][] pM = inpt.getData();
          for (int yCor = 0; yCor < pM.length; yCor++){
            for (int xCor = 0; xCor < pM[yCor].length; xCor++){
              //checks if its not null
              if (pM[yCor][xCor] != null){
                //System.out.println("Passed null");
                //checks for "x" to signify a take slot
                if (pM[yCor][xCor].equals("x")){
                  //System.out.println("Passed x check");
                  //checks based on color what king is in check
                  if (inpt.getColor().equals("white")){
                    //System.out.println("Passed color pass");
                    if (data[yCor][xCor].getPiece().getType().equals("k")){
                      //System.out.println("Passed K pass\n\n\n\n");
                      return true;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    //otherwise it returns false
    return false;
  }
  //------------------------------------------------------------------------------



  //==============================================================================
  public boolean checkOnWhiteKing() {
    //possible moves of the piece
    //loops through data and finds an x, which signifies a take, from each piece's data
    //if that piece on data is a king then it is in check
    for(int y = 0; y < data.length; y++){
      for(int x = 0; x < data[y].length; x++){
        if(!(data[y][x].isEmpty())){
          //System.out.println("Passed isEmpty()");
          Piece inpt = data[y][x].getPiece();
          String[][] pM = inpt.getData();
          for (int yCor = 0; yCor < pM.length; yCor++){
            for (int xCor = 0; xCor < pM[yCor].length; xCor++){
              //checks if its not null
              if (pM[yCor][xCor] != null){
                //System.out.println("Passed null");
                //checks for "x" to signify a take slot
                if (pM[yCor][xCor].equals("x")){
                  //System.out.println("Passed x check");
                  //checks based on color what king is in check
                  if (inpt.getColor().equals("black")){
                    //System.out.println("Passed color pass");
                    if (data[yCor][xCor].getPiece().getType().equals("K")){
                      //System.out.println("Passed K pass\n\n\n\n");
                      return true;
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    //otherwise it returns false
    return false;
  }
  //------------------------------------------------------------------------------



  //==============================================================================

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
    // >/
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
        if (ans[yCor - i][xCor - i] != null){
          //System.out.println("Pass Null");
          if (!(data[yCor - i][xCor - i].isEmpty())){
            //System.out.println("Pass isEmpty");
            if (data[yCor - i][xCor - i].getPiece().getColor().equals(inpt.getColor())){
              //System.out.println("Deletion Working");
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
    //special knight moves
    //will check the possible knight moves and limit import junit.framework.TestCase;
    if (yCor + 1 < 8){
      if (xCor + 2 < 8){
        if (ans[yCor + 1][xCor + 2] != null){
          if (!(data[yCor + 1][xCor + 2].isEmpty())){
            if (data[yCor + 1][xCor + 2].getPiece().getColor().equals(inpt.getColor())){
              ans[yCor + 1][xCor + 2] = null;
            }
            else{
              ans[yCor + 1][xCor + 2] = "x";
            }
          }
        }
      }

      if(xCor - 2 >= 0){
        if (ans[yCor + 1][xCor - 2] != null){
          if (!(data[yCor + 1][xCor - 2].isEmpty())){
            if (data[yCor + 1][xCor - 2].getPiece().getColor().equals(inpt.getColor())){
              ans[yCor + 1][xCor - 2] = null;
            }
            else{
              ans[yCor + 1][xCor - 2] = "x";
            }
          }
        }
      }
    }

    if(yCor + 2 < 8){
      if (xCor + 1 < 8){
        if (ans[yCor + 2][xCor + 1] != null){
          if (!(data[yCor + 2][xCor + 1].isEmpty())){
            if (data[yCor + 2][xCor + 1].getPiece().getColor().equals(inpt.getColor())){
              ans[yCor + 2][xCor + 1] = null;
            }
            else{
              ans[yCor + 2][xCor + 1] = "x";
            }
          }
        }
      }
      if (xCor - 1 >= 0){
        if (ans[yCor + 2][xCor - 1] != null){
          if (!(data[yCor + 2][xCor - 1].isEmpty())){
            if (data[yCor + 2][xCor - 1].getPiece().getColor().equals(inpt.getColor())){
              ans[yCor + 2][xCor - 1] = null;
            }
            else{
              ans[yCor + 2][xCor - 1] = "x";
            }
          }
        }
      }
    }

    if (yCor - 1 >= 0){
      if (xCor + 2 < 8){
        if (ans[yCor - 1][xCor + 2] != null){
          if (!(data[yCor - 1][xCor + 2].isEmpty())){
            if (data[yCor - 1][xCor + 2].getPiece().getColor().equals(inpt.getColor())){
              ans[yCor - 1][xCor + 2] = null;
            }
            else{
              ans[yCor - 1][xCor + 2] = "x";
            }
          }
        }
      }

      if (xCor - 2 >= 0){
        if (ans[yCor - 1][xCor - 2] != null){
          if (!(data[yCor - 1][xCor - 2].isEmpty())){
            if (data[yCor - 1][xCor - 2].getPiece().getColor().equals(inpt.getColor())){
              ans[yCor - 1][xCor - 2] = null;
            }
            else{
              ans[yCor - 1][xCor - 2] = "x";
            }
          }
        }
      }
    }
    if (yCor - 2 >= 0){
      if (xCor + 1 < 8){
        if (ans[yCor - 2][xCor + 1] != null){
          if (!(data[yCor - 2][xCor + 1].isEmpty())){
            if (data[yCor - 2][xCor + 1].getPiece().getColor().equals(inpt.getColor())){
              ans[yCor - 2][xCor + 1] = null;
            }
            else{
              ans[yCor - 2][xCor + 1] = "x";
            }
          }
        }
      }
      if (xCor - 1 >= 0){
        if (ans[yCor - 2][xCor - 1] != null){
          if (!(data[yCor - 2][xCor - 1].isEmpty())){
            if (data[yCor - 2][xCor - 1].getPiece().getColor().equals(inpt.getColor())){
              ans[yCor - 2][xCor - 1] = null;
            }
            else{
              ans[yCor - 2][xCor - 1] = "x";
            }
          }
        }
      }
    }
    //special cases for castling based on the helper methods that will determine if conditions are rightf
    //it separates the cases by which side to castle on and which color
    if(inpt.getType().equals("K")){
      if(!(canCastleWhite("king"))){
        ans[yCor][xCor + 2] = null;
      }
      if(!(canCastleWhite("queen"))){
        ans[yCor][xCor - 2] = null;
      }
    }
    if(inpt.getType().equals("k")){
      if(!(canCastleBlack("king"))){
        ans[yCor][xCor + 2] = null;
      }
      if(!(canCastleBlack("queen"))){
        ans[yCor][xCor - 2] = null;
      }
    }
    //this sets the piece up for an en passant
    /*
    if(data[yCor][xCor + 1].getPiece() != null){

    }
    */
    inpt.setData(ans);
  }
  //------------------------------------------------------------------------------



  //==============================================================================
  public Square getSquare(int x, int y){
    return data[y][x];
  }
  //------------------------------------------------------------------------------



  //==============================================================================
  public void updateAllPieces(){
    for(int y = 0; y < data.length; y++){
      for(int x = 0; x < data[y].length; x++){
        if (!(data[y][x].isEmpty())){
          data[y][x].getPiece().updateData();
        }
      }
    }
  }
  //------------------------------------------------------------------------------



  //==============================================================================

  public void limitAllPieces(){
    for(int y = 0; y < data.length; y++){
      for(int x = 0; x < data[y].length; x++){
        if (!(data[y][x].isEmpty())){
          limitPiece(data[y][x].getPiece());
        }
      }
    }
  }

  //------------------------------------------------------------------------------



  //==============================================================================
  public boolean move(int xCor, int yCor, int x, int y){
    Piece inpt = getSquare(xCor, yCor).getPiece();
    String[][] possibleMoves = inpt.getData();
    //System.out.println(Piece.movesString(data[yCor][xCor].getPiece().getData()));
    if (possibleMoves[y][x]!=null){
      if (possibleMoves[y][x].equals("o") || possibleMoves[y][x].equals("x")){
        if(inpt.getType().equals("P") || inpt.getType().equals("p")){
           if (inpt.getMoved2()) {
             inpt.setMoved2(false);
           }
        }
        inpt.increaseMoveNumber();
        data[inpt.getY()][inpt.getX()].removePiece();
        data[y][x].setPiece(inpt);
        updateAllPieces();
        limitAllPieces();
        allBlacksMoves();
        allWhitesMoves();
        inpt.increaseMoveNumber();
        //System.out.println(Piece.movesString(data[y][x].getPiece().getData()));
        return true;
      }
      if (possibleMoves[y][x].equals("P")){
        inpt.increaseMoveNumber();
        inpt.setMoved2(true);
        data[inpt.getY()][inpt.getX()].removePiece();
        data[y][x].setPiece(inpt);
        updateAllPieces();
        limitAllPieces();
        allBlacksMoves();
        allWhitesMoves();
      }
      if (possibleMoves[y][x].equals("c")){
        castle(inpt,"queen");
        updateAllPieces();
        limitAllPieces();
        allBlacksMoves();
        allWhitesMoves();
        //System.out.println(Piece.movesString(data[y][x].getPiece().getData()));
        return true;
      }
      if (possibleMoves[y][x].equals("C")){
        castle(inpt,"king");
        updateAllPieces();
        limitAllPieces();
        allBlacksMoves();
        allWhitesMoves();
        //System.out.println(Piece.movesString(data[y][x].getPiece().getData()));
        return true;
      }
    }
    return false;
  }
  //------------------------------------------------------------------------------



  //==============================================================================
  private void fill (){
    clear();
    Rook piece17 = new Rook (0,0, "black");
    data[0][0].setPiece(piece17);
    Knight piece18 = new Knight (1, 0, "black");
    data[0][1].setPiece(piece18);
    Bishop piece19 = new Bishop (2, 0, "black");
    data[0][2].setPiece(piece19);
    Queen piece20 = new Queen (3, 0, "black");
    data[0][3].setPiece(piece20);
    King piece21 = new King (4, 0, "black");
    data[0][4].setPiece(piece21);
    Bishop piece22 = new Bishop (5, 0, "black");
    data[0][5].setPiece(piece22);
    Knight piece23 = new Knight (6, 0, "black");
    data[0][6].setPiece(piece23);
    Rook piece24 = new Rook (7, 0, "black");
    data[0][7].setPiece(piece24);
    Pawn piece1 = new Pawn (0,1, "black", 0);
    data[1][0].setPiece(piece1);
    Pawn piece2 = new Pawn (1,1, "black", 0);
    data[1][1].setPiece(piece2);
    Pawn piece3 = new Pawn (2,1, "black", 0);
    data[1][2].setPiece(piece3);
    Pawn piece4 = new Pawn (3,1, "black", 0);
    data[1][3].setPiece(piece4);
    Pawn piece5 = new Pawn (4,1, "black", 0);
    data[1][4].setPiece(piece5);
    Pawn piece6 = new Pawn (5,1, "black", 0);
    data[1][5].setPiece(piece6);
    Pawn piece7 = new Pawn (6,1, "black", 0);
    data[1][6].setPiece(piece7);
    Pawn piece8 = new Pawn (7,1, "black", 0);
    data[1][7].setPiece(piece8);
    Pawn piece9 = new Pawn (0,6, "white", 1);
    data[6][0].setPiece(piece9);
    Pawn piece10 = new Pawn (1,6, "white", 1);
    data[6][1].setPiece(piece10);
    Pawn piece11 = new Pawn (2,6, "white", 1);
    data[6][2].setPiece(piece11);
    Pawn piece12 = new Pawn (3,6, "white", 1);
    data[6][3].setPiece(piece12);
    Pawn piece13 = new Pawn (4,6, "white", 1);
    data[6][4].setPiece(piece13);
    Pawn piece14 = new Pawn (5,6, "white", 1);
    data[6][5].setPiece(piece14);
    Pawn piece15 = new Pawn (6,6, "white", 1);
    data[6][6].setPiece(piece15);
    Pawn piece16 = new Pawn (7,6, "white", 1);
    data[6][7].setPiece(piece16);
    Rook piece25 = new Rook (0,7, "white");
    data[7][0].setPiece(piece25);
    Knight piece26 = new Knight (1, 7, "white");
    data[7][1].setPiece(piece26);
    Bishop piece27 = new Bishop (2, 7, "white");
    data[7][2].setPiece(piece27);
    Queen piece28 = new Queen (3, 7, "white");
    data[7][3].setPiece(piece28);
    King piece29 = new King (4, 7, "white");
    data[7][4].setPiece(piece29);
    Bishop piece30 = new Bishop (5, 7, "white");
    data[7][5].setPiece(piece30);
    Knight piece31 = new Knight (6, 7, "white");
    data[7][6].setPiece(piece31);
    Rook piece32 = new Rook (7, 7, "white");
    data[7][7].setPiece(piece32);
    updateAllPieces();
    limitAllPieces();
    allBlacksMoves();
    allWhitesMoves();
  }

  //------------------------------------------------------------------------------



  //==============================================================================

  public void newGame(String filename){
    fill();
    file = new File("../SaveFiles/"+ filename +".txt");
    FileWriter fr = null;
    try{
      boolean newFile = file.createNewFile();
      String dataBoard = toString();
      if (newFile){
        try {
              fr = new FileWriter(file);
              fr.write(dataBoard);
          } catch (IOException e) {
              e.printStackTrace();
          }finally{
              //close resources
              try {
                  fr.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
        }
      else{
        loadGame(filename);
      }
    }
    catch (IOException e) {
        e.printStackTrace();
    }
  }

  //------------------------------------------------------------------------------



  //==============================================================================

  public void saveGame(){
    FileWriter fr = null;
    try{
      boolean newFile = file.createNewFile();
      String dataBoard = toString();
      if (!newFile){
        try {
              fr = new FileWriter(file);
              fr.write(dataBoard);
          } catch (IOException e) {
              e.printStackTrace();
          }finally{
              //close resources
              try {
                  fr.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
        }
      else{
        saveGame();
      }
    }
    catch (IOException e) {
        e.printStackTrace();
    }
  }


  //------------------------------------------------------------------------------



  //==============================================================================
  public String printAllData(){
    for(int y = 0; y < data.length; y++){
      for(int x = 0; x < data[y].length; x++){
        if(!(data[y][x].isEmpty())){
          String [][] inpt = data[y][x].getPiece().getData();
          System.out.println(Piece.movesString(inpt));
        }
      }
    }
    return "Done";
  }
  //------------------------------------------------------------------------------



  //==============================================================================


  public void returnData(int x, int y){
    Piece inpt = data[y][x].getPiece();
    System.out.println(Piece.movesString(inpt.getData()));
  }
  //------------------------------------------------------------------------------



  //==============================================================================
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
