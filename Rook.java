
public class Rook {
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
  public String [][] possiblemoves(int x, int y){
      String [][] rpm = new String [8][8];
      //  >
      for (int i = 0; x + i < 8; i ++){
          rpm [x + i] [y] = "o";
      }
      // <
      for (int i = 0; x - i < 8 ; i ++){
          rpm [x - i] [y] = "o";
      }
      // v
      for (int i = 0; y - i < 8; i ++){
          rpm [x] [y - i] = "o";
      }
      // ^
      for (int i = 0; y + i < 8; i ++){
          rpm [x] [y + i] = "o";
      }
      rpm [x] [y] = "*";
      return rpm;

      }
}
