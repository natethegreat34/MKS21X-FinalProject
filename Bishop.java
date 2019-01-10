public class Bishop{
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
    //for going / x - y = z; (x+-i)-(y+-i) = z
    // for going \ x + y = z; (x+-i)+(y+-i) = z
    public String [][] possiblemoves(int x, int y){
        String [][] bpm = new String [8][8];
        //  >/
        for (int i = 0; x + i < 8 && y + i < 8; i ++){
            bpm [x + i] [y + i] = "o";
        }
        // <\
        for (int i = 0; x - i < 8 && y + i < 8; i ++){
            bpm [x - i] [y + i] = "o";
        }
        // >\
        for (int i = 0; x + i < 8 && y - i < 8; i ++){
            bpm [x + i] [y - i] = "o";
        }
        // </
        for (int i = 0; x - i < 8 && y - i < 8; i ++){
            bpm [x - i] [y - i] = "o";
        }
        return bpm;

        }

}
