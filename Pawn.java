public class Pawn extends Piece {
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  public Pawn(int x, int y, String colorWB){
    color = colorWB;
    if (color.equals("black")){
      type = "bp";
    }
    if (color.equals("white")){
      type = "wp";
    }
    xCor = x;
    yCor = y;
  }
  public String getType(){
    return type;
  }
    public String [][] possiblemoves(int x, int y){
        String [][] ppm = new String [8][8];
        if (y + 2 < 8){
            // ^^ first time moving import junit.framework.TestCase;
            ppm [x] [y + 2] = "o";
        }
            // ^
        if (y + 1 < 8){
            // ^^ anytime moving import junit.framework.TestCase;
                ppm [x] [y + 1] = "o";
            }
            ppm [x][y] = "*";
            return ppm;
}
}
