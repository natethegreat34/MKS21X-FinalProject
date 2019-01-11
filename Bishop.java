public class Bishop extends Piece{
    private int xCor;
    private int yCor;
    private String color;
    private String type;
    public Bishop(int x, int y, String colorWB){
      color = colorWB;
      if (color.equals("black")){
        type = "bb";
      }
      if (color.equals("white")){
        type = "wb";
      }
      xCor = x;
      yCor = y;
    }
    public String getType(){
      return type;
    }
    //Bishop
    //for going / xCor- yCor= z; (x+-i)-(y+-i) = z
    // for going \ xCor+ yCor= z; (x+-i)+(y+-i) = z
    public String [][] possiblemoves(){
        String [][] bpm = new String [8][8];
        //  >/
        for (int i = 0; xCor + i < 8 && yCor- i >= 0; i ++){
            bpm [yCor - i] [xCor + i] = "o";
        }
        // <\
        for (int i = 0; xCor- i >= 0 && yCor- i >= 0; i ++){
            bpm [yCor- i] [xCor- i] = "o";
        }
        // >\
        for (int i = 0; xCor+ i < 8 && yCor+ i < 8; i ++){
            bpm [yCor+ i] [xCor+ i] = "o";
        }
        // </
        for (int i = 0; xCor- i >= 0 && yCor+ i < 8; i ++){
            bpm [yCor + i] [xCor - i] = "o";
        }
        bpm [yCor] [xCor] = "*";
        return bpm;

        }

}
