public class Pawn implements Piece{
  private int xCor;
  private int yCor;
  public Pawn(){
    xCor = 0;
    yCor = 0;
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
}
