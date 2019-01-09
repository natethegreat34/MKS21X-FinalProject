import java.util.ArrayList;
public class Chessboard{
  private Square[][] data;
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
