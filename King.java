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
      if (yCor+ 1 < 8){
        // ^
        kpm [xCor] [yCor+ 1] = "o";
      }
      if (yCor- 1 >= 0){
        // v
        kpm [xCor] [yCor- 1] = "o";
      }
      if (xCor+ 1 < 8 && yCor+ 1 < 8){
        // />
        kpm [xCor+ 1] [yCor+ 1] = "o";
        // >
        kpm [xCor+ 1] [yCor] = "o";
      }
      if (xCor+ 1 < 8 && yCor- 1 >= 0){
        // \>
        kpm [xCor+ 1] [yCor- 1] = "o";
      }
      if (xCor- 1 >=0 && yCor- 1 >= 0){
        // </
        kpm [xCor- 1] [yCor- 1] = "o";
        // <
        kpm [xCor- 1] [yCor] = "o";
      }
      if (xCor- 1 >= 0 && yCor+ 1 < 8){
        // <\
        kpm [xCor- 1] [yCor+ 1] = "o";
      }
      if (xCor+ 2 < 8 || xCor- 2 >= 0){
        //Castle Kingside
        kpm [xCor+ 2] [yCor] = "o";
        //Castle Queenside
        kpm [xCor- 2] [yCor] = "o";
      }
      return kpm;
    }
}
