public class Demo2{
  public static void main(String[] args) {
    System.out.println("=====================================================================");
    System.out.println("ILLEGAL MOVES DEMO\n");
    Chessboard chess = new Chessboard("file1");
    chess.loadGame("demo2");
    System.out.println("Original Board");
    System.out.println("This board is filled with pieces of the same color");
    System.out.println("They should not be able to move pass each other");
    System.out.println(chess);
    System.out.println("\nMoving Rook f2 to f7");
    System.out.println("Works?: "  + chess.move(5, 6, 5, 1));
    System.out.println(chess);
    System.out.println("\nMoving Bishop e7 to f6");
    System.out.println("Works?: "  + chess.move(4, 1, 5, 2));
    System.out.println(chess);
    System.out.println("\nMoving Knight g2 to e3");
    System.out.println("Works?: "  + chess.move(6, 6, 4, 5));
    System.out.println(chess);
    System.out.println("\nMoving Queen b8 to b7");
    System.out.println(Piece.movesString(chess.getSquare(1,0).getPiece().getData()));
    System.out.println("Works?: "  + chess.move(1, 0, 1, 1));
    System.out.println(chess);
    System.out.println("As you can see all the moves failed and the orignal board");
    System.out.println("is intact");
  }
}
