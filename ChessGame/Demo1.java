public class Demo1{
  public static void main(String[] args) {
    Chessboard chess = new Chessboard();
    System.out.println("=====================================================================");
    System.out.println("Check/Save Game/New Game/Load Game Demo");

    System.out.println("\nCreating a new game");
    System.out.println("This uses our newGame() method and this creates a new file if it doesn't exist already");
    chess.newGame("save1");
    System.out.println("\nNew game Chessboard:");
    System.out.println(chess);
    System.out.println("Checks: ");
    System.out.println("White In Check: " + chess.checkOnWhiteKing());
    System.out.println("Black In Check: " + chess.checkOnBlackKing());
    System.out.println("\nMoving Pawn f2 to f3");
    System.out.println("Works?: "  + chess.move(5, 6, 5, 5));
    System.out.println(chess);
    System.out.println("Checks: ");
    System.out.println("White In Check: " + chess.checkOnWhiteKing());
    System.out.println("Black In Check: " + chess.checkOnBlackKing());
    System.out.println("\nMoving Pawn e7 to e5");
    System.out.println("Works?: "  + chess.move(4, 1, 4, 3));
    System.out.println(chess);
    System.out.println("Checks: ");
    System.out.println("White In Check: " + chess.checkOnWhiteKing());
    System.out.println("Black In Check: " + chess.checkOnBlackKing());
    System.out.println("\nMoving Pawn g2 to g4");
    System.out.println("Works?: "  + chess.move(6, 6, 6, 4));
    System.out.println(chess);
    System.out.println("Checks: ");
    System.out.println("White In Check: " + chess.checkOnWhiteKing());
    System.out.println("Black In Check: " + chess.checkOnBlackKing());
    System.out.println("\nMoving Queen b8 to h4");
    System.out.println("Works?: "  + chess.move(3, 0, 7, 4));
    System.out.println(chess);
    System.out.println("Checks: ");
    System.out.println("White In Check: " + chess.checkOnWhiteKing());
    System.out.println("Black In Check: " + chess.checkOnBlackKing());
    System.out.println("\nSaving Game");
    chess.saveGame();
    System.out.println();
    System.out.println("\nCreating a new game");
    chess.newGame("save2");
    System.out.println(chess);
    System.out.println("Checks: ");
    System.out.println("White In Check: " + chess.checkOnWhiteKing());
    System.out.println("Black In Check: " + chess.checkOnBlackKing());
    System.out.println("\nLoading the other game");
    chess.loadGame("save1");
    System.out.println(chess);
    System.out.println("Checks: ");
    System.out.println("White In Check: " + chess.checkOnWhiteKing());
    System.out.println("Black In Check: " + chess.checkOnBlackKing());
    //chess.printAllData();
    System.out.println("=====================================================================");
  }
}
