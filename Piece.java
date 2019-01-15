public class Piece{
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  private int direction;
  private boolean hasmoved;
  private String[][] data = new String[8][8];
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

  public String[][] getData(){
    return data;
  }

  public void setData(String[][] inpt){
    data = inpt;
  }

  //returns the location
  public String getLocation(){
    String ans = "";
    String letters = "abcdefgh";
    ans += letters.substring(xCor,xCor+1);
    ans += yCor;
    return ans;
  }

  public void updateData(){
    possibleMoves();
  }

  public void setDir(int dir){
    direction = dir;
  }

  public boolean gethasmoved(){
    return hasmoved;
  }

  public void sethasmoved(boolean inpt){
    hasmoved = inpt;
  }

  private void possibleMoves(){
    for (int y = 0; y < data.length; y++){
      for(int x = 0; x < data[y].length; x++){
        data[y][x] = "o";
      }
    }
  }
  //prints the String of the moveArray made by the pieces possibleMoves methods
  public static String movesString(String[][] inpt){
    String ans = "";
    for (int y = 0; y < inpt.length; y++){
      String line = "";
      for (int x = 0; x < inpt[y].length; x++){
        if(inpt[y][x] == null){
          line += "_ ";
        }
        else{
          line += inpt[y][x] + " ";
        }
      }
      line += "\n";
      ans += line;
    }
    return ans;
  }
}
