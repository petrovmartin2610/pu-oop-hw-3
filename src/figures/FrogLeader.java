package figures;
import java.awt.*;
/** @author Martin Petrov
 * Клас, дефиниращ параметрите на игралните фигурки ЛИДЕР
 */

public class FrogLeader {
    private int row;
    private int col;


    public FrogLeader(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(30, 425, 50, 50);

        g.setColor(Color.YELLOW);
        g.fillRect(420, 25, 50, 50);
    }

    public void moveFigure(int row, int col) {
        this.row = row;
        this.col = col;
    }
}