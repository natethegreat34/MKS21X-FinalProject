
public class Rook {
  public String [][] possiblemoves(int x, int y){
      String [][] rpm = new String [8][8];
      //  >
      for (int i = 0; x + i < 8; i ++){
          rpm [x + i] [y] = "o";
      }
      // <
      for (int i = 0; x - i < 8 ; i ++){
          rpm [x - i] [y] = "o";
      }
      // v
      for (int i = 0; y - i < 8; i ++){
          rpm [x] [y - i] = "o";
      }
      // ^
      for (int i = 0; y + i < 8; i ++){
          rpm [x] [y + i] = "o";
      }
      rpm [x] [y] = "*";
      return rpm;

      }
}
