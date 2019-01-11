public class pieceDriver{
    public static void main(String[] args) {
      Bishop bishop = new Bishop(2, 7, "black");
      System.out.println(Piece.movesString(bishop.getData()));
      System.out.println("bb".equals(bishop.getType()));
      Rook rook = new Rook(1, 7, "white");
      System.out.println(Piece.movesString(rook.getData()));
      System.out.println("wr".equals(rook.getType()));
      King king = new King(3, 7, "white");
      System.out.println(Piece.movesString(king.getData()));
      System.out.println("wk".equals(king.getType()));
      Pawn pawn = new Pawn(3, 6, "white", 0);
      System.out.println(Piece.movesString(pawn.getData()));
      System.out.println("wp".equals(pawn.getType()));
    }
}
