public class Piece{

public Piece();
private String name;
private Location square;

public boolean movable (String name, Location square);
public Location move (String name, Location square);
public boolean incheck (Location square);
public boolean checkmated (Location square);

}
