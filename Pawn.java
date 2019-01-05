public class Pawn implements Piece{
  private int xCor;
  private int yCor;
  private int moveNumber;
  public Pawn(){
    xCor = 0;
    yCor = 0;
    moveNumber = 0;
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
  public boolean move(int x, int y){
    return false;
  }
  public String getLocation(){
    String ans = "";
    String letters = "abcdefgh";
    ans += letters.substring(xCor,xCor+1);
    ans += yCor;
    return ans;
  }
}
