public class Queen extends Piece{
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  public Queen(int x, int y, String colorWB){
    color = colorWB;
    if (color.equals("black")){
      type = "bq";
    }
    if (color.equals("white")){
      type = "wq";
    }
    xCor = x;
    yCor = y;
  }
  public String getType(){
    return type;
  }
}
