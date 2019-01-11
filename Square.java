public class Square {

  private Piece stored;
  private boolean taken;
  private int xCor;
  private int yCor;

  public Square (){
      stored = null;
      taken = false;
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
  }

  public Piece removePiece(){
      Piece bye = stored;
      stored = null;
      taken = false;
      return bye;
  }
}
