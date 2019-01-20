public class Queen extends Piece{
  private int xCor;
  private int yCor;
  private String color;
  private String type;
  private int direction;
  private int moveNumber = 0;
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
    possibleMoves();
  }
  

  private void possibleMoves(){
    data = new String[8][8];
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
