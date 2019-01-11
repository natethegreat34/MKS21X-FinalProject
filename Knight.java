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
}
