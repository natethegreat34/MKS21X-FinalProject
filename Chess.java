public class Chess{
private String [] [] board;
public Chess (){
      board = new String [8][8];
      clear();
        }
public String toString(){
          String life = "   a b c  d  e  f  g  h";
          life = life + "\n";
          String sad = life;
          int number = 8;
          for (int x = 0; x < board.length; x ++){
            sad = sad + + number + " |";
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
          board[x][y] = "__";
        }
      }
    }
}
// private void save();
//
//
// }
