public class Piece{
  private int xCor;
  private int yCor;
  private String color;
  private String type;

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
  public static String movesString(String[][] inpt){
    String ans = "";
    for (int x = 0; x < inpt.length; x++){
      String line = "";
      for (int y = 0; y < inpt[x].length; y++){
        line += inpt[x][y] + " ";
      }
      line += "\n";
      ans += line;
    }
    return ans;
  }
}
