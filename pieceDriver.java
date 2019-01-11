public class pieceDriver{
    public static void main(String[] args) {
      Bishop bishop = new Bishop(7, 2, "black");
      System.out.println(Piece.movesString(bishop.possiblemoves()));
      System.out.println("bb".equals(bishop.getType()));
      Rook rook = new Rook(7, 1, "white");
      System.out.println(Piece.movesString(rook.possiblemoves()));
      System.out.println("wr".equals(rook.getType()));
      King king = new King(7, 3, "white");
      System.out.println(Piece.movesString(king.possiblemoves()));
      System.out.println("wk".equals(king.getType()));
    }
}
