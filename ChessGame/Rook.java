public class Rook extends Piece{
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  private int direction;
  private int moveNumber = 0;
  private boolean moved2;
  private String[][] data;

  public Rook(int x, int y, String colorWB){
    color = colorWB;
    if (color.equals("black")){
      type = "r";
    }
    if (color.equals("white")){
      type = "R";
    }
    xCor = x;
    yCor = y;
    possibleMoves();
  }
  //if it is a pawn and moves 2 spaces then it will mark if it moved2
  public boolean getMoved2(){
    return moved2;
  }
  //if it is a pawn and moves 2 spaces then it will mark if it moved2
  public void setMoved2(boolean inpt){
    moved2 = inpt;
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
      String [][] rpm = new String [8][8];
      //  v
      for (int i = 0; yCor+ i < 8; i ++){
          rpm [yCor + i] [xCor] = "o";
      }
      // ^
      for (int i = 0; yCor - i >= 0 ; i ++){
          rpm [yCor - i] [xCor] = "o";
      }
      // <
      for (int i = 0; xCor - i >= 0; i ++){
          rpm [yCor] [xCor - i] = "o";
      }
      // >
      for (int i = 0; xCor+ i < 8; i ++){
          rpm [yCor] [xCor + i] = "o";
      }
      rpm [yCor] [xCor] = "*";
      data = rpm;

      }
}
