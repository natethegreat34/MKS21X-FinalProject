public class Pawn extends Piece{
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  public Pawn(int x, int y, String colorWB){
    color = colorWB;
    if (color.equals("black")){
      type = "bp";
    }
    if (color.equals("white")){
      type = "wp";
    }
    xCor = x;
    yCor = y;
  }
  public String getType(){
    return type;
  }
}
