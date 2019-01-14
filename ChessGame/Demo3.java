public class Demo3{
  public static void main(String[] args) {
    System.out.println("=====================================================================");
    System.out.println("Loading Demo Interactive");
    Chessboard chess =  new Chessboard();
    chess.loadGame("demo3.txt");
    System.out.println(chess);
    System.out.println("Checks: ");
    System.out.println("White In Check: " + chess.checkOnWhiteKing());
    System.out.println("Black In Check: " + chess.checkOnBlackKing());
    System.out.println("=====================================================================");
  }
}
