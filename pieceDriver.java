public class pieceDriver{
    public static void main(String[] args) {
      Bishop bishop = new Bishop(2, 7, "black");
      System.out.println(Piece.movesString(bishop.getData()));
<<<<<<< HEAD
      System.out.println("b".equals(bishop.getType()));
      Rook rook = new Rook(1, 7, "white");
      System.out.println(Piece.movesString(rook.getData()));
      System.out.println("W".equals(rook.getType()));
      King king = new King(4, 7, "white");
=======
      System.out.println("bb".equals(bishop.getType()));
      System.out.println(bishop.getColor());
      System.out.println(bishop.getX());
      System.out.println(bishop.getY());
      System.out.println(bishop.setY(6));
      bishop.updateData();
      System.out.println(Piece.movesString(bishop.getData()));

      /*
      Rook rook = new Rook(1, 7, "white");
      System.out.println(Piece.movesString(rook.getData()));
      System.out.println("wr".equals(rook.getType()));
      King king = new King(1, 1, "white");
>>>>>>> devlimitPiecemethod
      System.out.println(Piece.movesString(king.getData()));
      System.out.println("K".equals(king.getType()));
      Pawn pawn = new Pawn(3, 6, "white", 1);
      System.out.println(Piece.movesString(pawn.getData()));
      System.out.println("P".equals(pawn.getType()));
      Knight knight = new Knight(3, 7, "white");
      System.out.println(Piece.movesString(knight.getData()));
<<<<<<< HEAD
      System.out.println("N".equals(knight.getType()));
=======
      System.out.println("wn".equals(knight.getType()));
      Queen queen = new Queen(5, 7, "white");
      System.out.println(Piece.movesString(queen.getData()));
      System.out.println("wq".equals(queen.getType()));
      */
>>>>>>> devlimitPiecemethod
    }
}
