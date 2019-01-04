public class Piece{
  private String name;
  private Location square;
  public Piece(String pieceName, Location coordinate){
    name = pieceName;
    square = coordinate;
  }


  public boolean movable (String name, Location square)
  public Location move (String name, Location square);
  public boolean incheck (Location square);
  public boolean checkmated (Location square);

}
