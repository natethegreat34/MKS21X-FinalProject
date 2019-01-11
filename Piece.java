public class Piece{
  private int xCor;
  private int yCor;
  private String color;
  private String type;
 //returns the xcoordinate
  public int getX(){
    return xCor;
  }
  //returns the ycoordinate
  public int getY(){
    return yCor;
  }
  //sets the xcoordinate
  public int setX(int x){
    int oldVal = xCor;
    xCor = x;
    return oldVal;
  }
  //sets the ycoordinate
  public int setY(int y){
    int oldVal = yCor;
    yCor = y;
    return oldVal;
  }
  //returns thec color
  public String getColor(){
    return color;
  }
  //returns the type
  public String getType(){
    return type;
  }
  //returns the location
  public String getLocation(){
    String ans = "";
    String letters = "abcdefgh";
    ans += letters.substring(xCor,xCor+1);
    ans += yCor;
    return ans;
  }
  //prints the String of the moveArray made by the pieces possibleMoves methods
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
