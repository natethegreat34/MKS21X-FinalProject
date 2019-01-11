public class King extends Piece{
  private int xCor;
  private int yCor;
  private String color;
  private String type;

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
  }

  public String getType(){
    //returns it type
    return type;
  }

  public String [][] possiblemoves(){
      String [][] kpm = new String [8][8];
      if (yCor + 1 < 8){
        // ^
        kpm [yCor + 1] [xCor] = "o";
      }
      if (yCor - 1 >= 0){
        // v
        kpm [yCor - 1] [xCor] = "o";
      }
      if (yCor+ 1 < 8 && xCor+ 1 < 8){
        // />
        kpm [yCor+ 1] [xCor+ 1] = "o";
        // >
        kpm [yCor+ 1] [xCor] = "o";
      }
      if (yCor+ 1 < 8 && xCor- 1 >= 0){
        // \>
        kpm [yCor + 1] [xCor- 1] = "o";
      }
      if (yCor- 1 >=0 && xCor- 1 >= 0){
        // </
        kpm [yCor - 1] [xCor - 1] = "o";
        // <
        kpm [yCor  - 1] [xCor] = "o";
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
      return kpm;
    }
}
