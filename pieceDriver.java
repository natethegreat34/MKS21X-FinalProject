public class pieceDriver{
    public static void main(String[] args) {
      Bishop bishop = new Bishop(7, 2, "black");
      System.out.println(Piece.movesString(bishop.possiblemoves()));
    }
}
