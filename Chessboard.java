public class Chessboard{
  private Square[][] data;
  public boolean move(int x1, int y1, int x2, int y2){
    Piece movePiece = data[x1][y1].getPiece();
    int[][] possibleMoves = movePiece.getMoveList();
    for (int x = 0; x < possibleMove.length
  }
}
