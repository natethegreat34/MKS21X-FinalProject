public class Knight extends Piece{
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  private int direction;
  private int moveNumber = 0;
  private String[][] data;

  public Knight(int x, int y, String colorWB){
    color = colorWB;
    if (color.equals("black")){
      type = "n";
    }
    if (color.equals("white")){
      type = "N";
    }
    xCor = x;
    yCor = y;
    possibleMoves();
  }
  

  private void possibleMoves(){
    data = new String[8][8];
    if (yCor + 1 < 8){
      if (xCor + 2 < 8){
       data[yCor + 1][xCor + 2] = "o";
      }
      if (xCor - 2  >= 0){
       data[yCor + 1][xCor - 2] = "o";
      }
    }
    if (yCor + 2 < 8){
      if (xCor + 1 < 8){
       data[yCor + 2][xCor + 1] = "o";
      }
      if (xCor - 1  >= 0){
       data[yCor + 2][xCor - 1] = "o";
      }
    }
    if (yCor - 1 >= 0){
      if (xCor + 2 < 8){
       data[yCor - 1][xCor + 2] = "o";
      }
      if (xCor - 2  >= 0){
       data[yCor - 1][xCor - 2] = "o";
      }
    }
    if (yCor - 2 >= 0){
      if (xCor + 1 < 8){
       data[yCor - 2][xCor + 1] = "o";
      }
      if (xCor - 1  >= 0){
       data[yCor - 2][xCor - 1] = "o";
      }
    }
    data[yCor][xCor] = "*";
  }
}
