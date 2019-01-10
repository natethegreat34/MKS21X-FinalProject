public class Piece{
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  public Piece(String colorWB) {
    color = colorWB;
    if (color.equals("black")){
      type = "blackpiece";
    }
    if (color.equals("white")){
      type = "blackpiece";
    }
  }
  public int getX(){
    return xCor;
  }
  public int getY(){
    return yCor;
  }
  public int setX(int x){
    int oldVal = xCor;
    xCor = x;
    return oldVal;
  }
  public int setY(int y){
    int oldVal = yCor;
    yCor = y;
    return oldVal;
  }
  public String getColor(){
    return color;
  }
  public String getType(){
    return type;
  }
  public String getLocation(){
    String ans = "";
    String letters = "abcdefgh";
    ans += letters.substring(xCor,xCor+1);
    ans += yCor;
    return ans;
  }
}
