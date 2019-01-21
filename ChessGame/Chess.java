//API : http://mabe02.github.io/lanterna/apidocs/2.1/
import com.googlecode.lanterna.terminal.Terminal.SGR;
import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.input.Key.Kind;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.Terminal.Color;
import com.googlecode.lanterna.terminal.TerminalSize;
import com.googlecode.lanterna.LanternaException;
import com.googlecode.lanterna.input.CharacterPattern;
import com.googlecode.lanterna.input.InputDecoder;
import com.googlecode.lanterna.input.InputProvider;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.input.KeyMappingProfile;
import com.googlecode.lanterna.screen.*;


public class Chess {
	public char convertIntoPiece(String piece){
		if(piece.equals("p")){
			return '\u265F';
		}
		if(piece.equals("P")){
			return '\u2659';
		}
		if(piece.equals("k")){
			return '\u265A';
		}
		if(piece.equals("K")){
			return '\u2654';
		}
		if(piece.equals("q")){
			return '\u265B';
		}
		if(piece.equals("Q")){
			return '\u2655';
		}
		if(piece.equals("r")){
			return '\u265C';
		}
		if(piece.equals("R")){
			return '\u2656';
		}
		if(piece.equals("b")){
			return '\u265D';
		}
		if(piece.equals("B")){
			return '\u2657';
		}
		if(piece.equals("n")){
			return '\u265E';
		}
		if(piece.equals("N")){
			return '\u2658';
		}
	}
	public static void makeBoard(String[][] chess, Terminal terminal){
		int color = 0;
		for(int y = 0; y < chess.length; y++){
			for(int x = 0; x < chess[y].length; x++){
				if(color == 0){
					terminal.applyBackgroundColor(Terminal.Color.BLACK);
				}
				if(color == 1){
					terminal.applyBackgroundColor(Terminal.Color.WHITE);
				}
				char inpt = convertIntoPiece(chess[y][x]);
				terminal.moveCursor(x + 28, y + 28);
				terminal.putCharacter(inpt);
				color += 1;
				color = color%2;
			}
		}
	}
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int mode = 1;
		Terminal terminal = TerminalFacade.createTextTerminal();
		terminal.enterPrivateMode();
		TerminalSize size = terminal.getTerminalSize();
		terminal.setCursorVisible(false);
		Screen s = new Screen(terminal);
		boolean running = true;
		long tStart = System.currentTimeMillis();
		long lastSecond = 0;

		while(running){
			s.startScreen();
      Key key = terminal.readInput();
			if (mode == 1){
				s.clear();
				Chessboard chess = new Chessboard();
        chess.newGame("lanternatest");
				Chess.makeBoard(chess.getData(), terminal);
        s.refresh();
			}
      if (key.getKind() == Key.Kind.Escape) {
        s.stopScreen();
        terminal.exitPrivateMode();
        running = false;
      }
		}
	}
}
