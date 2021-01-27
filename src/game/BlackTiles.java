package game;
import java.awt.*;
/** @author Martin Petrov
 * Клас, дефиниращ параметрите на черните полета на игралната дъска
 */

public class BlackTiles {
    private int row;
    private int col;

    public BlackTiles(int row, int col){
        this.row=row;
        this.col=col;
    }

    public void draw(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(100,0,100,100);
        g.fillRect(300,0,100,100);
        g.fillRect(0,400,100,100);
        g.fillRect(400,400,100,100);
    }
}
