public class Bishop{
    //Bishop
    //for going / x - y = z; (x+-i)-(y+-i) = z
    // for going \ x + y = z; (x+-i)+(y+-i) = z
    public String [][] possiblemoves(int x, int y){
        String [][] pm = new String [8][8];
        //  >/
        for (int i = 0; x + i < 8 && y + i < 8; i ++){
            pm [x + i] [y + i] = "o";
        }
        // <\
        for (int i = 0; x - i < 8 && y + i < 8; i ++){
            pm [x - i] [y + i] = "o";
        }
        // >\
        for (int i = 0; x + i < 8 && y - i < 8; i ++){
            pm [x + i] [y - i] = "o";
        }
        // </
        for (int i = 0; x - i < 8 && y - i < 8; i ++){
            pm [x - i] [y - i] = "o";
        }
        return pm;

        }

}
