public class Piece{
  //the instance variables
  private int xCor;
  private int yCor;
  private int moveNumber;
  //returns current x coordinate
  public int getX(){
    return xCor;
  }
  //returns current y coordinate
  public int getY(){
    return yCor;
  }
  //sets x coordinate
  public int setX(int x){
    int oldVal = xCor;
    xCor = x;
    //returns the old x coordinate
    return oldVal;
  }
  //sets y coordinate
  public int setY(int y){
    int oldVal = yCor;
    yCor = y;
    //returns the old y coordinate
    return oldVal;
  }
  public boolean move(String piece, int x, int y){

  }
  public String getLocation(){
    String ans = "";
    //since the x position is always called by one of the firest eight letter of the alphabet
    //it will choose a letter from the letters string
    String letters = "abcdefgh";
    //the first part of the location will be the x coordinate will the letter
    ans += letters.substring(xCor,xCor+1);
    //the second part of the location is just the number value of the y coordinate
    ans += yCor;
    return ans;
  }
}
