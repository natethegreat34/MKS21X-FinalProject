public class Queen extends Piece{
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  private String[][] data;

  public Queen(int x, int y, String colorWB){
    color = colorWB;
    if (color.equals("black")){
      type = "bq";
    }
    if (color.equals("white")){
      type = "wq";
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
    //  >/
    for (int i = 0; xCor + i < 8 && yCor- i >= 0; i ++){
        data [yCor - i] [xCor + i] = "o";
    }
    // <\
    for (int i = 0; xCor- i >= 0 && yCor- i >= 0; i ++){
        data [yCor- i] [xCor- i] = "o";
    }
    // >\
    for (int i = 0; xCor+ i < 8 && yCor+ i < 8; i ++){
        data [yCor+ i] [xCor+ i] = "o";
    }
    // </
    for (int i = 0; xCor- i >= 0 && yCor+ i < 8; i ++){
        data [yCor + i] [xCor - i] = "o";
    }
    //  >
    for (int i = 0; yCor+ i < 8; i ++){
        data [yCor + i] [xCor] = "o";
    }
    // <
    for (int i = 0; yCor - i >= 0 ; i ++){
        data [yCor - i] [xCor] = "o";
    }
    // v
    for (int i = 0; xCor - i >= 0; i ++){
        data [yCor] [xCor - i] = "o";
    }
    // ^
    for (int i = 0; xCor+ i < 8; i ++){
        data [yCor] [xCor + i] = "o";
    }
    data[yCor][xCor] = "*";
  }
}
