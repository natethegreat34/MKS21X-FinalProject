public class Pawn extends Piece{
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  public Pawn(String colorWB){
    color = colorWB;
    if (color.equals("black")){
      type = "bp";
    }
    if (color.equals("white")){
      type = "wp";
    }
  }
  public String getType(){
    return type;
  }
}
