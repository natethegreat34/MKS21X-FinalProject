public class King extends Piece{
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  private String[][] data;

  public King(int x, int y, String colorWB){
    //sets the color
    color = colorWB;
    //sets it type
    if (color.equals("black")){
      type = "bk";
    }
    if (color.equals("white")){
      type = "wk";
    }
    //sets its coordinates
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
  public String getType(){
    //returns it type
    return type;
  }

  public String[][] getData(){
    return data;
  }

  public void setData(String[][] inpt){
    data = inpt;
  }

  public void updateData(){
    possibleMoves();
  }

  private void possibleMoves(){
      String [][] kpm = new String [8][8];
      if (yCor + 1 < 8){
        // V
        kpm [yCor + 1] [xCor] = "o";
      }
      if (yCor - 1 >= 0){
        // ^
        kpm [yCor - 1] [xCor] = "o";
      }
      if (yCor+ 1 < 8 && xCor+ 1 < 8){
        // />
        kpm [yCor+ 1] [xCor+ 1] = "o";
      }
      if (xCor + 1 < 8){
        // >
        kpm [yCor] [xCor + 1] = "o";
      }
      if (yCor+ 1 < 8 && xCor- 1 >= 0){
        // \>
        kpm [yCor + 1] [xCor- 1] = "o";
      }
      if (yCor- 1 >=0 && xCor- 1 >= 0){
        // </
        kpm [yCor - 1] [xCor - 1] = "o";
      }
      if (xCor - 1 >= 0){
        // <
        kpm [yCor] [xCor - 1] = "o";
      }
      if (yCor- 1 >= 0 && xCor+ 1 < 8){
        // <\
        kpm [yCor- 1] [xCor + 1] = "o";
      }
      if (xCor + 2 < 8){
        //Castle Kingside
        kpm [yCor] [xCor + 2] = "o";
      }
      if (xCor- 2 >= 0){
        //Castle Queenside
        kpm [yCor] [xCor - 2] = "o";
      }
      kpm[yCor][xCor] = "*";
      data = kpm;
    }
  }
