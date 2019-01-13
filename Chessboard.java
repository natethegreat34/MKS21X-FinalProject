import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;

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
  public void fillBoard(String filename) throws FileNotFoundException{
    File f = new File(filename);
    Scanner in = new Scanner(f);
    clear();
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
        //if it is a white piece
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
  //------------------------------------------------------------------------------



  //==============================================================================
  public boolean checkOnBlackKing() {
    //possible moves of the piece
    //loops through data and finds an x, which signifies a take, from each piece's data
    //if that piece on data is a king then it is in check
    for(int y = 0; y < data.length; y++){
      for(int x = 0; x < data[y].length; x++){
        Piece inpt = data[y][x].getPiece();
        String[][] pM = inpt.getData();
        for (int yCor = 0; yCor < pM.length; yCor++){
          for (int xCor = 0; xCor < pM[yCor].length; xCor++){
            //checks if its not null
            if (pM[yCor][xCor] != null){
              //checks for "x" to signify a take slot
              if (pM[yCor][xCor].equals("x")){
                //checks based on color what king is in check
                if (inpt.getColor().equals("white")){
                  if (data[yCor][xCor].getPiece().getType().equals("k")){
                    return true;
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
          Piece inpt = data[y][x].getPiece();
          String[][] pM = inpt.getData();
          for (int yCor = 0; yCor < pM.length; yCor++){
            for (int xCor = 0; xCor < pM[yCor].length; xCor++){
              //checks if its not null
              if (pM[yCor][xCor] != null){
                //checks for "x" to signify a take slot
                if (pM[yCor][xCor].equals("x")){
                  //checks based on color what king is in check
                  if (inpt.getColor().equals("black")){
                    if (data[yCor][xCor].getPiece().getType().equals("K")){
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
  public boolean move(int xCor, int yCor, int x, int y){
    Piece inpt = getSquare(xCor, yCor).getPiece();
    String[][] possibleMoves = inpt.getData();
    //System.out.println(Piece.movesString(data[yCor][xCor].getPiece().getData()));
    if (possibleMoves[y][x]!=null){
      if (possibleMoves[y][x].equals("o") || possibleMoves[y][x].equals("x")){
        data[inpt.getY()][inpt.getX()].removePiece();
        data[y][x].setPiece(inpt);
        updateAllPieces();
        limitPiece(data[y][x].getPiece());
        //System.out.println(Piece.movesString(data[y][x].getPiece().getData()));
        return true;
      }
    }
    return false;
  }
  //------------------------------------------------------------------------------



  //==============================================================================
  public void fill (){
    clear();
    Pawn piece1 = new Pawn (0,1, "black", 0); Rook piece17 = new Rook (0,0, "black");
    data[1][0].setPiece(piece1); data[0][0].setPiece(piece17);
    Pawn piece2 = new Pawn (1,1, "black", 0); Knight piece18 = new Knight (1, 0, "black");
    data[1][1].setPiece(piece2); data[0][1].setPiece(piece18);
    Pawn piece3 = new Pawn (2,1, "black", 0); Bishop piece19 = new Bishop (2, 0, "black");
    data[1][2].setPiece(piece3); data[0][2].setPiece(piece19);
    Pawn piece4 = new Pawn (3,1, "black", 0); Queen piece20 = new Queen (3, 0, "black");
    data[1][3].setPiece(piece4); data[0][3].setPiece(piece20);
    Pawn piece5 = new Pawn (4,1, "black", 0); King piece21 = new King (4, 0, "black");
    data[1][4].setPiece(piece5); data[0][4].setPiece(piece21);
    Pawn piece6 = new Pawn (5,1, "black", 0); Bishop piece22 = new Bishop (5, 0, "black");
    data[1][5].setPiece(piece6); data[0][5].setPiece(piece22);
    Pawn piece7 = new Pawn (6,1, "black", 0); Knight piece23 = new Knight (6, 0, "black");
    data[1][6].setPiece(piece7); data[0][6].setPiece(piece23);
    Pawn piece8 = new Pawn (7,1, "black", 0); Rook piece24 = new Rook (7, 0, "black");
    data[1][7].setPiece(piece8); data[0][7].setPiece(piece24);

    Pawn piece9 = new Pawn (0,6, "white", 1); Rook piece25 = new Rook (0,7, "white");
    data[6][0].setPiece(piece9); data[7][0].setPiece(piece25);
    Pawn piece10 = new Pawn (1,6, "white", 1);Knight piece26 = new Knight (1, 7, "white");
    data[6][1].setPiece(piece10); data[7][1].setPiece(piece26);
    Pawn piece11 = new Pawn (2,6, "white", 1);Bishop piece27 = new Bishop (2, 7, "white");
    data[6][2].setPiece(piece11); data[7][2].setPiece(piece27);
    Pawn piece12 = new Pawn (3,6, "white", 1);Queen piece28 = new Queen (3, 7, "white");
    data[6][3].setPiece(piece12); data[7][3].setPiece(piece28);
    Pawn piece13 = new Pawn (4,6, "white", 1);King piece29 = new King (4, 7, "white");
    data[6][4].setPiece(piece13); data[7][4].setPiece(piece29);
    Pawn piece14 = new Pawn (5,6, "white", 1);Bishop piece30 = new Bishop (5, 7, "white");
    data[6][5].setPiece(piece14); data[7][5].setPiece(piece30);
    Pawn piece15 = new Pawn (6,6, "white", 1);Knight piece31 = new Knight (6, 7, "white");
    data[6][6].setPiece(piece15); data[7][6].setPiece(piece31);
    Pawn piece16 = new Pawn (7,6, "white", 1);Rook piece32 = new Rook (7, 7, "white");
    data[6][7].setPiece(piece16); data[7][7].setPiece(piece32);

  }

  public void newGame() throws IOException{
    fill();
    File file = new File("SaveFiles/save.txt");
    FileWriter fr = null;
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
