import javax.swing.*;
import java.awt.*;

/**
 * Created by Niklas on 2016-01-19.
 */
public abstract class Polygon extends JComponent{
    Point centerPoint;

    private Polygon(Point center){
        this.centerPoint = center;
    }
    public Polygon(int x, int y){
        this(new Point(x,y));
    }

    @Override
    public String toString(){
        return "Polygon{}";
    }

    // TODO: Step 1a: Understand this method declaration and its helper.
    public void overlaps(Polygon other){
        overlapsHelper("Polygon", this.toString(), other.toString());
    }
    static void overlapsHelper(String className, String thisType, String otherType){
        System.out.println("" + className + ".overlaps: " + thisType + " vs " + otherType);
    }

    @Override
    public abstract void paint(Graphics g);
}//Polygon
