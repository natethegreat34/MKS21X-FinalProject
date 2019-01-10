public class pieceDriver{
    public static void main(String[] args) {
      Bishop bishop = new Bishop(2, 7, "black");
      System.out.println(Piece.movesString(bishop.possiblemoves(2, 7)));
    }
}
