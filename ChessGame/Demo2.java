public class Demo2{
  public static void main(String[] args) {
    System.out.println("=====================================================================");
    System.out.println("ILLEGAL MOVES DEMO\n");
    Chessboard chess = new Chessboard();
    chess.loadGame("demo2");
    System.out.println("Original Board");
    System.out.println("This board is filled with pieces of the same color");
    System.out.println("They should not be able to move pass each other");
    System.out.println(chess);
    System.out.println("\nMoving Pawn f2 to f3");
    System.out.println("Works?: "  + chess.move(5, 6, 5, 5));
    System.out.println(chess);
    System.out.println("\nMoving Pawn e7 to e5");
    System.out.println("Works?: "  + chess.move(4, 1, 4, 3));
    System.out.println(chess);
    System.out.println("\nMoving Pawn g2 to g4");
    System.out.println("Works?: "  + chess.move(6, 6, 6, 4));
    System.out.println(chess);
    System.out.println("\nMoving Queen b8 to h4");
    System.out.println("Works?: "  + chess.move(3, 0, 7, 4));
    System.out.println(chess);
    System.out.println("As you can see all the moves failed and the orignal board");
    System.out.println("is intact");
  }
}
