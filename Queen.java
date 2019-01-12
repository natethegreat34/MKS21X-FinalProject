public class Queen extends Piece{
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  private String[][] data;

  public Queen(int x, int y, String colorWB){
    color = colorWB;
    if (color.equals("black")){
      type = "q";
    }
    if (color.equals("white")){
      type = "Q";
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
