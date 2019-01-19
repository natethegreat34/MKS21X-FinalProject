public class pieceDriver{
    public static void main(String[] args) {
      // Bishop bishop = new Bishop(2, 7, "black");
      // System.out.println(Piece.movesString(bishop.getData()));
      // System.out.println("b".equals(bishop.getType()));
      // Rook rook = new Rook(1, 7, "white");
      // System.out.println(Piece.movesString(rook.getData()));
      // System.out.println("W".equals(rook.getType()));
      // King king = new King(4, 7, "white");
      // System.out.println(Piece.movesString(king.getData()));
      // System.out.println("K".equals(king.getType()));
      Pawn pawn = new Pawn(1, 6, "black", 1);
      System.out.println(Piece.movesString(pawn.getData()));
      System.out.println("P".equals(pawn.getType()));
      
      // Knight knight = new Knight(3, 7, "white");
      // System.out.println(Piece.movesString(knight.getData()));
      // System.out.println("N".equals(knight.getType()));

    }
}
