import java.util.ArrayList;
public class Chessboard{
  private Square[][] data;
  public ArrayList<String> possibleMoves(String[][] moveList){
    ArrayList<String> ans = new ArrayList<String>();
    for (int x = 0; x < moveList.length; x++){
      for (int y = 0; y < moveList[x].length; y++){
        if (moveList[x][y].equals("o")){
          String coordinate = "";
          coordinate += x;
          coordinate += y;
          ans.add(coordinate);
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
  // public boolean move(int x1, int y1, int x2, int y2){
  //   Piece movePiece = data[x1][y1].getPiece();
  //   int[][] possibleMoves = movePiece.getMoveList();
  //   for (int x = 0; x < possibleMove.length; x++){
  //
  // }


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
