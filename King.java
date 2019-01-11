public class King extends Piece{
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  public King(int x, int y, String colorWB){
    color = colorWB;
    if (color.equals("black")){
      type = "bk";
    }
    if (color.equals("white")){
      type = "wk";
    }
    xCor = x;
    yCor = y;
  }
  public String getType(){
    return type;
  }

  public String [][] possiblemoves(int x, int y){
      String [][] kpm = new String [8][8];
      if (y + 1 < 8){
        // ^
        kpm [x] [y + 1] = "o";
      }
      if (y - 1 >= 0){
        // v
        kpm [x] [y - 1] = "o";
      }
      if (x + 1 < 8 && y + 1 < 8){
        // />
        kpm [x + 1] [y + 1] = "o";
        // >
        kpm [x + 1] [y] = "o";
      }
      if (x + 1 < 8 && y - 1 >= 0){
        // \>
        kpm [x + 1] [y - 1] = "o";
      }
      if (x - 1 >=0 && y - 1 >= 0){
        // </
        kpm [x - 1] [y - 1] = "o";
        // <
        kpm [x - 1] [y] = "o";
      }
      if (x - 1 >= 0 && y + 1 < 8){
        // <\
        kpm [x - 1] [y + 1] = "o";
      }
      if (x + 2 < 8 || x - 2 >= 0){
        //Castle Kingside
        kpm [x + 2] [y] = "o";
        //Castle Queenside
        kpm [x - 2] [y] = "o";
      }
      return kpm;
    }
}
