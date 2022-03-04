import java.awt.*;

/**
 * Created by Niklas on 2016-01-19.
 */
public class Triangle extends Polygon {
    Triangle(int x, int y) {
        super(x,y);
    }

    @Override
    public String toString() {
        return "Triangle{}";
    }

    // TODO: Step 2a: Uncomment this overridden method declaration.
    /*
     @Override
     public void overlaps(Polygon other) {
         overlapsHelper("Triangle", this.toString(), other.toString());
     }
    */

    // TODO: Step 4a: Uncomment this overloaded method declaration.
    /*
     public void overlaps(Triangle other) {
         overlapsHelper("Triangle2", this.toString(), other.toString());
     }
    */

    @Override
    public void paint(Graphics g){
        g.drawLine(centerPoint.x, centerPoint.y-10, centerPoint.x-10, centerPoint.y+10);
        g.drawLine(centerPoint.x-10, centerPoint.y+10,
                centerPoint.x+10, centerPoint.y+10);
        g.drawLine(centerPoint.x+10, centerPoint.y+10, centerPoint.x, centerPoint.y-10);
    }
}
