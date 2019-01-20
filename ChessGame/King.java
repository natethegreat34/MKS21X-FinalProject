public class King extends Piece{
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  private int direction;
  private int moveNumber = 0;
  private String[][] data;

  public King(int x, int y, String colorWB){
    //sets the color
    color = colorWB;
    //sets it type
    if (color.equals("black")){
      type = "k";
    }
    if (color.equals("white")){
      type = "K";
    }
    //sets its coordinates
    xCor = x;
    yCor = y;
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
        kpm [yCor] [xCor + 2] = "C";
      }
      if (xCor- 2 >= 0){
        //Castle Queenside
        kpm [yCor] [xCor - 2] = "c";
      }
      kpm[yCor][xCor] = "*";
      data = kpm;
    }
  }
