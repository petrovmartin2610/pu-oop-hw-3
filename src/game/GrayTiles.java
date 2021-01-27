package game;
import java.awt.*;
/** @author Martin Petrov
 * Клас, дефиниращ параметрите на сивите полета на игралната дъска
 */

public class GrayTiles {
    private int row;
    private int col;

    public GrayTiles(int row, int col){
        this.row=row;
        this.col=col;
    }

    public void draw(Graphics g){
        g.setColor(Color.GRAY);
        g.fillRect(0,100,100,100);
        g.fillRect(100,100,100,100);
        g.fillRect(300,100,100,100);
        g.fillRect(400,100,100,100);
        g.fillRect(0,300,100,100);
        g.fillRect(100,300,100,100);
        g.fillRect(300,300,100,100);
        g.fillRect(400,300,94,100);
    }
}

