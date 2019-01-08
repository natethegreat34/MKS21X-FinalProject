public class Chessboard{
  private Square[][] data;
  public boolean canMove(int x1, int y1, int[][] possibleMoves){
    for (int x = 0; x < possibleMoves.length; x++){
      if (x == x1){
        if (possiblemoves[x][1] == y1){
          if (data[x1][y1].isEmpty() || 
        }
      }
    }
  }
  public boolean move(int x1, int y1, int x2, int y2){
    Piece movePiece = data[x1][y1].getPiece();
    int[][] possibleMoves = movePiece.getMoveList();
    for (int x = 0; x < possibleMove.length; x++){
	
  }
}
