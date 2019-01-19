public class Rook extends Piece {
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  private String[][] data;
  private boolean Rookmoved;

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
  public void setRookmoved(boolean x){
      Rookmoved = x;
  }
  public boolean getRookmoved(){
      return Rookmoved;
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
      if (!Rookmoved){
          if(xCor == 0){
              xCor = 2;
          }
          if(xCor == 7){
              xCor = 5;
          }
      }
      rpm [yCor] [xCor] = "*";
      data = rpm;

      }
}
