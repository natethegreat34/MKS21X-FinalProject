public class Knight extends Piece{
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  private int direction;
  private int moveNumber = 0;
  private String[][] data;

  public Knight(int x, int y, String colorWB){
    color = colorWB;
    if (color.equals("black")){
      type = "n";
    }
    if (color.equals("white")){
      type = "N";
    }
    xCor = x;
    yCor = y;
    possibleMoves();
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
    data = new String[8][8];
    if (yCor + 1 < 8){
      if (xCor + 2 < 8){
       data[yCor + 1][xCor + 2] = "o";
      }
      if (xCor - 2  >= 0){
       data[yCor + 1][xCor - 2] = "o";
      }
    }
    if (yCor + 2 < 8){
      if (xCor + 1 < 8){
       data[yCor + 2][xCor + 1] = "o";
      }
      if (xCor - 1  >= 0){
       data[yCor + 2][xCor - 1] = "o";
      }
    }
    if (yCor - 1 >= 0){
      if (xCor + 2 < 8){
       data[yCor - 1][xCor + 2] = "o";
      }
      if (xCor - 2  >= 0){
       data[yCor - 1][xCor - 2] = "o";
      }
    }
    if (yCor - 2 >= 0){
      if (xCor + 1 < 8){
       data[yCor - 2][xCor + 1] = "o";
      }
      if (xCor - 1  >= 0){
       data[yCor - 2][xCor - 1] = "o";
      }
    }
    data[yCor][xCor] = "*";
  }
}
