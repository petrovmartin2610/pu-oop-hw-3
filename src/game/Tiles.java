package game;
import javax.swing.*;
import java.awt.*;
/** @author Martin Petrov
 * Клас, дефиниращ очертанията на самите полета върху игралната дъска
 */


public class Tiles extends JFrame {
    private int row;
    private int col;
    public static int tileSize;

    public Tiles(int row, int col) {
        this.row = row;
        this.col = col;
        this.tileSize = 100;
    }

    int xTile = this.col*this.tileSize;
    int yTile = this.row*this.tileSize;

    public void draw(Graphics g){
        g.setColor(Color.BLACK); g.drawRect(0,0,100,100);
        g.drawRect(100,0,100,100);
        g.drawRect(200,0,100,100);
        g.drawRect(300,0,100,100);
        g.drawRect(400,0,100,100);
        g.drawRect(0,100,100,100);
        g.drawRect(100,100,100,100);
        g.drawRect(200,100,100,100);
        g.drawRect(300,100,100,100);
        g.drawRect(400,100,100,100);
        g.drawRect(0,200,100,100);
        g.drawRect(100,200,100,100);
        g.drawRect(200,200,100,100);
        g.drawRect(300,200,100,100);
        g.drawRect(400,200,100,100);
        g.drawRect(0,300,100,100);
        g.drawRect(100,300,100,100);
        g.drawRect(200,300,100,100);
        g.drawRect(300,300,100,100);
        g.drawRect(400,300,100,100);
        g.drawRect(0,400,100,100);
        g.drawRect(100,400,100,100);
        g.drawRect(200,400,100,100);
        g.drawRect(300,400,100,100);
        g.drawRect(400,400,100,100);
    }

}

