import java.awt.*;

/**
 * Created by Niklas on 2016-01-19.
 */
public class Rectangle extends Polygon {
    Rectangle(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "Rectangle{}";
    }

    // TODO: Step 2a: Uncomment this method declaration.
    // @Override
    // public void overlaps(Polygon other) {
    //     overlapsHelper("Rectangle", this.toString(), other.toString());
    // }

    public void paint(Graphics g){
        g.drawRect(centerPoint.x -20, centerPoint.y -10, 40, 20);
    }

}//Polygon
