public class pieceDriver{
    public static void main(String[] args) {
      /*
      Bishop bishop = new Bishop(2, 7, "black");
      System.out.println(Piece.movesString(bishop.getData()));
      System.out.println("b".equals(bishop.getType()));
      */
      Pawn pawn = new Pawn(4, 4, "white", 0);
      System.out.println(pawn.getMoveNumber());

      //System.out.println(Piece.movesString(rook.getData()));
      //System.out.println("W".equals(rook.getType()));
      //System.out.println(Piece.movesString(rook.getData()));
      /*
      King king = new King(4, 7, "white");
      System.out.println(Piece.movesString(king.getData()));
      System.out.println("K".equals(king.getType()));
      Pawn pawn = new Pawn(3, 6, "white", 1);
      System.out.println(Piece.movesString(pawn.getData()));
      System.out.println("P".equals(pawn.getType()));
      Knight knight = new Knight(3, 7, "white");
      System.out.println(Piece.movesString(knight.getData()));
      System.out.println("N".equals(knight.getType()));
      */
    }
}
