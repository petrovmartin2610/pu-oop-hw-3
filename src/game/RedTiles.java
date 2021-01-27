package game;
import java.awt.*;
/** @author Martin Petrov
 * Клас, дефиниращ параметрите на червените полета на игралната дъска
 */

public class RedTiles {
    private int row;
    private int col;

    public RedTiles(int row, int col){
        this.row=row;
        this.col=col;
    }

    public void draw(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(0,0,100,100);
        g.fillRect(400,0,100,100);
        g.fillRect(100,400,100,100);
        g.fillRect(300,400,100,100);
    }
}
