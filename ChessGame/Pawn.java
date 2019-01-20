public class Pawn extends Piece {
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  private int direction;
  private int moveNumber = 0;
  private String[][] data;
  
  public Pawn(int x, int y, String colorWB, int dir){
    color = colorWB;
    if (color.equals("black")){
      type = "p";
    }
    if (color.equals("white")){
      type = "P";
    }
    xCor = x;
    yCor = y;
    direction = dir % 2;
    possibleMoves();
  }

  private void possibleMoves(){
      String [][] ppm = new String [8][8];
      if(direction == 0){
        if(super.getMoveNumber() > 0){
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
        if(super.getMoveNumber() > 0){
          if (yCor - 2 >= 0){
              // ^^ first time moving import junit.framework.TestCase;
              ppm [yCor - 2] [xCor] = "o";
          }
        }
        // ^
        if (yCor - 1 >= 0){
            // ^^ anytime moving import junit.framework.TestCase;
            ppm [yCor - 1] [xCor] = "o";
        }
      }
      ppm [yCor][xCor] = "*";
      data = ppm;
  }
}
