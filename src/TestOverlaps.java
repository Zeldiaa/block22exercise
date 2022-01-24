public class TestOverlaps {
    public static void main(String[] args){
        Square s = new Square(1,1);
        Rectangle r = new Rectangle(1,2);
        Triangle t = new Triangle(1,3);

        Polygon p = new Triangle(1,4);

        s.overlaps(t);
        s.overlaps(s);
        s.overlaps(p);
        p.overlaps(t);
        t.overlaps(t);
        t.overlaps(p);
        p.overlaps(p);
    }
}
