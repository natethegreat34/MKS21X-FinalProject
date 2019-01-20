public class Rook extends Piece{
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  private int direction;
  private int moveNumber = 0;
  private String[][] data;

  public Rook(int x, int y, String colorWB){
    color = colorWB;
    if (color.equals("black")){
      type = "r";
    }
    if (color.equals("white")){
      type = "R";
    }
    xCor = x;
    yCor = y;
    possibleMoves();
  }

  private void possibleMoves(){
      String [][] rpm = new String [8][8];
      //  v
      for (int i = 0; yCor+ i < 8; i ++){
          rpm [yCor + i] [xCor] = "o";
      }
      // ^
      for (int i = 0; yCor - i >= 0 ; i ++){
          rpm [yCor - i] [xCor] = "o";
      }
      // <
      for (int i = 0; xCor - i >= 0; i ++){
          rpm [yCor] [xCor - i] = "o";
      }
      // >
      for (int i = 0; xCor+ i < 8; i ++){
          rpm [yCor] [xCor + i] = "o";
      }
      rpm [yCor] [xCor] = "*";
      data = rpm;

      }
}
