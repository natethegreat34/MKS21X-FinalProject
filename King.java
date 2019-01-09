public class King{

    public String [][] possiblemoves(int x, int y){
        String [][] kpm = new String [8][8];
        // ^
        kpm [x] [y + 1] = "o";
        // />
        kpm [x + 1] [y + 1] = "o";
        // >
        kpm [x + 1] [y] = "o";
        // \>
        kpm [x + 1] [y - 1] = "o";
        // v
        kpm [x] [y - 1] = "o";
        // </
        kpm [x - 1] [y - 1] = "o";
        // <
        kpm [x - 1] [y] = "o";
        // <\
        kpm [x - 1] [y + 1] = "o";
        //Castle Kingside
        kpm [x + 2] [y] = "o";
        //Castle Queenside
        kpm [x - 2] [y] = "o";

        return kpm;
}
