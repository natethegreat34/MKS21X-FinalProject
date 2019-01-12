public class Bishop extends Piece{
<<<<<<< HEAD
    private int xCor;
    private int yCor;
    private String color;
    private String type;
    private String[][] data;

    public Bishop(int x, int y, String colorWB){
      color = colorWB;
      if (color.equals("black")){
        type = "b";
      }
      if (color.equals("white")){
        type = "B";
      }
      xCor = x;
      yCor = y;
      possibleMoves();
    }
=======
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  private String[][] data;
>>>>>>> devlimitPiecemethod

  public Bishop(int x, int y, String colorWB){
    color = colorWB;
    if (color.equals("black")){
      type = "bb";
    }
    if (color.equals("white")){
      type = "wb";
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

  public String getType(){
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

  //Bishop
  //for going / xCor- yCor= z; (x+-i)-(y+-i) = z
  // for going \ xCor+ yCor= z; (x+-i)+(y+-i) = z
  private void possibleMoves(){
      String [][] bpm = new String [8][8];
      //  >/
      for (int i = 0; xCor + i < 8 && yCor - i >= 0; i ++){
          bpm [yCor - i] [xCor + i] = "o";
      }
      // <\
      for (int i = 0; xCor- i >= 0 && yCor- i >= 0; i ++){
          bpm [yCor- i] [xCor- i] = "o";
      }
      // >\
      for (int i = 0; xCor+ i < 8 && yCor+ i < 8; i ++){
          bpm [yCor+ i] [xCor+ i] = "o";
      }
      // </
      for (int i = 0; xCor- i >= 0 && yCor+ i < 8; i ++){
          bpm [yCor + i] [xCor - i] = "o";
      }
      bpm [yCor] [xCor] = "*";
      data = bpm;

      }

}
