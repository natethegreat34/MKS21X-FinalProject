public class Tester{
    // public static void main(String[] args) {
        // System.out.println("♜ ♞ ♝ ♛ ♚ ♝ ♞ ♜ \n♟ ♟ ♟ ♟ ♟ ♟   ♟ \n- - - - - - - -\n- - - - - - - -\n- - - - - - - -\n- - - - - - - -\n♙ ♙ ♙ ♙ ♙ ♙ ♙ ♙\n♖ ♘ ♗ ♕ ♔ ♗ ♘ ♖
        // ");}
// possible moves for each color is different character but all of the possible moves are
// making aother string to be read
// // ♜ ♞ ♝ ♛ ♚ ♝ ♞ ♜
//    x  x x  x  x  x x  x
//    x  x x  x  x  x    x
//    x       x        x x
//    x  x    x        x x
   //limtit king , calls the string dataBoard
   // get board if possible moves overlaps an "a"  make null.

   //limits the possible moves of all pieces based on situation
   private String[][] Khurt;
   private String[][] khurt;

   public String[][] getKhurt(){
       return Khurt;
   }
   public String[][] getkhurt(){
       return khurt;
   }

 public void checker (Piece inpt, String color){
     if (color.equals("K")){
         String[][] Khurt = inpt.getData();
     }
     if (color.equals("k")){
         String[][] khurt = inpt.getData();
     }
    int xCor = inpt.getX();
    int yCor = inpt.getY();
     // v
     boolean delete = false;
     for (int i = 1; yCor + i < 8; i ++){
       if(!delete){
         if (hurt[yCor + i][xCor]!= null){
           if (!(data[yCor + i][xCor].isEmpty())){
             if (data[yCor + i][xCor].getPiece().getColor().equals(inpt.getColor())){
               hurt[yCor + i][xCor] = null;
               delete = true;
             }
             else{
                 ;
               delete = true;
             }
           }
         }
       }
       else{
         hurt[yCor + i][xCor] = null;
       }
     }
     delete = false;
     // ^
     for (int i = 1; yCor - i >= 0; i ++){
       if(!delete){
         if (hurt[yCor - i][xCor] != null){
           if (!(data[yCor - i][xCor].isEmpty())){
             if (data[yCor - i][xCor].getPiece().getColor().equals(inpt.getColor())){
               hurt[yCor - i][xCor] = null;
               delete = true;
             }
             else{
               delete = true;
             }
           }
         }
       }
       else{
         hurt[yCor - i][xCor] = null;
       }
     }
     delete = false;
     // <
     for (int i = 1; xCor - i >= 0; i ++){
       if(!delete){
         if (hurt[yCor][xCor - i] != null){
           if (!(data[yCor][xCor - i].isEmpty())){
             if (data[yCor][xCor - i].getPiece().getColor().equals(inpt.getColor())){
               hurt[yCor][xCor - i] = null;
               delete = true;
             }
             else{
               delete = true;
             }
           }
         }
       }
       else{
         hurt[yCor][xCor - i] = null;
       }
     }
     delete = false;
     // >
     for (int i = 1; xCor + i < 8; i ++){
       if(!delete){
         if (hurt[yCor][xCor + i] != null){
           if (!(data[yCor][xCor + i].isEmpty())){
             if (data[yCor][xCor + i].getPiece().getColor().equals(inpt.getColor())){
               hurt[yCor][xCor + i] = null;
               delete = true;
             }
             else{
               delete = true;
             }
           }
         }
       }
       else{
         hurt[yCor][xCor + i] = null;
       }
     }
     delete = false;
     // >/
     for (int i = 1; xCor + i < 8 && yCor- i >= 0; i ++){
       if(!delete){
         if (hurt[yCor - i][xCor + i] != null){
           if (!(data[yCor - i][xCor + i].isEmpty())){
             if (data[yCor - i][xCor + i].getPiece().getColor().equals(inpt.getColor())){
               hurt[yCor - i][xCor + i] = null;
               delete = true;
             }
             else{
               delete = true;
             }
           }
         }
       }
       else{
         hurt[yCor - i][xCor + i] = null;
       }
     }
     delete = false;
     // <\
     for (int i = 1; xCor- i >= 0 && yCor- i >= 0; i ++){
       if(!delete){
         if (hurt[yCor - i][xCor - i] != null){
           //System.out.println("Pass Null");
           if (!(data[yCor - i][xCor - i].isEmpty())){
             //System.out.println("Pass isEmpty");
             if (data[yCor - i][xCor - i].getPiece().getColor().equals(inpt.getColor())){
               //System.out.println("Deletion Working");
               hurt[yCor - i][xCor - i] = null;
               delete = true;
             }
             else{
               delete = true;
             }
           }
         }
       }
       else{
         hurt[yCor - i][xCor - i] = null;
       }
     }
     delete = false;
     // >\
     for (int i = 1; xCor+ i < 8 && yCor+ i < 8; i ++){
       if(!delete){
         if (hurt[yCor + i][xCor + i] != null){
           if (!(data[yCor + i][xCor + i].isEmpty())){
             if (data[yCor + i][xCor + i].getPiece().getColor().equals(inpt.getColor())){
               hurt[yCor + i][xCor + i] = null;
               delete = true;
             }
             else{
               delete = true;
             }
           }
         }
       }
       else{
         hurt[yCor + i][xCor + i] = null;
       }
     }
     delete = false;
     // </
     for (int i = 1; xCor- i >= 0 && yCor+ i < 8; i ++){
       if(!delete){
         if (hurt[yCor + i][xCor - i] != null){
           if (!(data[yCor + i][xCor - i].isEmpty())){
             if (data[yCor + i][xCor - i].getPiece().getColor().equals(inpt.getColor())){
               hurt[yCor + i][xCor - i] = null;
               delete = true;
             }
             else{
               delete = true;
             }
           }
         }
       }
       else{
         hurt[yCor + i][xCor - i] = null;
       }
     }
     //special knight moves
     //will check the possible knight moves and limit import junit.framework.TestCase;
     if (yCor + 1 < 8){
       if (xCor + 2 < 8){
         if (hurt[yCor + 1][xCor + 2] != null){
           if (!(data[yCor + 1][xCor + 2].isEmpty())){
             if (data[yCor + 1][xCor + 2].getPiece().getColor().equals(inpt.getColor())){
               hurt[yCor + 1][xCor + 2] = null;
             }

           }
         }
       }

       if(xCor - 2 >= 0){
         if (hurt[yCor + 1][xCor - 2] != null){
           if (!(data[yCor + 1][xCor - 2].isEmpty())){
             if (data[yCor + 1][xCor - 2].getPiece().getColor().equals(inpt.getColor())){
               hurt[yCor + 1][xCor - 2] = null;
             }

           }
         }
       }
     }

     if(yCor + 2 < 8){
       if (xCor + 1 < 8){
         if (hurt[yCor + 2][xCor + 1] != null){
           if (!(data[yCor + 2][xCor + 1].isEmpty())){
             if (data[yCor + 2][xCor + 1].getPiece().getColor().equals(inpt.getColor())){
               hurt[yCor + 2][xCor + 1] = null;
             }

           }
         }
       }
       if (xCor - 1 >= 0){
         if (hurt[yCor + 2][xCor - 1] != null){
           if (!(data[yCor + 2][xCor - 1].isEmpty())){
             if (data[yCor + 2][xCor - 1].getPiece().getColor().equals(inpt.getColor())){
               hurt[yCor + 2][xCor - 1] = null;
             }

           }
         }
       }
     }

     if (yCor - 1 >= 0){
       if (xCor + 2 < 8){
         if (hurt[yCor - 1][xCor + 2] != null){
           if (!(data[yCor - 1][xCor + 2].isEmpty())){
             if (data[yCor - 1][xCor + 2].getPiece().getColor().equals(inpt.getColor())){
               hurt[yCor - 1][xCor + 2] = null;
             }

           }
         }
       }

       if (xCor - 2 >= 0){
         if (hurt[yCor - 1][xCor - 2] != null){
           if (!(data[yCor - 1][xCor - 2].isEmpty())){
             if (data[yCor - 1][xCor - 2].getPiece().getColor().equals(inpt.getColor())){
               hurt[yCor - 1][xCor - 2] = null;
             }
             else{
               hurt[yCor - 1][xCor - 2] = "x";
             }
           }
         }
       }
     }
     if (yCor - 2 >= 0){
       if (xCor + 1 < 8){
         if (hurt[yCor - 2][xCor + 1] != null){
           if (!(data[yCor - 2][xCor + 1].isEmpty())){
             if (data[yCor - 2][xCor + 1].getPiece().getColor().equals(inpt.getColor())){
               hurt[yCor - 2][xCor + 1] = null;
             }

           }
         }
       }
       if (xCor - 1 >= 0){
         if (hurt[yCor - 2][xCor - 1] != null){
           if (!(data[yCor - 2][xCor - 1].isEmpty())){
             if (data[yCor - 2][xCor - 1].getPiece().getColor().equals(inpt.getColor())){
               hurt[yCor - 2][xCor - 1] = null;
             }
           }
         }
       }
     }
     inpt.setData(hurt);
   }

public String [][] Kcheckerhelper (){
    //black pieces affecting white king
    checker(piece17, "K");
    checker(piece18, "K");
    checker(piece19, "K");
    checker(piece20, "K");
    checker(piece22, "K");
    checker(piece23, "K");
    checker(piece24, "K");
    checker(piece1, "K");
    checker(piece1, "K");
    checker(piece2, "K");
    checker(piece3, "K");
    checker(piece4, "K");
    checker(piece5, "K");
    checker(piece6, "K");
    checker(piece7, "K");
    return Khurt;
}
public String [][] kcheckerhelper (){
    //black pieces affecting white king
    checker(piece9, "k");
    checker(piece10, "k");
    checker(piece11, "k");
    checker(piece12, "k");
    checker(piece13, "k");
    checker(piece14, "k");
    checker(piece15, "k");
    checker(piece16, "k");
    checker(piece25, "k");
    checker(piece26, "k");
    checker(piece27, "k");
    checker(piece28, "k");
    checker(piece30, "k");
    checker(piece31, "k");
    checker(piece32, "k");
    return khurt;
}
public void Kinglimit(){
    String[][] nsp = getKhurt();
    limitPiece(piece21);
    for (int y = 0; y < 8; y ++){
        for (int x = 0; x < 8; x ++ ){
            if (nsp[y][x].equals("o") && data[y][x].equals("o")){
                data [y][x] = null;
            }
        }
    }
}
public void kinglimit(){
    String[][] nsp = getkhurt();
    limitPiece(piece29);
    for (int y = 0; y < 8; y ++){
        for (int x = 0; x < 8; x ++ ){
            if (nsp[y][x].equals("o") && data[y][x].equals("o")){
                data [y][x] = null;
            }
        }
    }
}

}
