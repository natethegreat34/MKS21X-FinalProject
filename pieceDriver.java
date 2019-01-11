public class pieceDriver{
    public static void main(String[] args) {
      Bishop bishop = new Bishop(2, 7, "black");
      System.out.println(Piece.movesString(bishop.possiblemoves()));
      System.out.println("bb".equals(bishop.getType()));
      Rook rook = new Rook(1, 7, "white");
      System.out.println(Piece.movesString(rook.possiblemoves()));
      System.out.println("wr".equals(rook.getType()));
      King king = new King(3, 7, "white");
      System.out.println(Piece.movesString(king.possiblemoves()));
      System.out.println("wk".equals(king.getType()));
    }
}
