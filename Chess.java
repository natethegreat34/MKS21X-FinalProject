public class Chess{
private String [] [] board;
public Chess (){
      board = new String [8][8];
      clear();
      setup();
        }
public String toString(){
          String life = "   a b c  d  e  f  g  h";
          life = life + "\n";
          String sad = life;
          int number = 8;
          for (int x = 0; x < board.length; x ++){
            sad = sad + number + " |";
            for (int y = 0; y < board[x].length; y ++){
              sad = sad + board [x][y] + " ";
            }
            sad = sad + "| " + number;
            sad = sad + "\n";
            number --;
        }
        sad = sad + life;
        return sad;
      }

private void clear(){
for (int x = 0; x < 8; x ++){
        for (int y = 0; y < 8; y ++){
          board[x][y] = "_";
        }
      }
    }

    // need to call each piece and set location
public void setup(){
    //black rooks
    board[0][0] = "r";
    board[0][7] = "r";
    //white rooks
    board[7][0] = "R";
    board[7][7] = "R";
    //black knights
    board[0][1] = "n";
    board[0][6] = "n";
    //white knights
    board[7][1] = "N";
    board[7][6] = "N";
    //black bishops
    board[0][2] = "b";
    board[0][5] = "b";
    //white bishops
    board[7][2] = "B";
    board[7][5] = "B";
    //black king and queen
    board[0][3] = "k";
    board[0][4] = "q";
    //white king and quen
    board[7][3] = "K";
    board[7][4] = "Q";
    //black pawns
    for (int n = 0; n < 8; n ++){
        board [1][n] = "p";
    }
    //white pawns
    for (int n = 0; n < 8; n ++){
        board [6][n] = "P";
    }

}
}
// private void save();
//
//
// }
