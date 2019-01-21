public class Pawn extends Piece {
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  private int direction;
  private int moveNumber = 0;
  private boolean moved2 = false;
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
  //if it is a pawn and moves 2 spaces then it will mark if it moved2
  public void setMoved2(boolean inpt){
    moved2 = inpt;
  }
  //if it is a pawn and moves 2 spaces then it will mark if it moved2
  public boolean getMoved2(){
    return moved2;
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
   //returns the type
   public String getType(){
     return type;
   }
   // returns its data which shows all the possible moves
   public String[][] getData(){
     return data;
   }
   // sets the data, used in limitpiece and move
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
   //tells how many times the piece moved
   public void increaseMoveNumber(){
     moveNumber++;
   }
   //returns move number it is at
   public int getMoveNumber(){
     return moveNumber;
   }
   //this will reset its data if it moves its
   public void updateData(){
     possibleMoves();
   }
   //only really used with pawn to set which direction it can move
   public void setDir(int dir){
     direction = dir % 2;
   }
   //based on its coordinates it will make the possible moves
   private void possibleMoves(){
      String [][] ppm = new String [8][8];
      if(direction == 0){
        if(getMoveNumber() == 0){
          if (yCor + 2 < 8){
            // ^^ first time moving import junit.framework.TestCase;
            ppm [yCor + 2] [xCor] = "P";
          }
        }
        // ^
        if (yCor + 1 < 8){
            // ^^ anytime moving import junit.framework.TestCase;
          ppm [yCor + 1] [xCor] = "o";
          }
        }
      if (direction == 1){
        if(getMoveNumber() == 0){
          if (yCor - 2 >= 0){
              // ^^ first time moving import junit.framework.TestCase;
              ppm [yCor - 2] [xCor] = "P";
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
