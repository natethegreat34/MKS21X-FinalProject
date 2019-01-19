public class Pawn extends Piece {
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  private String[][] data;
  private int direction;
  private boolean hasmoved;
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
    direction = dir%2;
    hasmoved = false;
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

  public void setDir(int dir){
    direction = dir;
  }

  public boolean gethasmoved(){
    return hasmoved;
  }

  public void sethasmoved(boolean inpt){
    hasmoved = inpt;
  }

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

  public void updateData(){
    possibleMoves();
  }

  private void possibleMoves(){
      String [][] ppm = new String [8][8];
      if(direction == 0){
        if(!hasmoved){
          if (yCor + 2 < 8){
            // ^^ first time moving import junit.framework.TestCase;
            ppm [yCor + 2] [xCor] = "o";
          }
        // ^
        if (yCor + 1 < 8){
            // ^^ anytime moving import junit.framework.TestCase;
          ppm [yCor + 1] [xCor] = "o";
          }
      }
      // ^
      if (yCor + 1 < 8){
          // ^^ anytime moving import junit.framework.TestCase;
        ppm [yCor + 1] [xCor] = "o";
        }

        }

      if (direction == 1){
        if(!hasmoved){
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
        if (yCor - 1 >= 0){
            // ^^ anytime moving import junit.framework.TestCase;
            ppm [yCor - 1] [xCor] = "o";
        }
      }
      ppm [yCor][xCor] = "*";
      data = ppm;
  }
}
