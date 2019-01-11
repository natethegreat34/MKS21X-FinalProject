public class Rook extends Piece {
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  public Rook(int x, int y, String colorWB){
    color = colorWB;
    if (color.equals("black")){
      type = "br";
    }
    if (color.equals("white")){
      type = "wr";
    }
    xCor = x;
    yCor = y;
  }
  public String getType(){
    return type;
  }
  public String [][] possiblemoves(){
      String [][] rpm = new String [8][8];
      //  >
      for (int i = 0; xCor+ i < 8; i ++){
          rpm [xCor + i] [yCor] = "o";
      }
      // <
      for (int i = 0; xCor - i >= 0 ; i ++){
          rpm [xCor - i] [yCor] = "o";
      }
      // v
      for (int i = 0; yCor - i >= 0; i ++){
          rpm [xCor] [yCor - i] = "o";
      }
      // ^
      for (int i = 0; yCor+ i < 8; i ++){
          rpm [xCor] [yCor + i] = "o";
      }
      rpm [xCor] [yCor] = "*";
      return rpm;

      }
}
