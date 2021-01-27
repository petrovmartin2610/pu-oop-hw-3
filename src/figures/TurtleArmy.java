package figures;
import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;


/** @author Martin Petrov
 * Клас, дефиниращ параметрите на новодошлата армия костенурки в средния ред
 */
public class TurtleArmy {
    public static int result = ThreadLocalRandom.current().nextInt(0, 4 + 1);

    private int row=2;
    private int col;


    public TurtleArmy(int row, int col){
        this.row=row;
        this.col=col;
    }

    public void draw(Graphics g){
        g.setColor(Color.RED);
        g.fillOval(225,225,50,50);
        g.setColor(Color.WHITE);
        g.fillOval(232,232,35,35);
    }
}