public class Pawn extends Piece {
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  private String[][] data;
  private int direction;
  private boolean move2;
  public Pawn(int x, int y, String colorWB, int dir){
    color = colorWB;
    if (color.equals("black")){
      type = "bp";
    }
    if (color.equals("white")){
      type = "wp";
    }
    xCor = x;
    yCor = y;
    direction = dir%2;
    move2 = true;
    possibleMoves();
  }

  public String getType(){
    return type;
  }

  public String[][] getData(){
    return data;
  }

  public void setData(String[][] inpt){
    data = inpt;
  }

  public boolean canMove2(){
    return move2;
  }

  public void setMove2(boolean inpt){
    move2 = inpt;
  }

  private void possibleMoves(){
      String [][] ppm = new String [8][8];
      if(direction == 0){
        if(move2){
          if (yCor + 2 < 8){
            // ^^ first time moving import junit.framework.TestCase;
            ppm [yCor + 2] [xCor] = "o";
          }
        }
        // ^
        if (yCor + 1 < 8){
            // ^^ anytime moving import junit.framework.TestCase;
          ppm [yCor + 1] [xCor] = "o";
          }
        }
      if (direction == 1){
        if(move2){
          if (yCor - 2 < 8){
              // ^^ first time moving import junit.framework.TestCase;
              ppm [yCor - 2] [xCor] = "o";
          }
        }
        // ^
        if (yCor - 1 < 8){
            // ^^ anytime moving import junit.framework.TestCase;
            ppm [yCor - 1] [xCor] = "o";
        }
      }
      ppm [yCor][xCor] = "*";
      data = ppm;
  }
}
