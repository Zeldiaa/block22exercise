import java.awt.*;

/**
 * Created by Niklas on 2016-01-19.
 */
public class Square extends Polygon {
    Square(int x, int y) {
        super(x,y);
    }

    @Override
    public void paint(Graphics g){
        g.drawRect(centerPoint.x - 10, centerPoint.y - 10, 20, 20);
    }

    // TODO: Step 2a: Uncomment this method declaration.
    @Override
    public void overlaps(Polygon other) {
        overlapsHelper("Square", this.toString(), other.toString());
    }

    @Override
    public String toString() {
        return "Square{}";
    }

}
