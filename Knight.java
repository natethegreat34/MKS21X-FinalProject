public class Knight extends Piece{
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  private String[][] data;

  public Knight(int x, int y, String colorWB){
    color = colorWB;
    if (color.equals("black")){
      type = "bn";
    }
    if (color.equals("white")){
      type = "wn";
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
