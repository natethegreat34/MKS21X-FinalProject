public class Square {

  private Piece stored;
  private boolean taken;
  private int xCor;
  private int yCor;

  public Square(int x, int y){
      stored = null;
      taken = false;
      xCor = x;
      yCor = y;
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
      noob.updateData();
  }

  public Piece removePiece(){
      Piece bye = stored;
      stored = null;
      taken = false;
      return bye;
  }
}
