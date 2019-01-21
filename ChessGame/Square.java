public class Square {

  private Piece stored;
  private boolean taken;
  private int xCor;
  private int yCor;
  private boolean isMoveable;

  public Square(int x, int y){
      stored = null;
      taken = false;
      xCor = x;
      yCor = y;
  }

  public boolean isMoveable(){
    return isMoveable;
  }

  public void setMoveable(boolean inpt){
    isMoveable = inpt;
  }

  public boolean isEmpty(){
      return !taken;
  }

  public Piece getPiece(){
      return stored;
  }

  public void setPiece(Piece noob){
      stored = noob;
      taken = true;
      noob.setX(xCor);
      noob.setY(yCor);
  }

  public Piece removePiece(){
      Piece bye = stored;
      stored = null;
      taken = false;
      return bye;
  }
}
