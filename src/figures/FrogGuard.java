package figures;
import java.awt.*;
/** @author Martin Petrov
 * Клас, дефиниращ параметрите на игралните фигурки ГАРД
 */

public class FrogGuard {
    private int row;
    private int col;


    public FrogGuard(int row, int col){
        this.row=row;
        this.col=col;
    }

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }

    public void draw(Graphics g){
        g.setColor(Color.GREEN);
        g.fillOval(125,425,50,50);

        g.setColor(Color.GREEN);
        g.fillOval(225,425,50,50);

        g.setColor(Color.GREEN);
        g.fillOval(325,425,50,50);

        g.setColor(Color.GREEN);
        g.fillOval(425,425,50,50);

        g.setColor(Color.YELLOW);
        g.fillOval(325,25,50,50);

        g.setColor(Color.YELLOW);
        g.fillOval(225,25,50,50);

        g.setColor(Color.YELLOW);
        g.fillOval(125,25,50,50);

        g.setColor(Color.YELLOW);
        g.fillOval(25,25,50,50);
    }

    public void moveFigure(int row, int col){
        this.row=row;
        this.col=col;
    }
}
