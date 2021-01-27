package figures;
import java.awt.*;
/** @author Martin Petrov
 * Клас, дефиниращ параметрите на сивото кръгче в средата на игралната дъска
 */
public class CenterFrogCircle {
    private int row;
    private int col;

    public CenterFrogCircle(int row, int col){
        this.row=row;
        this.col=col;
    }

    public void draw(Graphics g){
        g.setColor(Color.GRAY);
        g.fillOval(225,225,50,50);
    }
}
