public class Rook extends Piece {
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  private String[][] data;

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
    possibleMoves();
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

  private String [][] possibleMoves(){
      String [][] rpm = new String [8][8];
      //  >
      for (int i = 0; yCor+ i < 8; i ++){
          rpm [yCor + i] [xCor] = "o";
      }
      // <
      for (int i = 0; yCor - i >= 0 ; i ++){
          rpm [yCor - i] [xCor] = "o";
      }
      // v
      for (int i = 0; xCor - i >= 0; i ++){
          rpm [yCor] [xCor - i] = "o";
      }
      // ^
      for (int i = 0; xCor+ i < 8; i ++){
          rpm [yCor] [xCor + i] = "o";
      }
      rpm [yCor] [xCor] = "*";
      data = rpm;

      }
}
